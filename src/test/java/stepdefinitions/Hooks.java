package stepdefinitions;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utills.TestContextSetup;

public class Hooks {
	TestContextSetup testContextSetup;
    public Hooks(TestContextSetup testContextSetup) {
    	this.testContextSetup = testContextSetup;
    	
    }
    
    @After
    public void tearDown() throws Exception{
    	testContextSetup.testBase.webDriverManager().quit();
    }
    
    @AfterStep
    public void getScreenShot(Scenario scenario) throws Exception {
    	if(scenario.isFailed()) {
    	WebDriver driver = testContextSetup.testBase.webDriverManager();
    	File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    	File destination = new File(System.getProperty("user.dir")+"\\test-extent-output\\SparkReport\\Screenshots\\error.png");
//    	FileUtils.copyFile(sourceFile, destination);
    	byte[] value = FileUtils.readFileToByteArray(sourceFile);
    	scenario.attach(value, "image/png","image");
    	}
  
    	
    }

}
