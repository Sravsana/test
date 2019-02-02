package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		
		WebElement sb = driver.findElement(By.name("q"));
		//sb.clear();
		sb.sendKeys("Selelnium");
		
		System.out.println(sb.getAttribute("Maxlength"));
		System.out.println(sb.getCssValue("Background-color"));
		

		
	}

}
