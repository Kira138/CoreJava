package seleniumdemo;
import org.openqa.selenium.By;
import java.lang.System;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MouseAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Thread.sleep(1000);
	     Set<String> windows = driver.getWindowHandles();
	     Iterator<String>it=windows.iterator();
	     String parentId = it.next();
	     String childId = it.next();
	     driver.switchTo().window(childId);
	     System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());  
	     
	  // Locate the element containing the text
	        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	        driver.switchTo().window(parentId);
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailId);

	}
}


