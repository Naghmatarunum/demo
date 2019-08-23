package org.test.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEEM\\practise1\\July24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement signin = driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
		signin.click();
		
		WebElement create = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		create.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		name.sendKeys("naghma");
		
		WebElement number = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		number.sendKeys("6305914911");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("nagma@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("123456");
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='continue']"));
		submit.click();
		
		
				
		
		
		
		
		
		
	}
	
}
