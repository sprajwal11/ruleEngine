package in.hcl.ruleEngine.repository;

import in.hcl.ruleEngine.entity.CustomRule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomRuleRepository extends JpaRepository<CustomRule, Long> {
    List<CustomRule> findByIsActiveTrue(); // Fetch only active rules
}
