package mar23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#input-firstname\").value='Akhilesh'");
		js.executeScript("document.getElementById('input-lastname').value='selenium'");
		js.executeScript("document.querySelector('#input-email').value='Test@gmail.com'");
		js.executeScript("document.querySelector(\"#input-password\").value='Test@!!@$'");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"#form-register > div > div > div > input\").click()");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
