package AssignmentMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Themespag {
	WebDriver driver;
	
	 public Themespag  (WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	 }
	 @FindBy(xpath = "//*[@id=\"Grid\"]/li[3]/section/a")
	 WebElement viewdemo;
	 public  WebElement  view1() {
		return viewdemo;
		  
	  } 
	
	

}
