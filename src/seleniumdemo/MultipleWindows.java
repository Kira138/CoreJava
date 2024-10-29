package seleniumdemo;
import org.openqa.selenium.By;
import java.lang.System;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[33]/a[1]")).click();
		Thread.sleep(3000);
		    
		     driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]")).click(); 
		     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		     WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("example")));
		     Thread.sleep(1000);
		     Set<String> windows = driver.getWindowHandles();
		     Iterator<String>it=windows.iterator();
		     String parentId = it.next();
		     String childId = it.next();
		     driver.switchTo().window(childId);
				System.out.println(driver.findElement(By.className("example")).getText());
				driver.switchTo().window(parentId);
				System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/h3[1]")).getText());
				
				 
}
}
