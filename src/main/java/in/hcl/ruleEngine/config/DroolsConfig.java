package in.hcl.ruleEngine.config;

import in.hcl.ruleEngine.entity.CustomRule;
import in.hcl.ruleEngine.repository.CustomRuleRepository; // Import your repository
import org.drools.compiler.kie.builder.impl.KieFileSystemImpl;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DroolsConfig {

    @Autowired
    private CustomRuleRepository customRuleRepository; // Autowire the repository

    @Bean
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();
        KieFileSystemImpl kieFileSystem = (KieFileSystemImpl) kieServices.newKieFileSystem();

        // Load rules from the database
        List<CustomRule> rules = customRuleRepository.findAll(); // Fetch all rules from the repository
        for (CustomRule rule : rules) {
            kieFileSystem.write(ResourceFactory.newByteArrayResource(rule.getRuleContent().getBytes())
                    .setSourcePath("src/main/resources/rules/" + rule.getRuleName() + ".drl"));
        }

        kieServices.newKieBuilder(kieFileSystem).buildAll();
        return kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
    }

    @Bean
    public KieSession kieSession() {
        return kieContainer().newKieSession();
    }
}
