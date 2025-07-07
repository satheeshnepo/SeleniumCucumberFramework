package utills;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void switchToChildWindow() {
			   Set<String> windows = this.driver.getWindowHandles();
			   Iterator<String> iter = windows.iterator();
			   List<String> childWindows = new ArrayList<>();
			   while(iter.hasNext()) {
				   childWindows.add((String) iter.next());
			   }
			   this.driver.switchTo().window(childWindows.get(1));
	}
	public void quitTheDriver() {
		driver.quit();
		
	}
}
