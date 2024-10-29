package seleniumdemo;

import org.openqa.selenium.By;
import java.lang.System;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rita");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rita@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Hello123");
	driver.findElement(By.cssSelector("label[for='exampleCheck1']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Hello123");
	driver.findElement(By.xpath("//option[normalize-space()='Female']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("label[for='inlineRadio1']")).click();
	driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("04-04-2000");
	WebElement element = driver.findElement(By.cssSelector("input[value='Submit']"));
	element.click();
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	
	
}
    }



