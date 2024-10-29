package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/context_menu");
		 Thread.sleep(3000);
		 WebElement contextMenu = driver.findElement(By.id("hot-spot"));
		 Actions actions = new Actions(driver);
		 actions.contextClick(contextMenu).perform();
		  String alertMessage = driver.switchTo().alert().getText();
	        System.out.println("Alert message: " + alertMessage);
	        
	        // Close the alert
	        driver.switchTo().alert().accept();
	}
	}
