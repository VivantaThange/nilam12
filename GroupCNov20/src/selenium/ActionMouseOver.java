package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseOver {
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Velocity\\Java setup\\Slenium standalone file\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	Thread.sleep(3000);
	
	driver.switchTo().frame(0);
	WebElement ele = driver.findElement(By.xpath("//button[@class='class']"));
	
	Actions s=new Actions(driver);
	Thread.sleep(3000);
	s.moveToElement(ele).perform();
     List<WebElement> option =driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
	int a = option.size();
	System.out.println(a);
	 
	for(int i=1;i<a;i++) {
		WebElement x=option.get(i);
		String link=x.getAttribute("innerHTML");
		System.out.println(link);
		
		if(link.equalsIgnoreCase("testng")){
			x.click();
			break;
		}
		
	}
	
	}
}
