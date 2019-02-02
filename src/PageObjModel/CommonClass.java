package PageObjModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonClass {
	public int FromMonth;
	public String day;
	public String month;
	public String Year;
	
	public void DateMethod() throws ParseException {
		String departure_date="15 May 2019";
		String[] dateParts = departure_date.split(" ");
		day = dateParts[0]; 
		month=dateParts[1].toLowerCase();
		Year=dateParts[2];
		
		Date date = new SimpleDateFormat("MMM").parse(month);//put your month name here
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    int monthNumber=cal.get(Calendar.MONTH);
	    FromMonth=monthNumber+1;
		
	}
	

}
