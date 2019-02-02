package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://account.magento.com/customer/account/create/");
		
		/*Select country_select = new Select(driver.findElement(By.id("country")));
		
		country_select.selectByVisibleText("India");
		
		for(WebElement c:country_select.getOptions())
		{
			System.out.println(c.getText());
		}
		*/
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("document.getElementsByClasssName(\"recaptcha-checkbox-checkmark\")[0].click()");
		
	}

}
