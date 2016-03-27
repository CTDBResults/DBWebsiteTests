package pages;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DBUtilities {
	static WebDriver driver;
	
	
	
	//constructor
	 public DBUtilities (WebDriver dr){
			driver = dr;
			}
	 
	 
	 // following will take 2 args  from cucumber and one from page and then compare both messages
	 public static  void checkElement(String arg1, String arg2) {
		 Assert.assertEquals(arg1, arg2);
	 System.out.println("Successfully displayed element" +arg2 );
	   
	 }
	 
	 // following will take 2 args both strings and then compare them, basically used for text on UI
	 public static  void checkMessage(String arg1, String arg2) {
		 Assert.assertEquals(arg1, arg2);
	 System.out.println("Successfully displayed message" +arg2 );
	   
	 }
	   
	    	
	 
	 // following will check if the element exist on the screen
	 	 public static void checkElementPresentMessage(String arg1){
	 		 
		 System.out.println("***Page Element " + arg1.toUpperCase() +" is displayed successfully***");
	 }
		 
	// action performed on element(coming as arg)
	 	 public static void actionPerformedClick (String arg1)
	 	 {
	 		System.out.println("Successfully displayed Link" +arg1 );
	 		 System.out.println("Clicking on " +arg1.toUpperCase());
	 	 }
	
	
	

	 public static void writeLog(String message) {
	    	
	    	String timeStamp = new SimpleDateFormat("[dd/MM/yyyy HH:mm:ss]").format(new Date(0));
	    	System.out.println(timeStamp + " " + message);
	    	
	    }
	 
	 
	 // capture date and time
	 
	

			 public static String DNT(String[] args) {

				   DateFormat dateFormat = new SimpleDateFormat("ddMMYYYYHHmmss");
				
				  
				   //get current date time with Calendar()
				   Calendar cal = Calendar.getInstance();
				   String datentime = dateFormat.format(cal.getTime());
				   return datentime;

			  }

}
