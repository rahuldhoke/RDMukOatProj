package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyValidLogin {
	
	WebDriver driver;
	
	public void startbrowser() {
		driver = new ChromeDriver();
		 System.out.println("done");
		  driver.get("https://www.spicejet.com/");
		  
	}

}
