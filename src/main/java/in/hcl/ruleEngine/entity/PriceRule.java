package in.hcl.ruleEngine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceRule {
    private String ruleId;
    private String categoryId;
    private String subCategoryId;
    private double discountPercentage;
    private int minQuantity;
}
