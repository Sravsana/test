package package1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) {
		String Email="sravani.chellumala@gmail.com";
		String Password="sravani@18";
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("sign-in-icon-down")).click();
		driver.findElement(By.id("signInLink")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.className("modalIframe")));
		driver.findElement(By.xpath("//div[@class='signin-screen' and text()='SIGN IN using Email']")).click();
		//driver.findElement(By.className("signin-screen")).click();
		driver.findElement(By.xpath("//div[@class='otpOtherSignIn mainSignIn' and text( )='Try other ways to sign in']")).click();
		driver.findElement(By.className("abcRioButtonContentWrapper")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Set <String> ids=driver.getWindowHandles();
		System.out.println(ids);
		System.out.println(ids.size());
		/*for(int i=1;i<ids.size();i++)
		{
			driver.switchTo().window(ids.toArray()[i].toString());
			driver.close();
		}
		*/
		
	
		/*driver.findElement(By.id("email-mobile")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("doSignin")).click();
		
		//driver.switchTo().defaultContent();
*/
	}

}
