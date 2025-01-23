package org.phone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement element = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		List<WebElement> elements = element.findElements(By.tagName("th"));
		int sized = elements.size();
		System.out.println(sized);
		
		for (int i = 0; i < elements.size(); i++) {
			WebElement nt = elements.get(i);
			System.out.println(nt.getText());
			
			
		}
		
		List<WebElement> elements2 = element.findElements(By.tagName("tr"));
		int size = elements2.size();
		System.out.println(size);
		
		for (int i = 0; i < elements2.size(); i++) {
			WebElement tt = elements2.get(i);
			System.out.println(tt.getText());
			
		}
		
		List<WebElement> elements3 = element.findElements(By.tagName("td"));
		int size2 = elements3.size();
		System.out.println(size2);
		
		for (int i = 0; i < elements3.size(); i++) {
			WebElement webs = elements3.get(i);
			System.out.println(webs.getText());
			
		}
		
	}


}
