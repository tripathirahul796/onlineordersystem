package com.onlineordersystem.onlineordersystem.entity;


import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="Category")
public class Category {
   
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column
    private int categoryId;
    @Column
    private String categoryName;
    @Column
    private Date dateAdded;
    @Column
    private Date lastUpdate;

    /* 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName = "productId")
    private Product product;
    */
    @OneToMany(mappedBy = "category")
    private List<Product> product;
    
    public Category() {
    }



    public Category(int categoryId, String categoryName, Date dateAdded, Date lastUpdate) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.dateAdded = dateAdded;
        this.lastUpdate = lastUpdate;
    }



    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
