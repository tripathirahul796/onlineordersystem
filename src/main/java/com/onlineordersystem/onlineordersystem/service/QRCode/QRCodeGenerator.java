package com.onlineordersystem.onlineordersystem.service.QRCode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QRCodeGenerator {

    @Value("${qrImgDir}")
    private String imgDir;

    public void generateQRCode(String data, int tableNum) throws IOException, WriterException {
        int width = 300;
        int height = 300;
        String filePath ="qrcode"+tableNum+".png";
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

        BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, width, height, hints);

        Path path = FileSystems.getDefault().getPath(imgDir+ File.separator+ filePath);
        MatrixToImageWriter.writeToPath(matrix, "PNG", path);
      
    }
}

