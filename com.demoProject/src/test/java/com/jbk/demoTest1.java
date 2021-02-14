package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class demoTest1 {
	

	@Test
	public void test1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions act = new Actions(driver);

		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		Thread.sleep(1000);
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		act.click(from).sendKeys("Pune").build().perform();
		;

		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Pune (All Locations)']")).click();

		Thread.sleep(1000);
		WebElement to = driver.findElement(By.xpath("//label[contains(text(),'TO')]"));
		act.click(to).sendKeys("nagpur").build().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Nagpur (All Locations)']")).click();

		Thread.sleep(1000);
		WebElement date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		act.click(date).perform();

	}
}
