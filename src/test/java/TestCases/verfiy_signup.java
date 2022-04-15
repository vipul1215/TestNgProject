package TestCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.baseclass;
import pageobject.Sign_IN_Page_Object_Model;
import pageobject.Sign_Up_PageModel;

@Test
public class verfiy_signup extends baseclass {
	public void signup() throws InterruptedException {
		
		
		Sign_IN_Page_Object_Model sa = new Sign_IN_Page_Object_Model (driver);
		sa.tryfreeT().click();
	
	
	Sign_Up_PageModel so = new Sign_Up_PageModel(driver);
	Thread.sleep(5000);
	so.firstnameF().sendKeys("vipul");
	so.lastnameL().sendKeys("shinde");
	so.workmailL().sendKeys("vs@gmail");
	
	//selecting dropdown job title
	Select sc = new Select(so.jobtitleJ());
	sc.selectByIndex(1);
	
	so.companyC().sendKeys("winjit");
	
	//selecting drodown l=employee
	Select vs = new Select(so.employeesE());
	vs.selectByIndex(3);
	
	so.phoneP().sendKeys("9552617874");
	
	//selecting from dropdown region
	Select vs1 = new Select(so.countryregionR());
	vs1.selectByIndex(21);
	
	
	so.mainserviceM().click();
	
	
	

}
}
