package POMDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver dbDriver;
	
	public DashboardPage(WebDriver driver)
	{
		this.dbDriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3")
	private List<WebElement> courses;
	
	public void CourseList(){
		for(WebElement we:courses){
			System.out.println("Courses Available at JBk "+we.getText());
		}
	}
	
}
