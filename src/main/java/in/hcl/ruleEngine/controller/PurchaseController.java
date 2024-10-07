package in.hcl.ruleEngine.controller;

import in.hcl.ruleEngine.dto.ProductPurchaseRequest;
import in.hcl.ruleEngine.dto.PurchaseSummaryResponse;
import in.hcl.ruleEngine.service.PurchaseService; // Import the PurchaseService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService; // Autowire the PurchaseService

    @PostMapping
    public PurchaseSummaryResponse purchaseProducts(@RequestBody List<ProductPurchaseRequest> requests) {
        return purchaseService.applyDiscounts(requests); // Call the method to apply discounts
    }
}
