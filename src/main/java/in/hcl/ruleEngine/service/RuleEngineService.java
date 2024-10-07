package in.hcl.ruleEngine.service;

import in.hcl.ruleEngine.dto.PurchaseResponse;
import in.hcl.ruleEngine.entity.CustomRule;
import in.hcl.ruleEngine.entity.Product;
import in.hcl.ruleEngine.repository.CustomRuleRepository;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.utils.KieHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleEngineService {

    private final CustomRuleRepository customRuleRepository;

    public RuleEngineService(CustomRuleRepository customRuleRepository) {
        this.customRuleRepository = customRuleRepository;
    }

    public PurchaseResponse applyRules(Product product, int quantity) {
        double originalPrice = product.getPrice();
        double discountPercentage = product.getDiscount(); // Assuming you have a discount field in Product
        double discount = originalPrice * (discountPercentage / 100);
        double discountedPrice = originalPrice - discount;
        double finalPrice = discountedPrice * quantity;

        return new PurchaseResponse(
                product.getProductName(),
                quantity,
                originalPrice,
                discountPercentage,
                discountedPrice,
                finalPrice
        );
    }
}
