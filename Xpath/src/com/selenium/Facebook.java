package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("harisprasanth79@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ravi haris");
		driver.findElements(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	}
}
