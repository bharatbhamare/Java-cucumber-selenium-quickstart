package com.triarq.qpathways.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\com\\triarq\\qpathways\\features", glue = {"com.triarq.qpathways.definations"})
public class Runner {

}
