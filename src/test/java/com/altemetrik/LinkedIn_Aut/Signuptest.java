package com.altemetrik.LinkedIn_Aut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Signuptest 
{
	public static WebDriver driver;
	Signuppage signup;

    @Test
    public void launchsite() throws Exception
    {
    	System.out.println("---------Signup test----------");
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    	driver=new ChromeDriver();
    	System.out.println("launching site");
    	driver.get("https://www.linkedin.com");
    	
    	
    }
    
    @Test(dependsOnMethods={"launchsite"})
    public void signuptest() throws Exception
    {
    	System.out.println("Clicking on Join now");
    	driver.findElement(By.xpath("//a[text()='Join now']")).click();
    	Thread.sleep(3000);
    	signup = new Signuppage(driver);
    	signup.enteremail();
    	signup.enterpassword();
    	signup.clicksubmit();
    	
    }
    
}