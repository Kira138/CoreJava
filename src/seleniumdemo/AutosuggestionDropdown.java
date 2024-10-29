package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.lang.System;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutosuggestionDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("United");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropdownOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/ul[1]/li[4]/div[1]")));
		Actions actions = new Actions(driver);
        actions.moveToElement(dropdownOption);
        actions.sendKeys(Keys.ARROW_DOWN);
        actions.sendKeys(Keys.ARROW_DOWN); 
        actions.perform();
        String print=dropdownOption.getText();
        System.out.println(print);
        dropdownOption.click();

		
	

}
}
