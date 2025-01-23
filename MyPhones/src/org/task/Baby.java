package org.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baby {
	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.get(" https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		  driver.findElement(By.xpath("(//div[@class='YBLJE4'])[2]")).click();
		  WebElement element = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		  Actions ast= new Actions(driver);
		  ast.moveToElement(element).perform();
		  
		  driver.findElement(By.xpath("//a[text()='Remote Control Toys']")).click();
		 
	}

}
