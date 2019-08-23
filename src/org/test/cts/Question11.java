package org.test.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEEM\\practise1\\July24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		WebElement name = driver.findElement(By.xpath("//input[@id='firstName']"));
		name.sendKeys("naghma");
		
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys("shaik");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("sknaghmasonu");
				
		WebElement password = driver.findElement(By.xpath("//input[@name='Passwd']"));
		password.sendKeys("123456789@Shaik");
		
		WebElement cpassword = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		cpassword.sendKeys("123456789@Shaik");
		
		WebElement next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();
		
		Thread.sleep(5000);
		
		WebElement number = driver.findElement(By.xpath("//input[@id='phoneNumberId']"));
		number.sendKeys("630591491");
	
		WebElement next1 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next1.click();
		
		
			}
	
}
