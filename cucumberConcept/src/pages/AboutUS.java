package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cucumber.api.DataTable;



public class AboutUS {

	
	WebDriver driver;
	 //#############################################################################
	
	 
	
	@FindBy(xpath ="//*[text()='ANDREW DEAN']")
	public WebElement nameAndy;
	@FindBy(xpath ="//*[text()='GAVIN BUNSHAW']")
	public WebElement nameGav;
	@FindBy(xpath ="//*[text()='SALLY MCLEAN']")
	public WebElement nameSally;
	@FindBy(xpath ="//*[text()='JOHN DEMELIS']")
	public WebElement nameJohn;
	@FindBy(xpath ="//*[text()='BRENTON MCPHERSON']")
	public WebElement nameBrent;
	@FindBy(xpath ="//*[text()='DAMIAN WALSH']")
	public WebElement nameDamo;
	@FindBy(xpath ="//*[text()='MATT NIDD']")
	public WebElement nameMatt;
	@FindBy(xpath ="//*[text()='JULIAN BRANDES']")
	public WebElement nameJulian;
	@FindBy(xpath ="//*[text()='TRACY KELLY']")
	public WebElement nameTracy;
	@FindBy(xpath ="//*[text()='PETER FAULKNER']")
	public WebElement namePete;
	 
	  //###############################################################################
	
	
		 //constructor
		 public AboutUS (WebDriver dr){
				driver = dr;
				}
	
	   public void checkElement (String arg1, String arg2) throws InterruptedException
	     {
	    	 
	    	 // read elements from page and then send it to ckecElements for comparison
			DBUtilities.checkElementPresentMessage(arg2);
	      Thread.sleep(1000);
	     }


	public void enterName(DataTable table) {
		List<List<String>> data = table.raw();
		for(int i=1; i<11; i++){
			String name = data.get(i).get(0);
			System.out.println(name);
			String andy = nameAndy.getText();
			if(i==1){Assert.assertEquals(andy, name);}
			String gav = nameGav.getText();
			if(i==2){Assert.assertEquals(gav, name);}
			String sally = nameSally.getText();
			if(i==3){Assert.assertEquals(sally, name);}
			String john = nameJohn.getText();
			if(i==4){Assert.assertEquals(john, name);}
			String brent = nameBrent.getText();
			if(i==5){Assert.assertEquals(brent, name);}
			String demo = nameDamo.getText();
			if(i==6){Assert.assertEquals(demo, name);}
			String matt = nameMatt.getText();
			if(i==7){Assert.assertEquals(matt, name);}
			String julian = nameJulian.getText();
			if(i==8){Assert.assertEquals(julian, name);}
			String tracy = nameTracy.getText();
			if(i==9){Assert.assertEquals(tracy, name);}
			String pete = namePete.getText();
			if(i==10){Assert.assertEquals(pete, name);}
		}	
		
	}

	
	   
}
