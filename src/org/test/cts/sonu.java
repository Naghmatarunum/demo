package org.test.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sonu {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEEM\\practise1\\July24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
				
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("naghma");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='lastname']"));
		email.sendKeys("shaik");
		
		WebElement button = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		button.click();

		
		WebElement button1 = driver.findElement(By.xpath("(//input[@name='exp'])[3]"));
		button1.click();
		
		WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		date.sendKeys("july");
		
		WebElement button2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		button2.click();
		
		WebElement button3 = driver.findElement(By.xpath("//input[@id='photo']"));
		button3.click();
		
		WebElement button4 = driver.findElement(By.xpath("//input[@id='tool-2']"));
		button4.click();
		
		WebElement button5 = driver.findElement(By.xpath("//select[@id='continents']"));
		button5.click();
		
		WebElement button6 = driver.findElement(By.xpath("//button[@id='submit']"));
		button6.click();
		
		
					
		
	}

}
