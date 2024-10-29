package seleniumdemo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import java.lang.System;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Loginpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/label[2]/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/select[1]/option[3]")).click();
	   
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 WebElement modalDialog = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-dialog modal-confirm']")));
		 WebElement modalButton = modalDialog.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/button[2]"));
	        modalButton.click();
	        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/label[1]/span[1]/input[1]")).click();  
	        driver.findElement(By.id("signInBtn")).click();
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement element = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-shop[1]/nav[1]/div[1]/a[1]")));
	        System.out.println(element.getText());
	        List<WebElement> addButtons = driver.findElements(By.xpath("//button[contains(@class, 'btn-info') and contains(text(),'Add')]"));
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Iterate through the list of "Add" buttons and click each one
	        for (WebElement addButton : addButtons) {
	            // Wait for the "Add" button to be clickable
	        	 wait.until(ExpectedConditions.elementToBeClickable(addButton));

	            // Click the "Add" button
	            addButton.click();
	            
	        }
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();  
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-shop[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[5]/button[1]")).click();  
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("IND");  
	        Thread.sleep(5000);
	        List<WebElement> options =driver.findElements(By.xpath("/html[1]/body[1]/app-root[1]/app-shop[1]/div[1]/app-checkout[1]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
	        for(WebElement option :options)

	        {

	        if(option.getText().equalsIgnoreCase("India"))

	        {

	        option.click();

	        //break;

	        }
	       Thread.sleep(5000);
	        //driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-shop[1]/div[1]/app-checkout[1]/div[1]/div[2]/input[1]")).click();  
	        //Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@value='Purchase']")).click();  
	        System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-shop[1]/div[1]/app-checkout[1]/div[2]/div[1]")).getText());  

	}
	
	}
}
