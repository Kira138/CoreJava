package seleniumdemo;
import org.openqa.selenium.By;
import java.lang.System;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement>columnValues=  driver.findElements(By.cssSelector(".table-display td:nth-child(2), .table-display th:nth-child(2)"));
		int columnCount=columnValues.size();
		 System.out.println("Number of columns in the middle column (including header): " + columnCount);
			List<WebElement>rowValues=  driver.findElements(By.cssSelector("tbody tr th:nth-child(1), tbody tr th:nth-child(2),  tbody tr th:nth-child(3)"));
			int rowCount=rowValues.size();
			 System.out.println("Number of rows: " + rowCount);
			 System.out.println(driver.findElement(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[3]")).getText());
		 
	}
}