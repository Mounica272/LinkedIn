package com.altemetrik.LinkedIn_Aut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{

WebDriver driver;

	
	@FindBy(xpath="//input[@id='username']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public Loginpage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}

	public void clicksubmit() throws Exception {
		// TODO Auto-generated method stub
		submit.click();
		Thread.sleep(7000);
		//Driver.setDriver(driver);
//		}
	}

	
	
	public void enterpassword(String pwd) {
		// TODO Auto-generated method stub
		password.sendKeys(pwd);
	}


	public void enteremail(String id) 
	{
		// TODO Auto-generated method stub
		email.sendKeys(id);
		
	}
	
	
}
