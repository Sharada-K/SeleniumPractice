package amazonpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonApp {
	static WebDriver driver;
	static 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();
	}
	public static void main(String[] args) throws InterruptedException {	
		Login();
		TestCase1();
		SignOut();

		Login();
		TestCase2();
		SignOut();
	}

	static void Login() throws InterruptedException
	{	

		driver.findElement(By.name("email")).sendKeys("testingamazoncts@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("TEST@TEST");
		driver.findElement(By.id("signInSubmit")).click();
		
		Actions actions = new Actions(driver);
		WebElement DownArrow = driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/span[2]/span"));
		WebElement YourAccount = driver.findElement(By.xpath("//*[@class=\"nav-link nav-item\"][1]/span[contains(text(),'Your Account')]"));
		actions.moveToElement(DownArrow).moveToElement(YourAccount).click().build().perform();
	}

	static void TestCase1()
	{
		driver.findElement(By.xpath("//h2[contains(text(),'Amazon Pay balance')]/../../../../../../../preceding-sibling::div/div/a/div/div/div/div[2]/h2[contains(text(),'Your Orders')]")).click();
	}

	static void SignOut() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		WebElement DownArrow = driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/span[2]/span"));
		WebElement SignOut = driver.findElement(By.xpath("//*[@id='nav-item-signout']/span"));
		Thread.sleep(5000);
		actions.moveToElement(DownArrow).pause(2000).moveToElement(SignOut).click().build().perform();

	}

	static void TestCase2() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[contains(text(),'Deliver to')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div/div/span[2]/a[contains(text(),'Manage address book')]/../../../../following-sibling::div[2]/div/div/div[2]/span/span")).click();
	}

}
