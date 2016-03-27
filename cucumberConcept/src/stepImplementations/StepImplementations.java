package stepImplementations;

import java.io.File;
import java.text.DateFormat;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AboutUS;
import pages.ContactPage;
import pages.DBUtilities;
import pages.HomePage;
import pages.LoginPage;
import pages.OurServices;
import pages.ProjectsPage;

public class StepImplementations {
	WebDriver driver;


	
	
	@Given("^I am  on DB website$")
	
	public void I_am_on_DB_website() throws Throwable {
		//LoginPage home = new LoginPage(driver);
		LoginPage home = PageFactory.initElements(driver, LoginPage.class);
		home.navigateTo();   
	}
	
	@Given("^I choose to select the link \"([^\"]*)\"$")
	public void I_choose_to_select_the_link(String arg1) throws Throwable {
		HomePage HomePage = PageFactory.initElements(driver, HomePage.class);
		//this is just to click on submit to bring the scroll bar down to enable links on top of screen
		driver.findElement(By.xpath("//*[text()='submit']")).click();
		HomePage HP = PageFactory.initElements(driver, HomePage.class);
		HP.clickOnLink(arg1);
		Thread.sleep(2000);
	}

	@And("^I select the \"([^\"]*)\" button$")
	public void I_select_the_button(String arg1) throws Throwable {
	 Thread.sleep(1000);
		HomePage HomePage = PageFactory.initElements(driver, HomePage.class);
		HomePage.click_on_submit(arg1);
	}
	
	@And("^I select \"([^\"]*)\" link$")
	public void I_select_link(String arg1) throws Throwable {
	HomePage HP = PageFactory.initElements(driver, HomePage.class);
	HP.clickOnLink(arg1);
	Thread.sleep(2000);
	}
	

	@And("^I enter then details as$")
	public void I_enter_then_details_as(DataTable table) throws Throwable {
	ContactPage CP = PageFactory.initElements(driver, ContactPage.class);
	CP.enterName(table);
	CP.enterCompany(table);
	CP.enterEmail(table);
	CP.enterPhone(table);
	CP.enterMessage(table);
	Thread.sleep(2000);
	}


	
	
	@Given("^I want to know more about \"([^\"]*)\" project$")
	public void I_want_to_know_more_about_project(String arg1) throws Throwable {
		ProjectsPage PP = PageFactory.initElements(driver, ProjectsPage.class);
		System.out.println("Selecting Project Option" +arg1);
		PP.clickLearnMoreButton(arg1);

	}
	@Then("^I should see the message as \"([^\"]*)\"$")
	public void I_should_see_the_message_as(String arg1) throws Throwable {
		ContactPage CP = PageFactory.initElements(driver, ContactPage.class);
		Thread.sleep(2000);
		CP.checkSentMessage(arg1);
	}

	@Then("^I should see \"([^\"]*)\" details as \"([^\"]*)\"$")
	public void I_should_see_details_as(String arg1, String arg2) throws Throwable {
		if("Strategy".equals(arg1)){
		ProjectsPage PP = PageFactory.initElements(driver, ProjectsPage.class);
        PP.checkMessage(arg1, arg2);
        OurServices OS = PageFactory.initElements(driver, OurServices.class);
        OS.checkMessage(arg1, arg2);
		}

	}
	
	
	
	@Then("^I should see following \"([^\"]*)\" as \"([^\"]*)\" roles$")
	public void I_should_see_following_as_roles(String arg1, String arg2, DataTable table) throws Throwable {
		AboutUS AU = PageFactory.initElements(driver, AboutUS.class);
		AU.enterName(table);
	}

	@Then("^I should see the \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" on the page$")
	public void I_should_see_the_and_on_the_page(String arg1, String arg2, String arg3, DataTable table) throws Throwable {
		ContactPage CP = PageFactory.initElements(driver, ContactPage.class);
		CP.contactDetails(table);
}
	
	
	@Given("^I want to know more about \"([^\"]*)\" in our services page$")
	public void I_want_to_know_more_about_in_our_services_page(String arg1) throws Throwable {
		
		System.out.println("Selecting Our Services Option" +arg1);
		if("Strategy".equals(arg1)){
			OurServices OS = PageFactory.initElements(driver, OurServices.class);
	       OS.clickLearnMoreButton(arg1);
			}

		
	}
	// take screenshot
	@And("^I store a snapshot of page$")
	
	public void I_take_a_snapshot_of_the_above_page_as_a_record() throws Throwable {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String dnt = DBUtilities.DNT(null);
	System.out.println(dnt);
	FileUtils.copyFile(scrFile, new File(dnt+".jpg"));
        		 
	}

	
	
	  @Before("@shori")
	  public void startUp() {
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	  }

	
	  @After("@shori")
	  public void tearDown() {
	    driver.quit();
	  }
}
	  
	  
