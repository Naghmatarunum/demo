package org.test.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEEM\\practise1\\July24\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement register =  driver.findElement(By.xpath("(//a[@class='forceHttps'])[2]"));
		register.click();
		
		WebElement user = driver.findElement(By.xpath("//input[@id='username1']"));
		user.sendKeys("nagh@gmail.com");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='registerButton']"));
		button.click();
		
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("123456");
		
		//WebElement mrms = driver.findElement(By.xpath("//select[@id='profile_title']"));
		//mrms.click();
		
		Select mrms = new Select(driver.findElement(By.xpath("//select[@id='profile_title']")));
		mrms.selectByVisibleText("Ms");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("nagma");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("shaik");
		
		WebElement num = driver.findElement(By.xpath("//select[@id='country_code']"));
		num.click();
		
		WebElement mob = driver.findElement(By.xpath("//input[@id='mobile_number']"));
		mob.sendKeys("9874563210");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='signUpButton']"));
		submit.click();
		
		

		

		
	}
}


