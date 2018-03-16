package com.creditsesame.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumberHtmlReport",
                "json:target/cucumber-report.json"
        },
        glue = {"com/creditsesame/steps"},
        features = "src/test/java/com/creditsesame/histories/format3.feature",
        tags = {"@test8"}
)
public class TestRunner {

}
