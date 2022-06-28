package AssignmentTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AssignmentMain.contactus;


public class conatctus2 {
	WebDriver driver;
	@BeforeMethod
	  public void setup2() {
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\Chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	 @Test
	  public void start1() throws Exception {
		  driver.get("https://www.purplestores.in/contact-us.php");
		  driver.manage().window().maximize();
		  contactus obj = new contactus(driver);
		  Thread.sleep(2000);
		  obj.p1().click();
		  obj.p1().sendKeys("pragati");
		 Thread.sleep(2000);
		  obj.method2().sendKeys("lawarepragati302@gmail.com");
		  Thread.sleep(2000);
		  obj.method3().sendKeys("7775939789");
		  Thread.sleep(2000);
		//  obj.method4().sendKeys("kuch bhi");
		  Thread.sleep(2000);
		  obj.method5().click();
		   
		  
	  }

}
