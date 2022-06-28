package Listeners.ListenersArtifactid;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class p2 {
	WebDriver driver;
	ExtentReports  ex;
	
	
	
	@BeforeTest
	public void firstclass() {
		
		//Extent Report code
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter rep = new ExtentSparkReporter(path);
		rep.config().setReportName("web automation report");
		rep.config().setDocumentTitle("test result");
		ex = new ExtentReports();
		ex.attachReporter(rep);
		ex.setSystemInfo("tester", "pragati");
		
		
	}
	
	@Test(priority = 1)
	public void listenclass1() {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\Chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		ex.createTest("test1 click");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));
		click.click();
		
		 
		 
	}
	@Test(priority = 2)
	public void test2() throws Exception {
		ex.createTest("test for Login");
//	
		WebElement text1 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
		text1.sendKeys("suhas.awale");
		Thread.sleep(2000);
		WebElement text2 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]"));
		text2.sendKeys("suhas@123");
		text1.click();
		WebElement log = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]"));
		log.click();
		
	} 
	@Test(priority = 3)
	public void test3() throws Exception {
		ex.createTest("test for Name");
		WebElement text3 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		text3.sendKeys("pragati");
		Thread.sleep(2000);
		
	}
	@Test(priority = 4)
	public void test4() {
		ex.createTest("test for number");
		WebElement text4 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"));
		text4.sendKeys("3");
		
		
	}
	@Test(priority = 5)
	public void test5() throws Exception {
		ex.createTest("Test for  select");
		WebElement test5 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
		Select sel = new Select(test5);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
	}
	@Test(priority = 6)
	public void test6() throws Exception {
		
		//code for dropdown
		
		ex.createTest("Test for Dropdown select");
		WebElement test6 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/input[1]"));
		test6.click();
		Thread.sleep(2000);
	} 
	@Test(priority = 7)
	public void test7() throws Exception {
		
		//code for radio button
		
		ex.createTest("Test for radio button");
		WebElement test7 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]"));
		test7.click();
		Thread.sleep(2000);
	}  
	@Test(priority = 8)
	public void test8() throws Exception {
		
		//code for new tab
		
		ex.createTest("Test for new tab");
		WebElement test8 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[1]"));
		test8.click();
		
		Thread.sleep(2000);
		
		Set<String> windows = driver.getWindowHandles();
		 //one by one stored by selenium
		
		Iterator<String> itr = windows.iterator();
		String parentwindow = itr.next();
		String childwindow = itr.next();
		
		Thread.sleep(2000);
		driver.switchTo().window(childwindow);
		driver.getTitle();
		driver.close();
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentwindow);
		driver.switchTo().defaultContent();
		
		
		
		
	} 
	/*@Test(priority = 9)
	
       public void test9() {
		
		//code for new window
		WebElement test9 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/button[1]"));
		test9.click();
		
		
	}*/
	
	@Test(priority = 10)
	public void test10() throws Exception {
		
		//code for Alert
		ex.createTest("test for Alert");
		WebElement test10 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/input[1]"));
		Thread.sleep(2000);
		test10.sendKeys("test10");
		Thread.sleep(2000);
		WebElement text11 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/button[1]"));
		text11.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
	}
	
	public void test12() {
		//code for web table
	}
	
	@AfterTest
	public void flush() {
		ex.flush();
	}
	

}
