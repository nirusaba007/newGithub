
package org.phone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://toolsqa.com/\r\n"
				+ "");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement pagedown = driver.findElement(By.xpath("//span[text()='Facebook']"));
		WebElement pageup = driver.findElement(By.xpath("//div[text()='Articles']"));
		
		
		JavascriptExecutor jcp= (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		jcp.executeScript("arguments[0].scrollIntoView(true)", pagedown);
		Thread.sleep(2000);
		jcp.executeScript("arguments[0].scrollIntoView(false)", pageup);
	}

}
