package com.ecommerce.st_ecom.service;

import com.ecommerce.st_ecom.model.Category;

import java.util.List;

public interface CategoryService {   // using interface to promote Loosecoupling and modularity

    List<Category> getAllCategories();
    void createCategory(Category category);
}
