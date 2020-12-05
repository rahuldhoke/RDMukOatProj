package com.wordpress.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

import Helper.BrowserFactory;

public class LoginFunctionalityTest {
	
	@Test
	//This will launch the browser using the login method
	public void startbrowser() {
		WebDriver driver = BrowserFactory.startBrowser("Chrome", "https:www.facebook.com");
		LoginPage Login_Page = PageFactory.initElements(driver, LoginPage.class); 
			// above -- this statments teslll provide when page objects u wan to load and which class/method u want to load
			// above will also return page object of that particualr page. hence we have to create object															
			//using this above object ---LoginPage Login_Page -- We can call all the methods
		Login_Page.login();
	} 


}
