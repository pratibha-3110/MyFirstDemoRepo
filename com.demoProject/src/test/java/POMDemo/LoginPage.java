package POMDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement uname;
	
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement lgnBtn;
	
	public String getTitlePage()
	 {
		 return driver.getTitle();
	 }
	public void Uname(String text){
		
		uname.sendKeys(text);
	}
	
	public void Pass(String text){
		pass.sendKeys(text);
	}
	
	public void ClickLogin(){
		lgnBtn.click();
	}
	 public void validlogin(){
		 Uname("kiran@gmail.com");
		 Pass("123456");
		 ClickLogin();
		 
	 }
	 
}
