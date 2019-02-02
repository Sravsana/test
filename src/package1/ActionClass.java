package package1;

import java.awt.Desktop.Action;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://amazon.in");
		WebElement sbc= driver.findElement(By.partialLinkText("Shop by"));
		Actions act= new Actions(driver);
		
		act.moveToElement(sbc).build().perform();
		act.pause(2000).moveToElement(driver.findElement(By.xpath("//span[text()='Amazon Prime Video']")))
		.build()
		.perform();
		
		act.keyDown(Keys.CONTROL).pause(1000).click(driver.findElement(By.partialLinkText("TV Shows")));
		act.pause(1000);
		act.keyUp(Keys.CONTROL)
		.build()
		.perform();
		
		System.out.println(driver.getWindowHandle());
		
		Set<String> windis=driver.getWindowHandles();
		
		String parent= driver.getWindowHandle();
		driver.switchTo().window(windis.toArray()[1].toString());
		driver.findElement(By.xpath("//img[@alt='Join Prime']")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.switchTo().window(parent);
		
		driver.findElement(By.name("email")).sendKeys("ssenn41@gmail.com");
		driver.findElement(By.name("password")).sendKeys("tamil");
		driver.findElement(By.className("a-button-input")).click();
		//driver.close();
		
	}

}
