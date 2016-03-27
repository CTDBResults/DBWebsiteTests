package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cucumber.api.DataTable;

public class ContactPage {

	WebDriver driver;
	 //#############################################################################
	
	 @FindBy(xpath ="//*[text()='Name']")
		public WebElement nameField;
	
	 @FindBy(xpath ="//*[text()='Company']")
		public WebElement companyField;
	  
	 @FindBy(xpath ="//*[text()='Email']")
		public WebElement emailField;
	 
	 @FindBy(xpath ="//*[text()='Phone']")
		public WebElement phoneField;
	 
	 @FindBy(xpath ="//*[text()='Message']")
		public WebElement messageField;

	 @FindBy(xpath ="//*[contains(text(),'sent')]")
		public WebElement sentMessage;
	 
	 @FindBy(xpath ="//*[contains(text(),'Melbourne')]")
		public WebElement checkMelbourne;

	 @FindBy(xpath ="//*[contains(text(),'Sydney')]")
		public WebElement checkSydney;
	 
	 //add Melb phone
	 @FindBy(xpath ="//*[contains(text(),'+61 3 8630 0000')]")
		public WebElement checkMelbNo;
	 // add sydney phone
	 @FindBy(xpath ="//*[contains(text(),'1300 130 838')]")
		public WebElement checkSydneyNo;
	 
	 @FindBy(xpath ="//*[contains(text(),'Canberra')]")
		public WebElement checkCanberra;
	 //add canberra phone
	 @FindBy(xpath ="//*[contains(text(),'+61 2 6263 5911')]")
		public WebElement checkCanberraNo;

	 @FindBy(xpath ="//*[contains(text(),'Hong Kong')]")
		public WebElement checkHongKong;
	 //add HK phone
	 @FindBy(xpath ="//*[contains(text(),'+852 3189 7040')]")
		public WebElement checkHongKongNo;
	 
	 
	 
	  //###############################################################################
	
	
		 //constructor
		 public ContactPage (WebDriver dr){
				driver = dr;
				}
// following will read the data as an array from cucumber table
	public void enterName(DataTable table) throws InterruptedException
	{
	
		List<List<String>> data = table.raw();
		nameField.sendKeys(data.get(1).get(1));
	
	}
	
	public void enterCompany (DataTable table) throws InterruptedException
	{
		
		//DBUtilities.checkElement(arg1);
		List<List<String>> data = table.raw();
		companyField.sendKeys(data.get(2).get(1));
		System.out.println("Entering " +table);
	}
	
	public void enterEmail (DataTable table) throws InterruptedException
	{
		//DBUtilities.checkElement(arg1);
		List<List<String>> data = table.raw();
		emailField.sendKeys(data.get(3).get(1));		
	}
	public void enterPhone (DataTable table) throws InterruptedException
	{
		
		//DBUtilities.checkElement(arg1);
		List<List<String>> data = table.raw();
		phoneField.sendKeys(data.get(4).get(1));	
	}
	
	public void enterMessage (DataTable table) throws InterruptedException
	{
		
		//DBUtilities.checkElement(arg1);
		List<List<String>> data = table.raw();
		messageField.sendKeys(data.get(5).get(1));

	}
	
	public void checkSentMessage (String arg1)
	{
		String readSentMessage = sentMessage.getText();
		DBUtilities.checkMessage(arg1,readSentMessage);
	}
	




	public void contactDetails(DataTable table)
	{
		List<List<String>> data = table.raw();
		for(int i=1; i<5; i++)
		{
			String city = data.get(i).get(0);
			String officePhone = data.get(i).get(2);
			//System.out.println(officePhone);
		
			String melb = checkMelbourne.getText();
			String melbNo = checkMelbNo.getText();
			if(i==1){Assert.assertEquals(melb, city);
			Assert.assertEquals(melbNo, officePhone);
			}
			
			String syd = checkSydney.getText();
			String sydNo = checkSydneyNo.getText();
			if(i==2){Assert.assertEquals(syd, city);
			Assert.assertEquals(sydNo, officePhone);
			}
			
			String can = checkCanberra.getText();
			String canNo = checkCanberraNo.getText();
			if(i==3){Assert.assertEquals(can, city);
			Assert.assertEquals(canNo, officePhone);
			}
			
			String hk = checkHongKong.getText();
			String hkNo = checkHongKongNo.getText();
			if(i==4){Assert.assertEquals(hk, city);
			Assert.assertEquals(hkNo, officePhone);
			//TODO
			//assertTrue("hkNo" +hkNo +"officePhone" +officePhone +"are same", hkNo.equals(officePhone);
			
			}
			
			}
		}
	private void assertTrue(String string) {
		// TODO Auto-generated method stub
		
	}
		
	}
			
		
