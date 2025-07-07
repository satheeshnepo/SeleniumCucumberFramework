package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Types of reports can be generated in java cucumber 
//1.html
//2.json
//3.junit
//4.extent
@CucumberOptions(features="@target/failed_scenarios.txt",glue="stepdefinitions",monochrome=true,tags=("@OfferPage"),
plugin= {"html:C:\\JavaSeleniumCucumberAutomationBDD\\RealAutomationBDDCucumber\\target\\cucumber.html","json:C:\\JavaSeleniumCucumberAutomationBDD\\RealAutomationBDDCucumber\\target\\cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedTestRunner extends AbstractTestNGCucumberTests{
	
	
//	
//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}


}

