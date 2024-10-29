package seleniumdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisappearingElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
		 driver.get("https://the-internet.herokuapp.com/disappearing_elements");
		 driver.manage().window().maximize();
		 String[] linkTexts = {"Home", "About", "Contact Us", "Portfolio", "Gallery"};
		 for (String linkText : linkTexts) {
	            List<WebElement> elements = driver.findElements(By.linkText(linkText));
	            if (!elements.isEmpty()) {
	                WebElement element = elements.get(0);
	                wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	                System.out.println(linkText + " link clicked!");
	                driver.navigate().back(); // Navigate back to the previous page
	            } else {
	                System.out.println(linkText + " link is not present!");
	            }
	        }
			/*
			 * driver.navigate().refresh();
			 * 
			 * WebElement element =
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
			 * "li:nth-child(5)"))); element.click(); WebElement title =
			 * driver.findElement(By.xpath("//h1[normalize-space()='Not Found']"));
			 * System.out.println(title.getText());
			 */
		

}
}