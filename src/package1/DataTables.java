package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		while(driver.findElements(By.cssSelector(".paginate_button.net.disabled")).size()==0)
		{
			WebElement table=driver.findElement(By.id("example"));
			List<WebElement> rows=table.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
			for(WebElement row:rows)
			{
				System.out.println(row.findElements(By.tagName("td")).get(1).getText()+"\t");
				System.out.println(row.findElements(By.tagName("td")).get(5).getText());
				System.out.println();
				
			}
			driver.findElement(By.linkText("Next")).click();
		}
	}

}
