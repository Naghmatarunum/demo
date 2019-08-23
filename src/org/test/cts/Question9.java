package org.test.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEEM\\practise1\\July24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement signup =  driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		signup.click();
		Thread.sleep(5000);
	
		WebElement number = driver.findElement(By.xpath("//input[@type='text']"));
		number.sendKeys("6305914911");
	
		WebElement request =  driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI jUwFiZ']"));
		request.click();
	}
	
}
