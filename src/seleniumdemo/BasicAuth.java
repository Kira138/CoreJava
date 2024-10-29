package seleniumdemo;
import org.openqa.selenium.By;
import java.lang.System;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
            
public class BasicAuth {
            	public static void main(String[] args) {
            		//Basic Auth
            		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
            		WebDriver driver = new ChromeDriver();
            		String username = "admin";
                    String password = "admin";
                    String domain = "the-internet.herokuapp.com/basic_auth";
                    String url = "https://" + username + ":" + password + "@" + domain;
                    driver.get(url);
                    String text = driver.findElement(By.cssSelector("div.example p")).getText().trim();
                    Assert.assertEquals("Congratulations! You must have the proper credentials.", text);
            	}
}

            		        


            		 
            		  


        




            		
				
            


            		 
            		