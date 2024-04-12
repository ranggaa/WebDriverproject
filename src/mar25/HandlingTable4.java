package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable4 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(5000);
	//store table
	WebElement webtable = driver.findElement(By.id("customers"));
	List<WebElement> rows, cols;
	//get row collection from webtable
	rows =webtable.findElements(By.tagName("tr"));
	System.out.println(rows.size()-1);
	Thread.sleep(5000);
	//iterate all rows intable
	for (WebElement eachrow : rows) {
		//get cell collection in each row
	cols =eachrow.findElements(By.tagName("td"));
	//iterate each cell
	for (WebElement eachcell : cols) {
		Thread.sleep(5000);
		System.out.println(eachcell.getText());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	Thread.sleep(5000);
	driver.quit();

	}

}
