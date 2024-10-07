package in.hcl.ruleEngine.controller;

import in.hcl.ruleEngine.entity.Category;
import in.hcl.ruleEngine.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/single")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @PostMapping("/bulk")
    public List<Category> createCategories(@RequestBody List<Category> categories) {
        return categoryService.saveCategories(categories);
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
}
