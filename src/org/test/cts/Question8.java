package org.test.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEEM\\practise1\\July24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement p = driver.findElement(By.xpath("//h1[text()='Selenium Training in Chennai']"));
		String mmm = p.getText();
		System.out.println(mmm);
		
		WebElement u = driver.findElement(By.xpath("//p[conatins (text (),'candidates')]"));
		String nb = u.getText();
		System.out.println(nb);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		
		WebElement click = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[5]"));
		click.click();
	}

}
