package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;

public class ProjectsPage {

	WebDriver driver;
	
	 //#############################################################################
	 @FindBy(xpath ="//*[contains(text(),'LEARN MORE')]")
	 public List<WebElement> learn_more_about_rest;

	 @FindBy(xpath ="//*[contains(text(),'REST entrusted DB Results to be their digital services partner. ')]")
	 public WebElement restProjectDetails;
	
		
	 @FindBy(xpath ="//*[contains(text(),'First Australian implementation of new AASB15 accounting standards for iconic legal services company')]")
	 public WebElement firstAustralianProjectDetails;
	 
	 @FindBy(xpath ="//*[contains(text(),'REST entrusted DB Results to be their digital services partner. ')]")
	 public WebElement victorianElectricityProjectDetails;

	 
	 //###############################################################################
	
	
		 //constructor
		 public ProjectsPage (WebDriver dr){
				driver = dr;
				}

		
     public void clickLearnMoreButton(String arg1) throws InterruptedException
     {

    	 List<WebElement> LEARN_MORE= learn_more_about_rest ;
    	 	if (arg1.equals("REST"))
        	 	LEARN_MORE.get(0).sendKeys(Keys.RETURN);
    	 	if (arg1.equals("FIRST AUSTRALIAN"))
    	 		LEARN_MORE.get(1).sendKeys(Keys.RETURN);
    	 	if (arg1.equals("Victorian electricity distributor"))
    	 		LEARN_MORE.get(2).sendKeys(Keys.RETURN);
    	 	if (arg1.equals("A leading Australian financial services institution"))
    	 		LEARN_MORE.get(3).sendKeys(Keys.RETURN);
    	 	if (arg1.equals("Well-known Australian brand"))
    	 		LEARN_MORE.get(4).sendKeys(Keys.RETURN);
    	 
     }
   
     
//     public void checkElement (String arg1, String arg2) throws InterruptedException
//     {
//	DBUtilities.checkElement(arg1,arg2);
//      System.out.println("element exist as" +arg2);
//      Thread.sleep(3000);
//     }
     
     public void checkMessage (String arg1, String arg2)
 	{
    	 if (arg1 =="REST"){
    	 String readMessage = restProjectDetails.getText();
 		DBUtilities.checkMessage(readMessage, arg2);
    	 }
    	 
    	 
    	 if (arg1 =="FIRST AUSTRALIAN"){
        	 String readMessage = firstAustralianProjectDetails.getText();
     		DBUtilities.checkMessage(readMessage, arg2);
        	 }
    	 
    	 if (arg1 =="Victorian electricity distributor"){
        	 String readMessage = victorianElectricityProjectDetails.getText();
     		DBUtilities.checkMessage(readMessage, arg2);
 		}
 	}
}


