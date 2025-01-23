package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bank {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement element2 = driver.findElement(By.id("bank"));
		Actions act= new Actions(driver);
		act.dragAndDrop(element, element2).perform();
		
		WebElement element3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement element4 = driver.findElement(By.id("amt7"));
		act.dragAndDrop(element3, element4).perform();
		
		
		WebElement element5 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement element6 = driver.findElement(By.id("loan"));
		act.dragAndDrop(element5, element6).perform();
		
		
		WebElement element7 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement element8 = driver.findElement(By.id("amt8"));
		act.dragAndDrop(element7, element8).perform();
		
		WebElement element9 = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = element9.getText();
		System.out.println(text);

		
		
	}

}
