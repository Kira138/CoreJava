package seleniumdemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenImages {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		List<WebElement> links =  driver.findElements(By.tagName("img"));
		SoftAssert a =new SoftAssert();
		for(WebElement link:links)
		{
			String imgUrl= link.getAttribute("src");
			HttpURLConnection conn= (HttpURLConnection)new URL(imgUrl).openConnection();

	          conn.setRequestMethod("GET");

	          conn.connect();

	          int respCode = conn.getResponseCode();

	          System.out.println(respCode);
	          

	          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

}
                  a.assertAll();
	     

	   

	     

	     

	         

	         

	         

	         

	         

	     

	       

	       

	       

	       

	       

	       

	       

	       

	       

	       

	       

	       

	       

	       

	       

	       

	         

	         

	         

	}



	private static Object getReturnCode(WebElement link) {

	// TODO Auto-generated method stub

	return null;

	}
}
	


