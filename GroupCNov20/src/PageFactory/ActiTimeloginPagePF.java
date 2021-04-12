package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeloginPagePF {
	@FindBy(xpath="//input[@id='username']")
	private WebElement un;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd;
	@FindBy(xpath="//a[@id='loginbutton']")
	private WebElement login;
	WebDriver driver;
	
	public ActiTimeloginPagePF(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
			//Usage
	public void setActiTimeUsernamePF() {
		un.sendKeys("admin");
	}
	public void setActiTimePasswordPF() {
		pwd.sendKeys("manager");
	}
	public void setActiTimeLoginbuttonPF() {
		login.click();
	}
	
	
}
