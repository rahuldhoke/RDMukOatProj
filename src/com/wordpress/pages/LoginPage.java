package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
		//Creating constructor
			public void LoginPage(WebDriver ldriver) {
				this.driver = ldriver;
				
			}
	
		//Obj reop of facebook Login
		@FindBy(name="email") // edit box emaid property is name-- error will be gone after u write below line --semicolon is not required // import org.openqa.selenium.support.FindBy;
		WebElement webElt_FBUsername; // this is from properties file -creating webelement
		@CacheLookup  //this method will not check the webelement prperties each time. it will just go to cache memory each time and load the elements
						//use this only when prperties are not changing
		
		@FindBy(name="pass") // edit box password - property is pass for name locator-- error will be gone after u write below line --semicolon is not required // import org.openqa.selenium.support.FindBy;
		WebElement webElt_FBPassword;
		
		//Below xpath I am using it for submit button. this submitt button is defined in confi.properties
		@FindBy(how=How.XPATH,using="//button[@name='login']")
		WebElement webEltBtn_Submit;

		
		//Methds of facebook login
		public void login() {
			webElt_FBUsername.sendKeys("abc");
			webElt_FBPassword.sendKeys("abc");
		
		}

}
