package AssignmentMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class1 {
	WebDriver driver;
	
	 public class1(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(xpath = "//*[@id = 'name']")
	 WebElement Name;
	 @FindBy(xpath = "//*[@id = 'email']")
	 WebElement Email;
	 @FindBy(xpath = "//*[@id = 'phone']")
     WebElement Phoneno;
	 @FindBy(xpath = "//input[@type = 'submit']")
	 WebElement click;
	 @FindBy(xpath = "//input[@type = 'text']")
	 WebElement storename;
	 @FindBy(xpath = "//body[1]/div[3]/section[1]/section[3]/form[1]/section[1]/ul[1]/li[4]/div[1]/div[1]/div[4]/input[1]")
	 WebElement radio;
	@FindBy(xpath = "//inpute[@id = 'agreement']")
	 WebElement checkbox;
	 @FindBy(xpath = "//inpute[@type = 'text']")
	 WebElement OTP;
	 @FindBy(xpath = "//*[contains(text(),'Resend OTP')]")
	 WebElement resetOTP;
	 public WebElement method1() {
		 return Name;
		 
	 }
	 public WebElement method2() {
		 return Email;
		 
	 }
	 public WebElement method3() {
		 return Phoneno ;
		 
	 }
	 public void method4() {
		 click.click();
	 }
	 public WebElement method5() {
		 return storename;
	 }
	 public  WebElement method6() {
		return radio;
		 
		 		 
	 } 
	 public WebElement method7() {
		return checkbox;
		 
		 
	 } 
	 public WebElement method8() {
		return OTP;
		
		 
	 }
	 public WebElement method9() {
		return resetOTP;
		 
	 } 
	 
}
