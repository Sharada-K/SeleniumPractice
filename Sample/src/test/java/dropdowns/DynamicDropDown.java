package dropdowns;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) throws Exception{

		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[contains(@name,'ctl00_mainContent_ddl_originStation1_CTXT')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li/a[contains(text(),' Goa')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//li/a[contains(text(),'Kochi')])[2]")).click();
		//Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
		driver.close();

	}

}
