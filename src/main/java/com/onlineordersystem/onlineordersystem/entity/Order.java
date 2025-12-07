package com.onlineordersystem.onlineordersystem.entity;


import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "Orders")
public class Order {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int orderId;
    @Column
    private int quantity; 
    @Column
    private int status;
    @Column
    private Date dateAdded;
    @Column
    private Date lastUpDate;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<Product> products;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mobileNumber")
    private Customer customer;



    public Order() {
    }

    public Order(int orderId, int quantity, int status, Date dateAdded, Date lastUpDate) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.status = status;
        this.dateAdded = dateAdded;
        this.lastUpDate = lastUpDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getLastUpDate() {
        return lastUpDate;
    }

    public void setLastUpDate(Date lastUpDate) {
        this.lastUpDate = lastUpDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    
    
  
    
}
