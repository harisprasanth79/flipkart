package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BussFlipkart 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7708797039");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ravi haris");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//input[@class='_3704LK']"));
		ele.sendKeys("chetan bhagat books");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	}
}
