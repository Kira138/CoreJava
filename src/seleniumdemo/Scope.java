package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.lang.System;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scope {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/table[1]/tbody[1]/tr[1]/td[1]/ul[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//List<WebElement> linksInColumn = columndriver.findElements(By.tagName("a"));
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

	}
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
			
}
}

