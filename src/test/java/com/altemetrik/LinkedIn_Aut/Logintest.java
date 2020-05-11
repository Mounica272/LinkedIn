package com.altemetrik.LinkedIn_Aut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Logintest
{
  WebDriver driver;
  Loginpage login;
  Homepage hp;
  
  @Test(dataProvider="getcreds",priority=1)
  public void login(String email, String password) throws Exception
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  System.out.println("launching site");
	  driver.get("https://www.linkedin.com");
	  System.out.println("Clicking on Sign-in");
      driver.findElement(By.xpath("//a[text()='Sign in']")).click(); 
	  login=new Loginpage(driver);
	  Thread.sleep(3000);
	  System.out.println("Entering email id");
	  login.enteremail(email);
	  System.out.println("Entering password");
      login.enterpassword(password);
      System.out.println("Clicking on submit button");
      login.clicksubmit();
      driver.manage().window().maximize();
      Thread.sleep(3000);
      
   }
  

  @Test(priority=2)
  public void salesclick() throws Exception
  {
	  hp=new Homepage(driver);
	  System.out.println("Clicking sales in suggested searches");
	  hp.clicksales();
	  System.out.println("verifying no other filters are applied");
	  hp.verifyingfilter();
	  Thread.sleep(2000);
	  //hp.clickmidsenior();
  }
  
  @Test(priority=3)
  public void validations() throws Exception
  {
	  hp.clickmidsenior();
  }
  
  @Test(priority=4)
  public void logout()
  {
	  System.out.println("All testcases are executed ,closing the driver connection");
	  driver.close();
  }
    
    @DataProvider(name="getcreds")
    public Object[][] getDataFromDataprovider(){
        return new Object[][] 
        	{
                { "testusersample399@gmail.com", "testuser12;" }
       
            };
    }

}
