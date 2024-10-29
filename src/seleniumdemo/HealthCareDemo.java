package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;


public class HealthCareDemo {
    public static void main(String[] args) throws InterruptedException {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");

        // Configure Chrome options to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Initialize ChromeDriver with options
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // Navigate to the webpage
        driver.get("https://www.hdfcergo.com/");

        // Wait for the pop-up frame to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='vizury-notification-template']"))); // Use presenceOfElementLocated instead of frameToBeAvailableAndSwitchToIt

     // Switch to the iframe
     driver.switchTo().frame(iframe);

     // Wait for the close button to be clickable
     WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='div-close']")));

     // Click on the close button
     closeButton.click();

     // Switch back to the default content
     driver.switchTo().defaultContent();
     Thread.sleep(1000);
     WebElement linkToNewTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/h5[1]")));
     linkToNewTab.click();
     // Wait for the new tab to open
     String mainWindowHandle = driver.getWindowHandle();
     wait.until(ExpectedConditions.numberOfWindowsToBe(2));
  // Switch to the new tab
     Set<String> allWindowHandles = driver.getWindowHandles();
     allWindowHandles.remove(mainWindowHandle);
     String newTabHandle = allWindowHandles.iterator().next();
     driver.switchTo().window(newTabHandle);
     //WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//label[@class='radio-inline radio'][normalize-space()='Individual']//span[@class='checkround']")));
     //radioButton.click();
     

     //driver.findElement(By.xpath("/html[1]/body[1]/div[3]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/div[1]/div[1]/label[1]")).click();

    

    }
}
