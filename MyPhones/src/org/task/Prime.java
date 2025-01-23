package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prime {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get(" http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions acts= new Actions(driver);
		acts.moveToElement(element).perform();
		
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		driver.findElement(By.xpath("//span[text()='View benefits and payment settings']")).click();
	}

}
