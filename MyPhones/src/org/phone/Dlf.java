package org.phone;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dlf {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get( "http://www.greenstechnologys.com/\r\n"
				+ "");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement scrolldown = driver.findElement(By.xpath("//a[text()=' Privacy Policy']"));
		WebElement scrollup = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
	
	
	   JavascriptExecutor dd= (JavascriptExecutor)driver;
	   dd.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
	   
	   
	   
	 dd.executeScript("arguments[0].scrollIntoView(false)", scrollup);
	  // print the address//
	 String text = scrollup.getText();
	 System.out.println(text);
	   
	}

}
