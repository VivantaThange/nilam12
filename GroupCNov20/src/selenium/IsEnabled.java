package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public void enable() {
		System.setProperty("webdriver.chrome.driver", "C:\\Velocity\\Java setup\\Slenium standalone file\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		WebElement ac = driver.findElement(By.xpath("//input[@id='email']"));
			boolean p = ac.isEnabled();
				if(p=true) {
					System.out.println("Text box is enabled");
					ac.sendKeys("Neelam Thange");
					}
				else {
					System.out.println("text box is disabled");
				}
				driver.quit();

	}
	public static void main(String[]args) {
		IsEnabled d=new IsEnabled();
		d.enable();
	}
}

