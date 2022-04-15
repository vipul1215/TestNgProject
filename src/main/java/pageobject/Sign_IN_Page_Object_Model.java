package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_IN_Page_Object_Model {
	
	public WebDriver driver; //This driver doesnt have any scope..
	 
	 
	 //driver.findElement(By.xpath("jkdskj")).sendKeys("jjdjd");
	  
	 private  By username= By.xpath("//input[@id='username']");
	 private  By password=By.xpath("//input[@id='password']");
	 private By login=By.xpath("//input[@id='Login']");
	 private By freepage = By.xpath("//a[@id='signup_link']");
	 
	  

	 
	 public Sign_IN_Page_Object_Model(WebDriver driver2) {
	 // TODO Auto-generated constructor stub
	  this.driver=driver2;
	  
	}


	public WebElement enterUserName() {
	  
	  return driver.findElement(username);
	 
	  
	 }
	 

	 public WebElement enterPassword() {
	  
	  return driver.findElement(password);
	  
	 }
	 
	 public WebElement clickOnLogin() {
	  return driver.findElement(login);
	  
	 }
	 
	 public WebElement tryfreeT() {
		 return driver.findElement(freepage);
	 }
	  
	  
	 
	  
	  
	 

	
}
