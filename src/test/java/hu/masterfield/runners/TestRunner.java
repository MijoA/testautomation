package hu.masterfield.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
                glue ="hu.masterfield.bpgo.steps",
                plugin = {"pretty", "json:target/cucumber-reports.json",
                "junit:target/cucumber-reports.xml",
                "rerun:target/cucumber-rerun.txt"})
public class TestRunner {

}
