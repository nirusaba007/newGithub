package org.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Appliances {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("(//div[@class='YBLJE4'])[6]")).click();
		WebElement element1 = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		Actions act= new Actions(driver);
		act.moveToElement(element1).perform();
		driver.findElement(By.xpath("(//a[@class='jBYtJt'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
	}

}
