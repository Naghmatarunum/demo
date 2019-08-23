package org.test.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEEM\\practise1\\July24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		String tit = driver.getTitle();
		System.out.println(tit);
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
	
		WebElement signup = driver.findElement(By.xpath("//div[@id='signin-block']"));
		signup.click();
		
		WebElement signin = driver.findElement(By.xpath("//li[@id='signInLink']"));
		signin.click();
		Thread.sleep(5000);
				
		WebElement number = driver.findElement(By.xpath("//input[@type='number']"));
		number.sendKeys("6305914911");
		
		WebElement otp = driver.findElement(By.xpath("//div[@class='otpContainer clearfix']"));
		otp.click();
		 
		
	
	}
	
}
