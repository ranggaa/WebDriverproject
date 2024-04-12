package mar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GetCommands {
@Test
public void startTest() throws Throwable
	 {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		Thread.sleep(5000);
		//print gmail text 
		String gmailtext= driver.findElement(By.linkText("Gmail")).getText();
		Reporter.log(gmailtext);
		//print gmail url 
		String url = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		Reporter.log(url);
		driver.quit();

	}

}
