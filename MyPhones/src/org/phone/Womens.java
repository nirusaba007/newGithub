package org.phone;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Womens {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("women");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement element = driver.findElement(By.xpath("(//span[@class='TSD49J'])[4]"));
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
		Thread.sleep(2000);
		
		TakesScreenshot scr= (TakesScreenshot)driver;
		File as = scr.getScreenshotAs(OutputType.FILE);
		System.out.println(as);
		File f= new File("snapdeal\\women.png");
		FileUtils.copyFile(as, f);
		
		
		
	}
}
