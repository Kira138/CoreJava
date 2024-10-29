package seleniumdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://the-internet.herokuapp.com/checkboxes");
	 WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	 checkbox1.click();
	 if (checkbox1.isSelected()) {
         // If selected, click to deselect
         checkbox1.click();
         System.out.println("Checkbox 1 deselected.");
     } else {
         System.out.println("Checkbox 1 is already deselected.");
     }

     // Find the second checkbox and check if it's selected
     WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
     if (checkbox2.isSelected()) {
         // If selected, click to deselect
         checkbox2.click();
         System.out.println("Checkbox 2 deselected.");
     } else {
         System.out.println("Checkbox 2 is already deselected.");
     }


	 
     }
	
}
