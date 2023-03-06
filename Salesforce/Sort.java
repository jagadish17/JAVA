package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sort {
	@Test
	public void sorting() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();

		 driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();

  driver.findElement(By.xpath("//button[text()='View All']"))
		.click();
driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("dashboard");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		
		WebElement n = driver.findElement(By.xpath("//span[text()='Dashboard Name']"));
		Actions dd2=new Actions(driver);
		dd2.moveToElement(n).perform();
		n.click();
		
		
		
	}

}

}
