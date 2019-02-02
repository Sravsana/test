package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableMylogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		WebElement table=driver.findElement(By.id("example"));
		List<WebElement> rows=table.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		int Row_count=rows.size();
		System.out.println(Row_count);
		
		List<WebElement>btns=driver.findElements(By.xpath("//a[@aria-controls='example']"));
		int btns_count=btns.size();
		System.out.println(btns_count-2);
		
		for(int i=0;i<btns_count-2;i++)
		{
			driver.findElement(By.xpath("(//a[@aria-controls='example'])["+(i+1)+"]")).click();
			System.out.println(rows.get(1).getText());
			System.out.println(rows.get(5).getText());
		}
	}

}
