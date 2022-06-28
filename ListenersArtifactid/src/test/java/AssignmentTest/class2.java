package AssignmentTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AssignmentMain.class1;

public class class2 {
	WebDriver driver;
	
	@BeforeMethod
	public void methodsetup() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\Chromedriver.exe");
	  driver = new  ChromeDriver();
	}
		@Test(priority = 0)
		public void methodset1() throws Exception {
		driver.get("https://www.purplestores.in/index.php#sgnUp");
		
		driver.manage().window().maximize();
		
		class1 obj = new class1(driver);
		obj.method1().sendKeys("pragati");
		Thread.sleep(2000);
		obj.method2().sendKeys("lawarepragti302@gmail.com");
		Thread.sleep(2000);
		obj.method3().sendKeys("7775939789");
		Thread.sleep(2000);
		obj.method4();
		obj.method5().sendKeys("Bakery");
		Thread.sleep(2000);
	    obj.method6().click();
	    Thread.sleep(2000);
		obj.method7().click();
		Thread.sleep(2000);
		obj.method8().sendKeys("9876");
		Thread.sleep(2000);
		obj.method9().click();
		}
		
	}


