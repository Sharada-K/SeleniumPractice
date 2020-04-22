package checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice2 {

	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	
	public static void main(String[] args) {
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='RoundTrip']")).isSelected());
		driver.close();
	}

}
