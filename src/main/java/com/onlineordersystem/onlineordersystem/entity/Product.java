package com.onlineordersystem.onlineordersystem.entity;


import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Products")
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column
    private int productId;
    @Column
    private String productName;
    @Column
    private double price;
    @Column
    private String quantityType;
    @Column
    private double quantityValue;
    @Column
    private Date dateAdded;
    @Column
    private Date lastUpdate;
   /*
    @OneToOne(mappedBy = "product")
    private Category category;
    */

    @ManyToOne(cascade = CascadeType.ALL)
    private Order order;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId")
    private Category category;

    public Product() {
    }

    public Product(int productId, String productName, double price, String quantityType, double quantityValue,
            Date dateAdded, Date lastUpdate) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityType = quantityType;
        this.quantityValue = quantityValue;
        this.dateAdded = dateAdded;
        this.lastUpdate = lastUpdate;
    }



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuantityType() {
        return quantityType;
    }

    public void setQuantityType(String quantityType) {
        this.quantityType = quantityType;
    }

    public double getQuantityValue() {
        return quantityValue;
    }

    public void setQuantityValue(double quantityValue) {
        this.quantityValue = quantityValue;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

   
    
    
      
}
