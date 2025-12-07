package com.onlineordersystem.onlineordersystem.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "Customer")
public class Customer {
    @Column
    private String userName;
    @Id
    @Column
    private String mobileNumber;
    @Column
    private Date dateAdded;
    @Column
    private Date lastUpdate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId", referencedColumnName = "mobileNumber")
    private List<Order> orders;

    
    public Customer() {
    }

   
    public Customer(String userName, String mobileNumber, Date dateAdded, Date lastUpdate) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.dateAdded = dateAdded;
        this.lastUpdate = lastUpdate;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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
