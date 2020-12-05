package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	
	 public static WebDriver startBrowser(String BrwName,String url) {
		 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium Chromedriver\\chromedriver.exe");  
		 
		 if (BrwName.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
			 driver.get(url);
			 driver.manage().window().maximize();
		 
		 }
		 return driver; 
	 }

}
