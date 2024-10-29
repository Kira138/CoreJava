package seleniumdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChallengingDOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/challenging_dom");
	        
	        // Maximize the browser window
	        driver.manage().window().maximize();
	        
	        // Create WebDriverWait instance
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        
	        // Interact with the buttons
	        WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button']")));
	        WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button alert']")));
	        WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button success']")));
	        button1.click();
	        button2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button alert']")));
	        button2.click();
	        button3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button success']")));
	        button3.click();
	     // Find the row you want to print (for example, the first row)
	        List<WebElement> columnElements = driver.findElements(By.xpath("//table//td[5]"));

	        // Iterate through each element in the column and print its text content
	        System.out.println("Content of the column:");
	        for (WebElement columnElement : columnElements) {
	            System.out.println(columnElement.getText());
	        }
	}
}