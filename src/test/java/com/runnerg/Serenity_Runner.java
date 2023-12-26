package com.runnerg;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(features = "src/test/resources/Serenity_Feature" , glue = "com.stepdefination")
public class Serenity_Runner {

}
