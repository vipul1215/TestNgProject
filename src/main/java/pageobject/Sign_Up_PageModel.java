package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//method // locators are there in this page 
public class Sign_Up_PageModel {
	
	public WebDriver driver;
	//private By freepage = By.xpath("//a[@id='signup_link']");
	private By firstname = By.xpath("//input[@name = 'UserFirstName']");
	private By lastname = By.xpath("//input[@name = 'UserLastName']");
	private By workmail = By.xpath("//input[@name = 'UserEmail']");
	private By jobtitle = By.xpath("//select[@name = 'UserTitle']");
	private By company = By.xpath("//input[@name = 'CompanyName']");
	private By employees = By.xpath("//select[@name = 'CompanyEmployees']");
	private By phone = By.xpath("//input[@name = 'UserPhone']");
	private By countryregion = By.xpath("//select[@name = 'CompanyCountry']");
	private By mainservice = By.xpath("//div[@class = 'checkbox-ui']");
	
	
	public Sign_Up_PageModel(WebDriver driver2) {
		this.driver = driver2;
	}
	
	// public WebElement tryfreeT() {
		// return driver.findElement(freepage);
	 //}
	  
	
	public WebElement firstnameF() {
		return driver.findElement(firstname);
		
	}
	
	public WebElement lastnameL() {
		return driver.findElement(lastname);
		
	}
	
	public WebElement workmailL() {
		return driver.findElement(workmail);
		
	}
	
	public WebElement jobtitleJ() {
		return driver.findElement(jobtitle);
		
	}
	
	public WebElement companyC() {
		return driver.findElement(company);
		
		
	}
	
	public WebElement employeesE() {
		return driver.findElement(employees);
		
	}
	
	public WebElement phoneP() {
		return driver.findElement(phone);
		
		
	}
	
	public 	WebElement countryregionR() {
		return driver.findElement(countryregion);
	}
	
	public WebElement mainserviceM() {
		return driver.findElement(mainservice);
	}

}
