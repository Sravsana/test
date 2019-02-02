package package1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjModel.CommonClass;

public class Spicejet {

	public static void main(String[] args) throws ParseException {
		
		WebDriver driver=new ChromeDriver();
		/*String departure_date="15 May 2019";
		String[] dateParts = departure_date.split(" ");
		String day = dateParts[0]; 
		String month=dateParts[1].toLowerCase();
		String Year=dateParts[2];
		*/
		
		
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		if(!driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected())
		{
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		}
		if(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).isDisplayed())
		{
		//Selecting CityFrom randomly from List
		String arg1=driver.findElement(By.id("ctl00_mainContent_group_details")).getAttribute("value");
		String[] a1=arg1.split("India@@");
		System.out.println(a1[1]);
		
		String b1=a1[1];
		String str1=b1.replace("||", " ");
		System.out.println(str1);	
		String[] c1=str1.split(" ");
		System.out.println(c1.length);
		Random rand1=new Random();
		int N=rand1.nextInt(c1.length);
		String Fcity=c1[N];
		System.out.println(Fcity);
		
		WebElement cityFrom= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		cityFrom.click();
		cityFrom.sendKeys(Fcity);
		
		//selecting to city randomly from the List 
		String arg2=driver.findElement(By.id("ctl00_mainContent_group_details")).getAttribute("value");
		String[] a2=arg2.split("India@@");
		System.out.println(a2[1]);
		
		String b2=a2[1];
		String str2=b2.replace("||", " ");
		System.out.println(str2);	
		String[] c2=str2.split(" ");
		System.out.println(c2.length);
		Random rand2=new Random();
		int N2=rand2.nextInt(c2.length);
		String Tocity=c2[N2];
		System.out.println(Tocity);
		WebElement cityTo=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		cityTo.click();
		cityTo.sendKeys(Tocity);
		}
		else
		{
			//need to write the code for select tagname
		}
		//Selecting the From Date
		/*Date date = new SimpleDateFormat("MMM").parse(month);//put your month name here
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    int monthNumber=cal.get(Calendar.MONTH);
	    
	    int FromMonth=monthNumber+1;
	    */
	   // System.out.println(FromMonth);
	    CommonClass obj=new CommonClass();
	    obj.DateMethod();
	    
	    while(driver.findElements(By.xpath("//td[@data-month='"+obj.FromMonth+"' and @data-year='"+obj.Year+"']/a[text()='"+obj.day+"']")).size()==0);
	    {
	    	driver.findElement(By.xpath("//span[text()='Next']")).click();
	    }
	    driver.findElement(By.xpath("//td[@data-month='"+obj.FromMonth+"' and @data-year='"+obj.Year+"']/a[text()='"+obj.day+"']")).click();
	    
	}


	}

