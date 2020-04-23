package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) throws InterruptedException {
		driver.findElement(By.cssSelector("#name")).sendKeys("Sharada");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		if(driver.switchTo().alert().getText().contains("SharadaK"))
		{
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		}
		else
		{
			Thread.sleep(3000);
			driver.switchTo().alert().dismiss();
		}
			
		Thread.sleep(5000);
		driver.close();
	}

}
