package in.hcl.ruleEngine.service;

import in.hcl.ruleEngine.entity.Category;
import in.hcl.ruleEngine.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> saveCategories(List<Category> categories) {
        return categoryRepository.saveAll(categories);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}

