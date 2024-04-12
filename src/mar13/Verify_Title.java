package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verify_Title {
@Test
	public void CheckTitle() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String Expected ="google";
		String Actual =driver.getTitle();
		if(Expected.equalsIgnoreCase(Actual))
		{
			Reporter.log("Title is Matching::"+Expected+"        "+Actual);	
		}
		else
		{
			Reporter.log("Title is Not Matching::"+Expected+"        "+Actual);	
		}
		driver.quit();

	}

}
