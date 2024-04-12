package mar12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Login {
	@Test
	public void loginTest() throws Throwable
	{
		// create instance object
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://primusbank.qedgetech.com/");
		//Suspend tool for 5 seconds
	Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		//Suspend tool for 5 seconds
		Thread.sleep(5000);
		//close browser
		driver.quit();



	}

}
