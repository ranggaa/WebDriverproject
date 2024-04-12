package mar25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://money.rediff.com/mutual-funds");
	Thread.sleep(5000);
//print  specific row cell data
	String tabletext1= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[1]")).getText();
	String tabletext2= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[2]")).getText();
	System.out.println(tabletext1+"==========="+tabletext2);
	driver.quit();
	}

}
