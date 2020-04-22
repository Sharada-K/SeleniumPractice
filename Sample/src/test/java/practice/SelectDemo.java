package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	static WebDriver driver;
	static WebElement SelectValue ;
	static String SelectXpath;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		/*WebElement passangers = driver.findElement(By.xpath("//div[@class='paxinfo']"));
		Actions a = new Actions(driver);
		a.moveToElement(passangers).click().build().perform();*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		
		SelectXpath="//div/p[@id='adultDropdown']/select";
		selectDropdownValue(6);
		
		SelectXpath="//div/p[@id='childDropdown']/select";
		selectDropdownValue(2);
		
		SelectXpath="//div/p[@id='infantDropdown']/select";
		selectDropdownValue(3);
		Thread.sleep(3000);
		
		//Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
		driver.close();
	}
	public static void selectDropdownValue(int n)
	{		
		Select s=new Select(driver.findElement(By.xpath(SelectXpath)));
		s.selectByIndex(n);
	}

}
