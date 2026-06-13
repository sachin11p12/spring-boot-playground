package com.ecommerce.st_ecom.model;

public class Category {
    private long categorId;
    private String categoryName;

    public Category(long categorId, String categoryName) {
        this.categorId = categorId;
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public long getCategorId() {
        return categorId;
    }

    public void setCategorId(long categorId) {
        this.categorId = categorId;
    }
}
