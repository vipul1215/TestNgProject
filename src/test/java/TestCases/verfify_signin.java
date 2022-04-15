package TestCases;

import org.testng.annotations.Test;

import Resources.baseclass;
import pageobject.Sign_IN_Page_Object_Model;

public class verfify_signin extends baseclass {
	

	 @Test
	 public void enterCredientials(){
	  
		 Sign_IN_Page_Object_Model spo=new Sign_IN_Page_Object_Model(driver);
	 // driver.findElement(By.xpath("")).sendKeys("jjdj");
	  spo.enterUserName().sendKeys("rahul");
	  spo.enterPassword().sendKeys("secure123");
	  spo.clickOnLogin().click();
	  spo.tryfreeT().click();
	
	

}
}

