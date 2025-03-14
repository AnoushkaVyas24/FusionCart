package com.project.FusionCart.service;

import com.project.FusionCart.entity.Category;
import com.project.FusionCart.payloads.CategoryDTO;
import com.project.FusionCart.payloads.CategoryResponse;

public interface CategoryService {
    CategoryDTO createCategory(Category category);

    CategoryResponse getCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    CategoryDTO updateCategory(Category category, Long categoryId);

    String deleteCategory(Long categoryId);
}
