package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.rediff.com/");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		/*System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.close();*/
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@class,'signin')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='login']")).sendKeys("Sharada");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Password");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='div_login_error']/b")).getText());
		Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
		driver.close();
	}

}
