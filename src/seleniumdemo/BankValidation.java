package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.lang.System;

public class BankValidation {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[2]/li[3]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Send to Customer Care']")).click();
	Thread.sleep(1000);
	WebElement errorMessageElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/span[1]"));
	String errorMessage = errorMessageElement.getText();
	Assert.assertEquals(errorMessage, "Name is required.");
	//System.out.println("Test passed: Error message matches expected.");
	//System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/span[1]")).getText());
	//System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/p[2]")).getText());
	}
}
