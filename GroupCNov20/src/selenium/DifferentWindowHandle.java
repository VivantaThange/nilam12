package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentWindowHandle {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Velocity\\Java setup\\Slenium standalone file\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	  
	// for window handle (id found out)
	//1) getWindowHandle
	String windoID= driver.getWindowHandle();
	System.out.println(windoID);
	
	//2) getWindowHandle
	
   Set<String> windoIDs= driver.getWindowHandles();
    		System.out.println(windoIDs);
    		driver.switchTo().window(windoID);
	
    		
	
	}

}
