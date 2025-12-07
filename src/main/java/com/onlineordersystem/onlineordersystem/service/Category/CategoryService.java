package com.onlineordersystem.onlineordersystem.service.Category;

import java.util.List;

import com.onlineordersystem.onlineordersystem.entity.Category;

public interface CategoryService {
    public List<Category> getAllCategory();

    public Category getCategory(int categoryId);

    public String addCategory(List<Category> category);

    public String updateCategory(int categoryId,Category category);

    public String deleteCategory(int categoryId);

}
