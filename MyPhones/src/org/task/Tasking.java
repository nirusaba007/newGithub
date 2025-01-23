package org.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Tasking {
	public static void main(String[] args)  {
		WebDriver dd= new ChromeDriver();
		dd.get("https://www.flipkart.com/\r\n"
				+ "");
		dd.manage().window().maximize();
		dd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		dd.findElement(By.xpath("(//div[@class='YBLJE4'])[2]")).click();
		WebElement element = dd.findElement(By.xpath("//span[text()='Electronics']"));
		Actions sd= new Actions(dd);
		sd.moveToElement(element).perform();
     dd.findElement(By.xpath("//a[text()='Realme']")).click();
     dd.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		











	
	}
	
	

}
