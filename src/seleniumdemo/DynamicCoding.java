package seleniumdemo;
import org.openqa.selenium.By;
import java.lang.System;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicCoding {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input")).click();

	        String option=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();

	        WebElement dropdownValues=driver.findElement(By.id("dropdown-class-example"));

	        Select s=new Select(dropdownValues);

	        s.selectByVisibleText(option);
	        driver.findElement(By.name("enter-name")).sendKeys(option);
	        driver.findElement(By.id("alertbtn")).click();
	        String text=  driver.switchTo().alert().getText();

	        if(text.contains(option))

	        {

	       System.out.println("success");

	        }

	        else

	       System.out.println("Fail");
}
}
		



