package org.phone;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement element = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']"));
		List<WebElement> head = element.findElements(By.tagName("th"));
		int size = head.size();
		System.out.println(size);
		for (WebElement webElements : head) {
			String text = webElements.getText();
			System.out.println(text);
			
			
		}
//		for (int i = 0; i < head.size(); i++) {
//			WebElement web = head.get(i);
//			System.out.println(web);
//			
//		}
		List<WebElement> elements = element.findElements(By.tagName("tr"));
		int size2 = elements.size();
		System.out.println(size2);
		
		for (int i = 0; i < size2; i++) {
			 WebElement ent = elements.get(i);
			System.out.println(ent.getText());
			
		}
//		for (WebElement b : elements) {
//			String text = b.getText();
//			System.out.println(text);
//		}
//		
//		
		List<WebElement> elements2 = element.findElements(By.tagName("td"));
		int size3 = elements2.size();
		System.out.println(size3);
		//for_each loop:
		
		for (WebElement x: elements2) {
			String text = x.getText();
			System.out.println(text);
			
		}
		
		
		
	
			
		}
			
		}
	
		
		
	


