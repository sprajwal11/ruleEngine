package in.hcl.ruleEngine.controller;

import in.hcl.ruleEngine.entity.SubCategory;
import in.hcl.ruleEngine.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subcategories")
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;

    // Endpoint to create a single subcategory
    @PostMapping("/single")
    public SubCategory createSubCategory(@RequestBody SubCategory subCategory) {
        return subCategoryService.saveSubCategory(subCategory);
    }

    // Endpoint to create multiple subcategories in bulk
    @PostMapping("/bulk")
    public List<SubCategory> createSubCategories(@RequestBody List<SubCategory> subCategories) {
        return subCategoryService.saveSubCategories(subCategories);
    }

    // Endpoint to get all subcategories
    @GetMapping
    public List<SubCategory> getAllSubCategories() {
        return subCategoryService.getAllSubCategories();
    }
}
