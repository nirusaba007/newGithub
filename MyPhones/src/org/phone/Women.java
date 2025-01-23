package org.phone;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Women {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html\r\n"
				+ "");
		WebElement elem = driver.findElement(By.xpath("//div[@title='Core Java Test Papers']"));
		elem.click();
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screenshotAs = shot.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File f= new File("snapdeal\\corejava.png");
		FileUtils.copyFile(screenshotAs, f);
		
	
	}

}
