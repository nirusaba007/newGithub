package org.phone;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/\r\n"
				+ "");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("email"));
		WebElement element2 = driver.findElement(By.id("pass"));
		WebElement element3 = driver.findElement(By.name("login"));
		
		//entered the values//
		JavascriptExecutor jcr= (JavascriptExecutor)driver;
		jcr.executeScript("arguments[0].setAttribute('value',('tejaswini'))", element);
		jcr.executeScript("arguments[0].setAttribute('value',('888899'))", element2);
		
		//set attribute for console//
		@Nullable
		Object ex = jcr.executeScript("return arguments[0].getAttribute('value')", element);
		System.out.println(ex);
		@Nullable
		Object vx = jcr.executeScript("return arguments[0].getAttribute('value')", element2);
		System.out.println(vx);
		jcr.executeScript("arguments[0].click()", element3);
	}

}
