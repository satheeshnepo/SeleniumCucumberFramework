package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Types of reports can be generated in java cucumber 
//1.html
//2.json
//3.junit
//4.extent
@CucumberOptions(features="C:\\JavaSeleniumCucumberAutomationBDD\\RealAutomationBDDCucumber\\src\\test\\java\\features",glue="stepdefinitions",monochrome=true,tags=("@OfferPage or @CheckOut"),
plugin= {"html:C:\\JavaSeleniumCucumberAutomationBDD\\RealAutomationBDDCucumber\\target\\cucumber.html","json:C:\\JavaSeleniumCucumberAutomationBDD\\RealAutomationBDDCucumber\\target\\cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})
public class TestNgRunner extends AbstractTestNGCucumberTests{
	
	
//	
//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}


}
