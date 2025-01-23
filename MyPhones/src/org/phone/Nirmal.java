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

public class Nirmal {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.snapdeal.com/");
		WebElement element = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		element.sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		
		TakesScreenshot s= (TakesScreenshot)driver;
		File scr = s.getScreenshotAs(OutputType.FILE);
		System.out.println(scr);
		File f= new File("snapdeal\\phone.png");
		FileUtils.copyFile(scr, f);
	}

}
