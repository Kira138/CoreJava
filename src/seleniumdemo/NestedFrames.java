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
public class NestedFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[34]/a[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/frameset[1]/frame[2]")));
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		

}
}