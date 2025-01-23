package org.phone;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkarts {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement element = driver.findElement(By.id("username"));
		WebElement element2 = driver.findElement(By.id("password"));
		WebElement element3 = driver.findElement(By.name("login"));
		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("arguments[0].setAttribute('value',('nirusaba'))", element);
		je.executeScript("arguments[0].setAttribute('value',('9889879'))", element2); 
		
		
		@Nullable
		Object pt = je.executeScript("return arguments[0].getAttribute('value')", element);
		System.out.println(pt);
		
		@Nullable
		Object spt = je.executeScript("return arguments[0].getAttribute('value')", element2);
		System.out.println(spt);
		je.executeScript("arguments[0].click()", element3);
		
	}

}
