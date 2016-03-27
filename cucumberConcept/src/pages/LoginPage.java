package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	WebDriver driver = null;
	
	 public LoginPage (WebDriver dr){
			driver = dr;
			}

	 
	  public HomePage navigateTo() throws InterruptedException {
		  driver.get("http://dbdigital.stg.dbresults.com.au/cola/");
		  return PageFactory.initElements(driver, HomePage.class);
		  }

	
	
}
	

