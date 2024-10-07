package in.hcl.ruleEngine.service;

import in.hcl.ruleEngine.dto.ProductPurchaseRequest;
import in.hcl.ruleEngine.dto.PurchaseResponse;
import in.hcl.ruleEngine.dto.PurchaseSummaryResponse;
import in.hcl.ruleEngine.entity.CustomRule; // Import your CustomRule entity
import in.hcl.ruleEngine.entity.Product; // Import your Product entity
import in.hcl.ruleEngine.repository.CustomRuleRepository; // Import your CustomRule repository
import in.hcl.ruleEngine.repository.ProductRepository; // Import your Product repository
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private KieContainer kieContainer; // Autowire KieContainer

    @Autowired
    private ProductRepository productRepository; // Autowire Product repository

    @Autowired
    private CustomRuleRepository customRuleRepository; // Autowire CustomRule repository

    public PurchaseSummaryResponse applyDiscounts(List<ProductPurchaseRequest> purchaseRequests) {
        List<PurchaseResponse> purchaseResponses = new ArrayList<>();
        double totalPrice = 0;
        double totalSavings = 0;

        // Load rules from the database
        List<CustomRule> customRules = customRuleRepository.findAll();

        for (ProductPurchaseRequest request : purchaseRequests) {
            // Retrieve the product from the database using the productId
            Product product = productRepository.findById(request.getProductId()).orElse(null);

            if (product != null) {
                KieSession kieSession = kieContainer.newKieSession();
                kieSession.insert(product); // Insert the product into the KieSession

                // Insert custom rules into the KieSession
                for (CustomRule rule : customRules) {
                    kieSession.insert(rule);
                }

                // Fire all rules
                kieSession.fireAllRules();

                // After firing rules, calculate the discounted price
                double discount = product.getPrice() * (product.getDiscount() / 100);
                double discountedPrice = product.getPrice() - discount;
                double finalPrice = discountedPrice * request.getQuantity();

                PurchaseResponse response = new PurchaseResponse();
                response.setProductName(product.getProductName());
                response.setQuantity(request.getQuantity());
                response.setOriginalPrice(product.getPrice());
                response.setDiscountPercentage(product.getDiscount());
                response.setDiscountedPrice(discountedPrice);
                response.setFinalPrice(finalPrice);

                purchaseResponses.add(response);

                totalPrice += finalPrice;
                totalSavings += discount * request.getQuantity();
            }
        }

        PurchaseSummaryResponse summary = new PurchaseSummaryResponse(purchaseResponses, totalPrice, totalSavings);
        return summary;
    }
}
