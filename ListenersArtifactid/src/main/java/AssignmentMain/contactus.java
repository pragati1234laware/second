package AssignmentMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactus {
	WebDriver driver;
	
	 public  contactus (WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	 }
	 @FindBy(xpath = "//input[@name = 'contact_name']")
	 WebElement firstElement;
	 public  WebElement  p1() {
		return firstElement;
		  
	  } 
	  @FindBy(xpath = "//input[@name = 'contact_email']")
		 WebElement secondElement;
	  public  WebElement  method2() {
			return secondElement;
			  
		  }
	  @FindBy(xpath = "//input[@name = 'contact_subject']")
		 WebElement thirdElement;
	  public  WebElement  method3() {
			return  thirdElement ;
			  
		  } 
	  
	 /* @FindBy(xpath = "//input[@id = 'contact_msg']")
		 WebElement fourthElement;
	  public  WebElement  method4() {
			return  fourthElement ;
			  
		  } */
	  @FindBy(xpath = "//input[@name = 'SEND']")
		 WebElement fiveElement;
	  public  WebElement  method5() {
			return  fiveElement ;
			  
		  } 
	  
		 
	 
}
