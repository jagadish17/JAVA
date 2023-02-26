package maven;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caller {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://dev140572.service-now.com");
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("filter")).sendKeys("callers");
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();

		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("jagadish");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("G");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("tester");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("jagadish@gmail.com");
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("6380343188");
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();

		WebElement name = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		name.sendKeys("jagadish", Keys.ENTER);
		String Firstname = "jagadish";

		WebElement name1 = driver.findElement(By.xpath("//td[text()='jagadish'][1]"));
		String Result = name1.getText();
		if (Firstname.equals(Result)) {
			System.out.println("sucessfully created");

		}

	}

}
