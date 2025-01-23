package org.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement element = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
		
		
		driver.findElement(By.xpath("//span[text()='Your Prime Membership']")).click();
		
		
	}

}
