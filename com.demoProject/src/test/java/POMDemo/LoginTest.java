package POMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	LoginPage lp = null; // loose coupling
	DashboardPage dp= null;
	//UserPage up= null;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Pratibha/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		lp = new LoginPage(driver);
		dp= new DashboardPage(driver);
		//up = new UserPage(driver);
		
	}

	/*@Test // tester working login page
	public void validLoginToPage() {
		lp.Uname("pratibha@gmail.com");
		lp.Pass("123456");
		lp.ClickLogin();

	}*/

	@Test // dashboard login page
	public void SuccesfullLogin() {
		lp.validlogin();
		Assert.assertEquals(driver.getTitle(), lp.getTitlePage());
		System.out.println(driver.getTitle()+ "Page "+ lp.getTitlePage());
		dp.CourseList();
		//up.DataOfUser();
		
	}
	
	@AfterMethod
	public void CloseDriver(){
		driver.close();
	}
}

