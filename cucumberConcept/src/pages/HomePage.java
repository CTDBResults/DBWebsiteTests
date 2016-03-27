package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage {
	WebDriver driver;
	 //#############################################################################
	  @FindBy(id="BootstrapTheme_wt46_block_wtMainContent_wt24")
		public WebElement view_our_services;

	 @FindBy(xpath ="//*[text()='submit']")
		public WebElement submitButton;
	     
	
	 @FindBy(xpath ="//*[text()='Contact']")
		public WebElement contactLink;
	  
	 @FindBy(xpath ="//*[text()='Projects']")
		public WebElement projectsLink;
	 
	 @FindBy(xpath ="//*[text()='About Us']")
		public WebElement aboutUs;
	 
	 @FindBy(xpath ="//*[text()='Our Services']")
		public WebElement ourServices;
	 
	  //###############################################################################
	
	
		 //constructor
		 public HomePage (WebDriver dr){
				driver = dr;
				}

	public void click_on_submit(String arg1)
	{
		 String SubmitButton = submitButton.getText();
      DBUtilities.checkElement(arg1, SubmitButton);
      DBUtilities.checkElementPresentMessage(arg1);
      submitButton.click();
	
		
	}
	

	
	public void clickOnLink(String arg1) throws InterruptedException
	
	{

	
	
	if (arg1.equals("Contact"))
	{
	contactLink.click();
	DBUtilities.actionPerformedClick(arg1);
	Thread.sleep(1000);
	}
	if (arg1.equals("Projects"))
	{
		projectsLink.click();
	DBUtilities.actionPerformedClick(arg1);
		Thread.sleep(1000);
	}	
		if (arg1.equals("About Us"))
		{
			aboutUs.click();
		DBUtilities.actionPerformedClick(arg1);
			Thread.sleep(1000);	
		}
		
		if (arg1.equals("Our Services"))
		{
			ourServices.click();
		DBUtilities.actionPerformedClick(arg1);
			Thread.sleep(1000);	
		}
	}
	
	}

