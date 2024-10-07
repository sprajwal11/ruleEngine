package in.hcl.ruleEngine.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOM_RULES")
public class CustomRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleName;

    @Lob
    private String ruleContent;

    @Column(name = "is_active")
    private Boolean isActive;


}
