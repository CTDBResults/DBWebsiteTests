package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OurServices extends ProjectsPage{

	
	WebDriver driver;
	//#############################################################################
		 @FindBy(xpath ="//*[contains(text(),'LEARN MORE')]")
		 public List<WebElement> learn_more_about_strategy;

		 @FindBy(xpath ="//*[contains(text(),'We help shape your future and define how to get you there.')]")
		 public WebElement strategyPageMessage;
		 
		 @FindBy(xpath ="//*[contains(text(),'Combining expertise with innovative ideas and solutions.')]")
		 public WebElement consultingPageMessage;
		 
		 @FindBy(xpath ="//*[contains(text(),'Unlock your digital potential through disruption.')]")
		 public WebElement digitalPageMessage;
		 
		 @FindBy(xpath ="//*[contains(text(),'Smart solutions to bring your strategy to life.')]")
		 public WebElement technologyPageMessage;
		 
		 @FindBy(xpath ="//*[contains(text(),'Help to ensure you stay focused on what you do best.')]")
		 public WebElement operationsPageMessage;
		 
		 //###############################################################################
		
		
			 //constructor
			 public OurServices (WebDriver dr){
				 super (dr);
				driver = dr;
					}
			   public void clickLearnMoreButton(String arg1) throws InterruptedException
			     {

			    	 List<WebElement> LEARN_MORE= learn_more_about_strategy ;
			    	 	if (arg1.equals("Strategy"))
			        	 	LEARN_MORE.get(0).sendKeys(Keys.RETURN);	
			    	 	if (arg1.equals("Consulting"))
			        	 	LEARN_MORE.get(1).sendKeys(Keys.RETURN);
			    	 	if (arg1.equals("Digital"))
			        	 	LEARN_MORE.get(2).sendKeys(Keys.RETURN);
			    	 	if (arg1.equals("Technology"))
			        	 	LEARN_MORE.get(3).sendKeys(Keys.RETURN);
			    	 	if (arg1.equals("Operations"))
			        	 	LEARN_MORE.get(4).sendKeys(Keys.RETURN);
			     }
			   
			     
			   
			   public void checkMessage (String arg1, String arg2)
			 	{
			    	 if ("Strategy".equals(arg1)){
			    	 String StrategyPageMessage = strategyPageMessage.getText();
			 		DBUtilities.checkMessage(arg1, StrategyPageMessage);
			    	 }
			    	 
			    	 
			    	 if ("Consulting".equals(arg1)){
			        	 String ConsultingPageMessage = consultingPageMessage.getText();
			     		DBUtilities.checkMessage(arg1, ConsultingPageMessage);
			        	 }
			    	 
			    	 if ("Digital".equals(arg1)){
			        	 String DigitalPageMessage = digitalPageMessage.getText();
			     		DBUtilities.checkMessage(arg1, DigitalPageMessage);
			 		}
			    	 if ("Technology".equals(arg1)){
			        	 String TechnologyPageMessage = technologyPageMessage.getText();
			     		DBUtilities.checkMessage(arg1, TechnologyPageMessage);
			 	}
			    	 if ("Operations".equals(arg1)){
			        	 String TperationsPageMessage = operationsPageMessage.getText();
			     		DBUtilities.checkMessage(arg1, TperationsPageMessage);
			 	}
			 	}
}
