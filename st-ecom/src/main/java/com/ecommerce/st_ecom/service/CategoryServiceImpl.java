package com.ecommerce.st_ecom.service;

import com.ecommerce.st_ecom.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService{

    private List<Category> categories = new ArrayList<>();   // In-memory list used to store category objects.

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        categories.add(category);
    }
}
