package org.phone;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement element = driver.findElement(By.id("user-name"));
		WebElement element2 = driver.findElement(By.id("password"));
		WebElement element4 = driver.findElement(By.id("login-button"));
		
		JavascriptExecutor  jcp= (JavascriptExecutor)driver;
		jcp.executeScript("arguments[0].setAttribute('value',('janu'))", element);
		jcp.executeScript("arguments[0].setAttribute('value',('9898'))", element2);
		
		
		@Nullable
		Object excript = jcp.executeScript("return arguments[0].getAttribute('value')", element);
		System.out.println(excript);
		
		@Nullable
		Object cuteScript = jcp.executeScript("return arguments[0].getAttribute('value')", element2);
		System.out.println(cuteScript);
		jcp.executeScript("arguments[0].click()", element4);
		
	}

}
