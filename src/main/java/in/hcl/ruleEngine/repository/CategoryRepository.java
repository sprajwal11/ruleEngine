package in.hcl.ruleEngine.repository;

import in.hcl.ruleEngine.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
