package org.phone;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html\r\n"
				+ "");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("(//h2[@class='mb-0'])[7]")).click();
		driver.findElement(By.xpath("//a[text()=' JUNIT']")).click();
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		
		Set<String> wwh = driver.getWindowHandles();
		System.out.println(wwh);
	}

}
