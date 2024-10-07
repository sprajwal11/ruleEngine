package in.hcl.ruleEngine.service;

import in.hcl.ruleEngine.entity.CustomRule;
import in.hcl.ruleEngine.repository.CustomRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomRuleService {

    @Autowired
    private CustomRuleRepository customRuleRepository;

    public CustomRule createRule(CustomRule rule) {
        return customRuleRepository.save(rule);
    }

    public List<CustomRule> getAllRules() {
        return customRuleRepository.findAll();
    }
}
