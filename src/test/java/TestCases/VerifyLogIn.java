package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.CommonMethod;
import PageObjectModel.LogInPage;
import Resources.BaseClass;
import Resources.Constant;

public class VerifyLogIn extends BaseClass{
	SoftAssert assertions = new SoftAssert();

	public LogInPage LOG;
	
	@Test(priority=1)
   public void Login() {
	   LOG=new LogInPage(driver);
	   LOG.entreUser().sendKeys(VrifyRegester.username);
	   LOG.entrePass().sendKeys(Constant.Password);
	   LOG.clickSubmit().click();
	   String act=LOG.validate().getText();
	   String exp="Welcome";
	   assertions.assertNotEquals(act, exp, "not open to login page");
   }
	
/*	@Test(priority=2)
	public void Customer() {
		
     LOG.clickSubmit().click();
	 LOG.entreCusName().sendKeys(Constant.firstName);
	 LOG.entreCusEmail().sendKeys(Constant.CustEmail);
	 LOG.clickcontactCust().click();
		   
	 String actsuccontactText=LOG.succontactText().getText();
	 String ExpsuccontactText=Constant.SuccesReg;
	 CommonMethod.handleAssersions(actsuccontactText,ExpsuccontactText, "customer care contact success text did not match");
	}
	*/
	
}
