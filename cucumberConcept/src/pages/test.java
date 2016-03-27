package pages;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test {
  public static void main(String[] args) {

	   DateFormat dateFormat = new SimpleDateFormat("ddMMYYYYHHmmss");
	
	  
	   //get current date time with Calendar()
	   Calendar cal = Calendar.getInstance();
	   System.out.println(dateFormat.format(cal.getTime()));

  }
}