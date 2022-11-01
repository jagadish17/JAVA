package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();		
	driver.get("https://www.opencart.com/index.php?route=account/register");
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("lapdrop");
	driver.findElement(By.name("firstname")).sendKeys("don");
	driver.findElement(By.name("lastname")).sendKeys("d");
	driver.findElement(By.name("email")).sendKeys("jeevag220@gmail.com");
	WebElement droplist=driver.findElement(By.name("country_id"));
	Select dd1=new Select(droplist);
	dd1.selectByValue("99");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123@");
	Thread.sleep(2000);
	driver.close();
}
}
