package mar26;

import java.util.List;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {

	public static void main(String[] args) throws Throwable {
		String dob ="December/20/1987";
		String temp[]=dob.split("/");
		String date=temp[1];
		String month =temp[0];
		String year =temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(5000);
		String calYear =driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calYear.equals(year))
		{
			//click previous button
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calYear =driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		String calMonth =driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calMonth.equalsIgnoreCase(month))
		{
			//click previous button
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calMonth =driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					Thread.sleep(5000);
					//click date
					eachcell.click();
					
				}
			}
			
		}

	}

}
