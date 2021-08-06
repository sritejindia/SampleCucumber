package com.testdemo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/report2.json"}, features = {"src/test/resources/com/testdemo/Sample2.feature"}, strict = true )
public class RunCucumberTest2 {
}
