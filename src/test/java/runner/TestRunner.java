package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/test/Resources/features",
        glue = {"src/test/java/org/opecart/stepsdefs"}
        ,monochrome=true
)
public class TestRunner {
}
