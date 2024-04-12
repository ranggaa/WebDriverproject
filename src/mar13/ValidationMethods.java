package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidationMethods {

	@Test
	public void StartTest() throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com");
		Thread.sleep(5000);
		//print title of page and length of title
		String pagetitle =driver.getTitle();
		Reporter.log(pagetitle);
		Reporter.log("page length::"+pagetitle.length());
		//print url and length of url
		String strUrl =driver.getCurrentUrl();
		Reporter.log(strUrl);
		Reporter.log("Domain name::"+strUrl.length());
		driver.quit();

	}

}
