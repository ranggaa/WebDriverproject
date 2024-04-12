package mar21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAction3 {

	public static void main(String[] args) throws Throwable {
		//write  a script to perform multiple actions
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//move mouse to kids
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='kids']")));
		ac.perform();
		Thread.sleep(5000);
		//move mosuse to soft toys and click it
		ac.moveToElement(driver.findElement(By.linkText("Soft Toys")));
		ac.pause(5000);
		ac.click().perform();
		//move mouse to beauty
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='beauty']")));
		ac.perform();
		Thread.sleep(5000);
		//move to hairoil link and click
		ac.moveToElement(driver.findElement(By.linkText("Hair Oil")));
		ac.pause(5000);
		ac.click().perform();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
