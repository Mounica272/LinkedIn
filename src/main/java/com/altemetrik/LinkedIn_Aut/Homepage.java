package com.altemetrik.LinkedIn_Aut;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public  class Homepage
{
	WebDriver driver;
@FindBy(xpath="//input[@placeholder='Search']")
WebElement search;

@FindBy(xpath="//span[text()='Clear ']")
WebElement clear;

@FindBy(xpath="//span[text()='Clear ']/span")
WebElement clear_count;

@FindBy(xpath="//button[@aria-controls='experience-level-facet-values']")
WebElement exp_dropdown;

@FindBy(xpath="//span[text()='Mid-Senior level']")
WebElement midlevel;

@FindBy(xpath="//span[text()='All filters']")
WebElement allfilters;

@FindBy(xpath="//span[text()='Full-time']")
WebElement fulltime;

public Homepage(WebDriver driver) 
{
	this.driver = driver;
	//this.driver=Driver.getDriver();
	PageFactory.initElements(driver, this);
		
}


public void clicksales() throws Exception
{
	search.click();
	Thread.sleep(2000);
	search.sendKeys("sales");
	Thread.sleep(3000);
	search.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER));
}

public void verifyingfilter()
{
	try
	{
		if(clear.isDisplayed())
		{
			System.out.println("Filter is selected");
		}
	}
	catch(Exception e)
	{
	System.out.println("No filter is applied");
	}
}


public void clickmidsenior() throws Exception
{
	System.out.println("Clicking on exp dropdown");
	Thread.sleep(2000);
	exp_dropdown.click();
	Thread.sleep(1000);
	System.out.println("Clicking on Mid Senior Level");
	midlevel.click();
	//midlevel.sendKeys(Keys.ENTER);
	//Thread.sleep(2000);
	//search.click();

	System.out.println("validating clear filter");
	Assert.assertEquals(clear_count.getText(), "1");
	Thread.sleep(2000);
	System.out.println("Clicking on all filters");
    allfilters.click();
    Thread.sleep(2000);
    allfilters.click();
    Thread.sleep(3000);
	System.out.println("Clicking on full time job");
    fulltime.click();
	System.out.println("validating clear filter");
    Assert.assertEquals(clear_count.getText(), "2");
	
	
	
	
}

}
