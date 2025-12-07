package com.onlineordersystem.onlineordersystem.service.Category;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineordersystem.onlineordersystem.entity.Category;
import com.onlineordersystem.onlineordersystem.exception.ControllerExceptionHandler.ResourceNotFoundHandler;
import com.onlineordersystem.onlineordersystem.repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);
    

    @Override
    public List<Category> getAllCategory() {
        logger.info("calling getAllCategory() ");
        return categoryRepo.findAll();
    }

    @Override
    public Category getCategory(int categoryId) {
        return categoryRepo.findById(categoryId).orElseThrow(
        () -> new ResourceNotFoundHandler("No category present with id "+categoryId));
    }

    @Override
    public String addCategory(List<Category> category) {
        categoryRepo.saveAll(category);
        return "Added Successfully";
    }

    @Override
    public String updateCategory(int categoryId, Category category) {
        Category newCategory = categoryRepo.findById(categoryId).get();
        newCategory.setCategoryName(category.getCategoryName());
        newCategory.setDateAdded(category.getDateAdded());
        newCategory.setLastUpdate(category.getLastUpdate());
        categoryRepo.save(newCategory);

        return null;
    }

    @Override
    public String deleteCategory(int categoryId) {
        categoryRepo.delete(categoryRepo.findById(categoryId).get());
        return "Successfully Deleted Category Id:- " + categoryId;
    }

}
