package POMDemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class LoginTest {
	Logger log = Logger.getLogger(LoginTest.class);
	WebDriver driver;
	LoginPage lp = null; // loose coupling
	DashboardPage dp= null;
	//UserPage up= null;
	
	
	@BeforeMethod
	public void setUp() {
		log.info("Chrome Browser Initialiation");
		System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Web application Opening");
		driver.get("file:///D:/Pratibha/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		log.info("Login page initialized");
		lp = new LoginPage(driver);
		log.info("Dashboard page initialized");
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
		log.info("Successful login");
		lp.validlogin();
		Assert.assertEquals(driver.getTitle(), lp.getTitlePage());
		System.out.println(driver.getTitle()+ "Page "+ lp.getTitlePage());
		dp.CourseList();
		//up.DataOfUser();
		
	}
	
	@AfterMethod
	public void CloseDriver(){
		log.info("close browser");
		driver.close();
	}
}

