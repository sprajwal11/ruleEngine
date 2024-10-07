package in.hcl.ruleEngine.controller;

import in.hcl.ruleEngine.entity.PriceRule;
import in.hcl.ruleEngine.entity.Product;
import in.hcl.ruleEngine.service.SampleDataService;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pricing")
public class PriceController {

//    @Autowired
//    private SampleDataService sampleDataService;
//
//    @Autowired
//    private KieSession kieSession;
//
//    @GetMapping("/products")
//    public List<Product> getProducts() {
//        return sampleDataService.getAllProducts();
//    }
//
//    @PostMapping("/rules")
//    public String addPriceRule(@RequestBody PriceRule priceRule) {
//        sampleDataService.addPriceRule(priceRule);
//        return "Rule added successfully!";
//    }
//
//    @PostMapping("/apply")
//    public List<Product> applyPricingRules() {
//        List<Product> products = sampleDataService.getAllProducts();
//        List<PriceRule> priceRules = sampleDataService.getAllPriceRules();
//
//        // Insert rules and products into the Drools session
//        for (PriceRule priceRule : priceRules) {
//            kieSession.insert(priceRule);
//        }
//
//        for (Product product : products) {
//            kieSession.insert(product);
//        }
//
//        // Fire all rules
//        kieSession.fireAllRules();
//
//        return products; // Return products with modified prices
//    }
}

