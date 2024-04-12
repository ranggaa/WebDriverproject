package mar7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static void main(String[] args) throws Throwable  {
		//create instance obejct
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://google.com");
		//suspend tool from execution for 5 seconds
		Thread.sleep(5000);
		driver.quit();
		

	}

}
