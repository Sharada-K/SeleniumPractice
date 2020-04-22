package checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {
	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println(driver.findElement(By.xpath("//li[@data-cy='roundTrip']/span")).isSelected());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']/span")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//li[@data-cy='roundTrip']/span")).isSelected());
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
