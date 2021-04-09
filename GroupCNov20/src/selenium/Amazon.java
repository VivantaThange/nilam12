package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Velocity\\Java setup\\Slenium standalone file\\chromedriver.exe");		
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get("https://www.amazon.in/");
	d.findElement(By.xpath("(//a[@class='nav-a'])[1]")).click();
	}

}
