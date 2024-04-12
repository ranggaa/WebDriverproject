package mar21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAction1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac = new Actions(driver);
		//enter some text in textbox
		driver.findElement(By.name("q")).sendKeys("Selenium openeings in ");
		Thread.sleep(5000);
		//click down arrow for three times
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		//click enter key
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
