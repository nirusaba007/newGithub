package org.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shop {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
WebElement element = driver.findElement(By.xpath("//a[text()='Sports & More']"));
        Actions act= new Actions(driver);
act.moveToElement(element).perform();
driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();
	}

}
