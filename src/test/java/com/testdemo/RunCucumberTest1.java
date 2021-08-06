package com.testdemo;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/report1.json"}, features = {"src/test/resources/com/testdemo/Sample.feature"}, strict = true )
public class RunCucumberTest1 {
}
