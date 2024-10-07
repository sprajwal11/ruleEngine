package in.hcl.ruleEngine.service;

import in.hcl.ruleEngine.entity.SubCategory;
import in.hcl.ruleEngine.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    public SubCategory saveSubCategory(SubCategory subCategory) {
        return subCategoryRepository.save(subCategory);
    }

    public List<SubCategory> saveSubCategories(List<SubCategory> subCategories) {
        return subCategoryRepository.saveAll(subCategories);
    }

    public List<SubCategory> getAllSubCategories() {
        return subCategoryRepository.findAll();
    }
}
