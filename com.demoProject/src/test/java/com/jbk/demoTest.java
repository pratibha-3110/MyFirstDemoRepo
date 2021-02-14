package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoTest {
	WebDriver driver = null;
	@Test
	public void test01() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("file:///D:/Pratibha/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("123456");
	}
}
