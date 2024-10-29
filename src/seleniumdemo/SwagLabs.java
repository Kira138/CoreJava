package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.System;

public class SwagLabs {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 //System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("secret_sauce");	
	Thread.sleep(1000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("continue-shopping")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("checkout")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("first-name")).sendKeys("Tina");
	Thread.sleep(1000);
	driver.findElement(By.id("last-name")).sendKeys("Sharma");
	Thread.sleep(1000);
	driver.findElement(By.id("postal-code")).sendKeys("98007");
	Thread.sleep(2000);
	driver.findElement(By.id("continue")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("finish")).click();
	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/h2[1]")).getText());
	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText());
	driver.findElement(By.id("back-to-products")).click();
	
	
	
}
}
