package com.sunglowsys.controllers;

import com.sunglowsys.payloads.ApiResponse;
import com.sunglowsys.payloads.CategoryDto;
import com.sunglowsys.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/")
    public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto) {
       CategoryDto createCategory = this.categoryService.createCategory(categoryDto);
       return new ResponseEntity<CategoryDto>(createCategory, HttpStatus.CREATED);
    }
    @PutMapping("/{catId}")
    public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto, @PathVariable Integer catId) {
        CategoryDto updateCategory = this.categoryService.updateCategory(categoryDto,catId);
        return new ResponseEntity<CategoryDto>(updateCategory, HttpStatus.OK);
    }
    @DeleteMapping("/{catId}")
    public ResponseEntity<ApiResponse> deleteCategory(@PathVariable Integer catId) {
        this.categoryService.deleteCategory(catId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Category is Deleted Successfully !!",true),HttpStatus.OK);

    }
    @GetMapping("/{catId}")
    public ResponseEntity<CategoryDto> getSingleCategory(@PathVariable Integer catId) {
        CategoryDto categoryDto = this.categoryService.getCategory(catId);
        return new ResponseEntity<CategoryDto>(categoryDto, HttpStatus.OK);
    }
    @GetMapping("/")
    public ResponseEntity<List<CategoryDto>> getAllCategory() {
        List<CategoryDto> categories = this.categoryService.getAllCategories();
        return ResponseEntity.ok(categories);
    }
}
