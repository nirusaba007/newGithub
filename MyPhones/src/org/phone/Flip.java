package org.phone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flip {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/\r\n"
				+ "");
		driver.manage().window().maximize();
		
		 WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		 element.sendKeys("tv and appliances");
		 element.click();
		 
		 WebElement element2 = driver.findElement(By.xpath("//button[@type='submit']"));
		 element2.click();
		 
		 
		 
		 WebElement element3 = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		 Actions ss= new Actions(driver);
		 ss.moveToElement(element3).perform();
		 
		 WebElement element4 = driver.findElement(By.xpath("(//a[@title='LG'])[2]"));
		 element4.click();
		
		
	}

}
