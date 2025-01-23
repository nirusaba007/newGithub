package org.phone;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public class Minimum {

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		element.sendKeys("motorolo backcover");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot screen= (TakesScreenshot)driver;
		File ash = screen.getScreenshotAs(OutputType.FILE);
		System.out.println(ash);
		File f= new File("snapdeal\\cover.png");
		FileUtils.copyFile(ash, f);
	}

}
