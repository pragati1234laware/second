package AssignmentTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AssignmentMain.Homepage;
import AssignmentMain.Themespag;

public class Theamepage1 {
	
		WebDriver driver;
		@BeforeMethod
		  public void p9 () {
			  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\Chromedriver.exe");
			  driver = new ChromeDriver();
		  }
		 @Test
		  public void start1() throws Exception {
			  driver.get("https://www.purplestores.in/ecommerce-website-themes.php");
			  driver.manage().window().maximize();
			  Actions a = new Actions (driver);
			  Themespag   obj = new  Themespag(driver);
			  a.sendKeys(Keys.ARROW_UP).build().perform();
			  //obj.signup();
			  Thread.sleep(2000);
			  obj.view1().click();
			  

	}

}
