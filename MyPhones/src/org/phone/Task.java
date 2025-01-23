package org.phone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://afd.calpoly.edu/web/sample-tables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement element = driver.findElement(By.xpath("(//table[@summary='Provide table summary here'])[1]"));
		
		//heading:
		List<WebElement> elements = element.findElements(By.tagName("th"));
		int sizes = elements.size();
		System.out.println(sizes);
		for (int i = 0; i < elements.size() ; i++) {
			WebElement ment = elements.get(i);
			String text = ment.getText();
			System.out.println(text);
			
		}
		
		
		List<WebElement> elements2 = element.findElements(By.tagName("tr"));
		int sizez = elements2.size();
		System.out.println(sizez);
		for (int i = 0; i < elements2.size(); i++) {
			WebElement tt = elements2.get(i);
			String texts = tt.getText();
			System.out.println(texts);
			
		}
		
		List<WebElement> elements3 = element.findElements(By.tagName("th"));
		int sized = elements3.size();
		System.out.println(sized);
		
		for (WebElement b: elements3) {
			String texting = b.getText();
			System.out.println(texting);
			
		}
		
		List<WebElement> elements4 = element.findElements(By.tagName("td"));
		int sin= elements4.size();
		System.out.println(sin);
		
		for (WebElement d : elements4) {
			String texted = d.getText();
			System.out.println(texted);
			
		}
		
		}
		
		
	}


