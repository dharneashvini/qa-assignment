package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcases_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\D:\\Selenium\\chromedriver.exe\\");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("https://github.com/");
		
		  driver.findElement(By.xpath("//a[@href='/login']")).click();
		  driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("dharneashvini2@gmail.com");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ashvini@12");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  driver.findElement(By.xpath("(//a[@class='btn btn-sm btn-primary'])[1]")).click();
		  driver.findElement(By.xpath("//input[@name='repository[name]']")).sendKeys("qa-assignment");
		  
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
	         js.executeScript("scroll(800,1009)");
	          Thread.sleep(2000);
	          
	      driver.findElement(By.xpath("(//span[@class='text-normal'])[1]")).click();
	      driver.findElement(By.xpath("//input[@aria-label='.gitignore template']")).sendKeys("Node");
	      driver.findElement(By.linkText("Node")).click();
	      driver.findElement(By.xpath("//button[@data-disable-with='Creating repository&hellip;']")).click();
	      driver.findElement(By.xpath("(//img[@alt='@dharneashvini'])[2]")).click();
	      driver.findElement(By.xpath("(//button[@type='submit'])[10]")).click();	
	      
	}

}
