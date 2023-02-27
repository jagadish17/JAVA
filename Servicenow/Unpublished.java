package maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unpublished {
	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://dev140572.service-now.com");
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("filter")).sendKeys("Articles");
		driver.findElement(By.xpath("//div[text()='Unpublished']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='selected_action action_context btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT");
		
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("IT");
		
		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
}}
