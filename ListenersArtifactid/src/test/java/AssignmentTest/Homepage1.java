package AssignmentTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AssignmentMain.Homepage;

public class Homepage1 {
	WebDriver driver;
	@BeforeMethod
	  public void setup2() {
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\Chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	 @Test
	  public void start1() throws Exception {
		  driver.get("https://www.purplestores.in/");
		  driver.manage().window().maximize();
		  Actions a = new Actions (driver);
		  Homepage obj = new  Homepage(driver);
		  a.sendKeys(Keys.ARROW_DOWN).build().perform();
		  //obj.signup();
		  Thread.sleep(2000);
		  obj.facebook();
		  Set<String> windows = driver.getWindowHandles();

			Iterator<String> itr = windows.iterator();
			String parentwindow = itr.next();
			String childwindow = itr.next();
			
			Thread.sleep(2000);
			driver.switchTo().window(childwindow);
			driver.getTitle();
			System.out.println(driver.getTitle());
			driver.switchTo().window(parentwindow);
			driver.switchTo().defaultContent();
			
		  driver.navigate().back();
		  Thread.sleep(2000);
		  obj.twitter1().click();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  obj.linkdl1().click();
		  driver.navigate().back();
		  

}
}