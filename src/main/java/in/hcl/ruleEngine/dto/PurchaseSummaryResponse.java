package in.hcl.ruleEngine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class PurchaseSummaryResponse {
    private List<in.hcl.ruleEngine.dto.PurchaseResponse> items;
    private double totalPrice;
    private double totalSavings;
}
