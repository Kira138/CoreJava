package seleniumdemo;

import org.openqa.selenium.By;
import java.lang.System;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Ecommerce {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[3]/a[4]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/button[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
        element.sendKeys("rahulshettyacademy");
        //driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        System.out.println(element1.getText());
		//System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        WebElement element2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]/option[89]")));
        element2.click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Brocolli - 1 Kg

			// Brocolli, 1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

				// click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}
