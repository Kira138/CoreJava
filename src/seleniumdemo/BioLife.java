package seleniumdemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BioLife {
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.biolifeplasma.com");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("div[class='item NavBarMenuItem'] a[role='button']")).click();
		 driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Tina");
		 driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Sharma");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Tina.Sharma@gmail.com");
		 driver.findElement(By.cssSelector("input[name='zipCode']")).sendKeys("98007");
		 driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		 WebElement box = driver.findElement(By.cssSelector("div[class='field']"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(box).perform();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Locate the radio button inside the box
		 WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui.fitted.radio.checkbox")));

		// Click on the radio button to select it
		radioButton.click();
		 
	       
	    }
	}