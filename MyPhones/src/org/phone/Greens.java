package org.phone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		WebElement pagedown = driver.findElement(By.xpath("(//h2[@class='mb-0'])[7]"));
		pagedown.click();

		JavascriptExecutor jj = (JavascriptExecutor) driver;
		Thread.sleep(7000);
		jj.executeScript("arguments[0].scrollIntoView(true)", pagedown);
	}

}
