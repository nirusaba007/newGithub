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

public class Flipkart {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));	
		element.sendKeys("iphone15pro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		TakesScreenshot screen= (TakesScreenshot)driver;
		File as = screen.getScreenshotAs(OutputType.FILE);
		System.out.println(as);
		File f= new File("snapdeal\\iphone.png");
		FileUtils.copyFile(as, f);
		
		
		
		
	}

}
