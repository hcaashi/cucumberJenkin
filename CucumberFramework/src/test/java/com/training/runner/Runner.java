package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
		                            "json:target/cucumber-reports/cucumber.json"},
                 features="C:\\workspaces\\Sept2022\\CucumberFramework\\resources\\SalesForceGeneric.feature",
                 glue= {"com.training.steps"})

public class Runner {

}
