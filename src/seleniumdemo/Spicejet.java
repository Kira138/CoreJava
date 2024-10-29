package seleniumdemo;
import org.openqa.selenium.By;
import java.lang.System;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Spicejet {
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
{
System.out.println("its disabled");
Assert.assertTrue(true);
}
else
{
Assert.assertTrue(false);
}
//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
driver.findElement(By.cssSelector("a[value='BLR']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight" )).click();
driver.findElement(By.cssSelector("#divpaxinfo" )).click();
Thread.sleep(2000L);
for(int i=0;i<5;i++)
{
driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
}
driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
Thread.sleep(2000L);
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
driver.findElement(By.xpath("//option[@value='AED']")).click();
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();




}

}





