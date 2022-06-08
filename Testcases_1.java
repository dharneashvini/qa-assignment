package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcases_1 {
	
	public static void main(String[] args) throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","\\D:\\Selenium\\chromedriver.exe\\");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("https://github.com/");
	  
	  driver.findElement(By.xpath("//a[@href='/login']")).click();
	  driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("dharneashvini2@gmail.com");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ashvini@12");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.xpath("(//img[@alt='@dharneashvini'])[2]")).click();
	  driver.findElement(By.xpath("//a[@data-ga-click='Header, go to profile, text:your profile']")).click();

	     WebElement signin = driver.findElement(By.xpath("//strong[@class='css-truncate-target']"));

	  		boolean s = signin.isDisplayed();
	  		System.out.println(s);
	  		
	  driver.findElement(By.xpath("(//button[@type='submit'])[10]")).click();		
	  
	}
}
