package utills;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;

	
	public WebDriver webDriverManager() throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		prop.load(fis);
		String browser = System.getProperty("browser") != null ? System.getProperty("browser"):prop.getProperty("browser");
		if(driver == null) {
			if(browser.equalsIgnoreCase("chrome")) 
            {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\satheess\\Driver_for_selenium\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				driver= new ChromeDriver();
				
			}
            else if(browser.equalsIgnoreCase("FireFox")) {
            	System.setProperty("webdriver.gecko.driver","C:\\Users\\satheess\\Driver_for_selenium\\firefox\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
            	driver = new FirefoxDriver();
            	
            }
            else if(browser.equalsIgnoreCase("Edge")) {
            	System.setProperty("webdriver.edge.driver","C:\\Users\\satheess\\Driver_for_selenium\\Edge\\edgedriver_win32\\msedgedriver.exe");
            	driver = new EdgeDriver();
            	
            }
            else {
            	throw new IllegalArgumentException("Unsupported browser: " + browser);
            	
            }
			driver.manage().window().maximize();
			
			String url = prop.getProperty("QAUrl");
			driver.get(url);

		return driver;
		}
		
		return driver;
	}
	

	

}
