package com.altemetrik.LinkedIn_Aut;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage 
{
	WebDriver driver;

	
	@FindBy(xpath="//input[@name='email-or-phone']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public Signuppage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}


	public void enteremail() 
	{
		// TODO Auto-generated method stub
		System.out.println("Entering email id");
		email.sendKeys("testusersample399@gmail.com");
	}
	
	public void enterpassword() 
	{
		// TODO Auto-generated method stub
		System.out.println("Entering password");
		password.sendKeys("testuser12;");
	}
	
	public void clicksubmit() 
	{
		// TODO Auto-generated method stub
		System.out.println("Clicking on submit button");
		submit.click();
	}
	
}
	




	


