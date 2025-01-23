package org.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Womens {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/\r\n"
				+ "");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("(//div[@class='YBLJE4'])[2]")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Women']"));
		Actions acts= new Actions(driver);
		acts.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//a[text()='Flats']")).click();
	}

}
