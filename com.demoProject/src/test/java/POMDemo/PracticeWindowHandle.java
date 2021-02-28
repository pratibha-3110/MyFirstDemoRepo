package POMDemo;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class PracticeWindowHandle {

	@Test
	public void openNewWindow() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");
		String windowid= driver.getWindowHandle();
		System.out.println("Window Id: " + windowid);
		WebElement we=driver.findElement(By.xpath("//input[@title='Search']"));
		we.sendKeys("how to open new tab");
		we.click();
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div[3]/div[2]/div[1]/a/h3/span")).click();
		Set<String> WindID = driver.getWindowHandles();
		
		for(String wi:WindID){
			if(!wi.equals(windowid)){
				driver.switchTo().window(wi);
				System.out.println("data:"+ wi);
				Thread.sleep(2000);
				driver.close();
				
			}
			driver.switchTo().window(windowid);
			}
		Thread.sleep(2000);
		driver.close();
			
	}
	
	
}
