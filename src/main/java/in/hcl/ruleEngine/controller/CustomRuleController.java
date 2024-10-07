package in.hcl.ruleEngine.controller;

import in.hcl.ruleEngine.entity.CustomRule;
import in.hcl.ruleEngine.repository.CustomRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
public class CustomRuleController {

    @Autowired
    private CustomRuleRepository customRuleRepository;

    @PostMapping("/create")
    public String addCustomRule(@RequestBody CustomRule customRule) {
        customRuleRepository.save(customRule);
        return "Custom rule added successfully!";
    }

    @GetMapping
    public List<CustomRule> getAllRules() {
        return customRuleRepository.findAll();
    }
}
