package Automate;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("txtStationFrom"));
		ele.clear();
		ele.sendKeys("Mgr Chennai Ctr");
		ele.sendKeys(Keys.TAB);
		ele.sendKeys(Keys.TAB);
		WebElement ele2 = driver.findElement(By.id("txtStationTo"));
		ele2.clear();
		ele2.sendKeys("Mumbai Central");
		ele2.sendKeys(Keys.TAB);
		driver.findElement(By.id("buttonFromTo")).click();
		List<WebElement>elements= driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[1]"));
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++) {
			String numbers=elements.get(i).getText();
			
				System.out.println(numbers);
			
		}
		
	
		
		
	}

}
