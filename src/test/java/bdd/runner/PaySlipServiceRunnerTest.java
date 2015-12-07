package bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        features = "classpath:cucumber/payslip.feature",
        glue = {"com.myob.payslip.bdd"}
)
public class PaySlipServiceRunnerTest {
}
