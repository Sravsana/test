package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConnectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		
		WebElement we = driver.findElement(By.name("q"));
		we.sendKeys("maveric connect");
		we.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//cite[text()='https://connect.maveric-systems.com/']")).click();
		//text()='Maveric Systems Ltd. - Login'
		
	}

}
