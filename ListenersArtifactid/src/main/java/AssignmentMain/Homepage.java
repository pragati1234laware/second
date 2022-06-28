package AssignmentMain;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	 public  Homepage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	 }
//	 @FindBy(xpath = "//body[1]/div[3]/section[1]/section[1]/section[1]/a[1]/img[1]")
//	 WebElement click;
	 @FindBy(xpath = "//a[@href = 'https://www.facebook.com/Purplestores.in']")
	 WebElement fb;
	 @FindBy(xpath ="//a[href = 'https://www.facebook.com/recover/initiate?lwv=110&amp']")
	 WebElement forgetpassword;
	 @FindBy(xpath = "//a[@href = 'https://twitter.com/purplestores']")
     WebElement twitter;
	 @FindBy(xpath = "//a[@href = 'https://www.linkedin.com/company/purple-stores']")
	 WebElement linkdl;
	
	/* public void signup() {
		 click.click();
		 
	}*/
	public void  facebook() {
		fb.click();
		forgetpassword.click();
		
		
		
		 
		 
	 }
	
	 public WebElement twitter1() {
		 return twitter ;
		 
	 }
	public WebElement  linkdl1() {
		return linkdl;
		 
	 }

}
