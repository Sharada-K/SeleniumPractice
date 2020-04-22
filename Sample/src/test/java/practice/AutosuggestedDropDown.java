package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestedDropDown {

	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("my");
		Thread.sleep(6000);
		List<WebElement> fromPlace = driver.findElements(By.xpath("//div[@class='calc60']"));
		for(int i=0;i<fromPlace.size();i++)
		{
			if(fromPlace.get(i).getText().contains("Mysore"))
			{

				fromPlace.get(i).click();
				Thread.sleep(6000);
				break;
			}
		}
		driver.findElement(By.xpath("//div['root']/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/input")).sendKeys("Mang");
		Thread.sleep(8000);
		List<WebElement> toCity = driver.findElements(By.xpath("//div['root']/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/ul/li"));		
		for(int i=0;i<toCity.size();i++)
		{
			if(toCity.get(i).getText().contains("Mangalore"))
			{

				toCity.get(i).click();
				Thread.sleep(6000);
				break;
			}
		}		
		driver.close();
	}

}
