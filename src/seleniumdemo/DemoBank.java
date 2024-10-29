package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.System;


public class DemoBank {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='home']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[2]/li[3]/a[1]")).click();
	driver.findElement(By.id("name")).sendKeys("Tina");
	Thread.sleep(1000);
	driver.findElement(By.id("email")).sendKeys("Tina@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("phone")).sendKeys("9876543210");
	Thread.sleep(1000);
	driver.findElement(By.id("message")).sendKeys("Create my Account");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Send to Customer Care']")).click();
	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/p[1]")).getText());
	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/p[2]")).getText());
	//CustomerCare customerObj = new CustomerCare();
    //customerObj.accountMethod();
	}
	//static class CustomerCare {
		  //WebDriver driver;
	    //public void accountMethod() throws InterruptedException {
	    	
	   
	            
	    }
	
	    
	




