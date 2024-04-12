package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidateUrl {
@Test
	public void validateUrl() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		String Expected ="https://";
		String Actual = driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			Reporter.log("Url is Secured::"+Expected+"        "+Actual);
		}
		else
		{
			Reporter.log("Url is Local::"+Expected+"        "+Actual);
		}
		driver.quit();

	}

}
