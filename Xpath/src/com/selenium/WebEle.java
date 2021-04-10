package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///E:/1.%20java/16/Locators.html");
		WebElement ele1 = driver.findElement(By.id("a1"));
		boolean status = ele1.isDisplayed();
		if(status=true)
		{
			System.out.println("element displayed");
		}
		else
		{
			driver.close();
		}
		WebElement ele2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		boolean status1 = ele2.isEnabled();
		System.out.println(status1);
		WebElement ele3 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		ele3.click();
		Thread.sleep(2000);
		boolean status3 = ele3.isSelected();
		System.out.println(status3);
		WebElement ele4 = driver.findElement(By.xpath("//input[@id='a1']"));
		ele4.sendKeys("selenium");
		Thread.sleep(2000);
		ele4.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele4.sendKeys(Keys.DELETE);
		
		
	}
}
