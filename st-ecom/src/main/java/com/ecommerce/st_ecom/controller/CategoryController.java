package com.ecommerce.st_ecom.controller;


import com.ecommerce.st_ecom.model.Category;
import com.ecommerce.st_ecom.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController         // Marks this class as a REST API controller that handles HTTP requests.
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("api/public/categories")     // Handles HTTP GET requests to retrieve all categories.
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("api/public/categories")    // Handles HTTP POST requests to create a new category.
    public String createCategory(@RequestBody Category category){   // @RequestBody converts JSON request data into a Category object.
        categoryService.createCategory(category);
        return "Category Added Successfully ";

    }
}
