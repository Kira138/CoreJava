package seleniumdemo;

import org.openqa.selenium.By;
import java.lang.System;
import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDates {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String monthNumber = "6";
        String date = "15";
        String year = "2027";
        String[] expectedList = {monthNumber,date,year};
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
          Thread.sleep(2000);
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        Thread.sleep(2000);
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
        Thread.sleep(2000);

        List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

        for(int i =0; i<actualList.size();i++)

        {

        System.out.println(actualList.get(i).getAttribute("value"));
        Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

        }

        driver.close();

        }



        }