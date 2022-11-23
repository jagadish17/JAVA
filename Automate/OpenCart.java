package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.id("input-username")).sendKeys("new account");
		driver.findElement(By.id("input-firstname")).sendKeys("jagadish");
		driver.findElement(By.id("input-lastname")).sendKeys("jagadish");
		driver.findElement(By.id("input-email")).sendKeys("JAGAdish712@gmail.com");
	    WebElement dropdown= driver.findElement(By.id("input-country"));
	    Select dd=new Select (dropdown);
	    dd.selectByValue("99");
	    driver.findElement(By.id("input-password")).sendKeys("JAGA");
	    Thread.sleep(2000);
	    driver.close();
	     
		

}
}