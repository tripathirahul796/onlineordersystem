package com.onlineordersystem.onlineordersystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineordersystem.onlineordersystem.entity.Product;
import com.onlineordersystem.onlineordersystem.service.Product.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductServiceImpl productsServiceImpl;

    @GetMapping("/")
    public List<Product> getAllProducts() {
        return productsServiceImpl.getAllProducts();

    }

    @GetMapping("/{productId}")
    public Product getProducts(@PathVariable int productId) {
        return productsServiceImpl.getProduct(productId);
    }

    @GetMapping("/add")
    public String addProducts(List<Product> products) {
        return productsServiceImpl.addProducts(products);
    }

}
