package org.phone;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement element = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		element.sendKeys("iphone15plus", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Black, 128 GB)']")).click();
		String parent = driver.getWindowHandle();
		System.out.println("single tab is:" + parent);

		Set<String> child = driver.getWindowHandles();
		System.out.println("multiple tab is:" + child);

		for (String b : child) {
			if (!parent.equals(b)) {
				driver.close();
				driver.switchTo().window(parent);
			}

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();

	}

}
