package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("jagadish");
		driver.findElement(By.name("lastname")).sendKeys("jee");
		driver.findElement(By.name("reg_email__")).sendKeys("6380343188");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Jaga@12");
		WebElement birthday_day=driver.findElement(By.name("birthday_day"));
		Select dd1=new Select(birthday_day);
		dd1.selectByValue("23");
		
		WebElement birthday_month=driver.findElement(By.name("birthday_month"));
		Select dd2=new Select(birthday_month);
		dd2.selectByVisibleText("Dec");
		
		WebElement birthday_year=driver.findElement(By.name("birthday_year"));
		Select dd3=new Select(birthday_year);
		dd3.selectByValue("2001");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		//driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		driver.quit();
	}
}
