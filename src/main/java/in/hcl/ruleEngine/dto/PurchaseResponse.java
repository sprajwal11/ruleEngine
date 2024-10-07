package in.hcl.ruleEngine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseResponse {
    private String productName;
    private int quantity;
    private double originalPrice;
    private double discountPercentage;
    private double discountedPrice;
    private double finalPrice;
}
