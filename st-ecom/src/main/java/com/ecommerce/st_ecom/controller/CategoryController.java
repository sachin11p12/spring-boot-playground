package com.ecommerce.st_ecom.controller;


import com.ecommerce.st_ecom.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController         // Marks this class as a REST API controller that handles HTTP requests.
public class CategoryController {

    private List<Category> categories = new ArrayList<>();   // In-memory list used to store category objects.

    @GetMapping("api/public/categories")     // Handles HTTP GET requests to retrieve all categories.
    public List<Category> getAllCategories(){
        return categories;
    }

    @PostMapping("api/public/categories")    // Handles HTTP POST requests to create a new category.
    public String createCategory(@RequestBody Category category){   // @RequestBody converts JSON request data into a Category object.
        categories.add(category);
        return "Category Added Successfully ";

    }
}
