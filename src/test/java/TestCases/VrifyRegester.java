package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.CommonMethod;
import PageObjectModel.RegesterPageObject;
import Resources.BaseClass;
import Resources.Constant;
import Resources.RanGen;
 
   
   public class VrifyRegester extends BaseClass {
	   public static String username;
		
	public RegesterPageObject REG;
	 @Test  
	public void Regester() {
		
	REG=new RegesterPageObject(driver);
    REG.clickOnRegester().click();
    REG.entreFirstName().sendKeys(Constant.firstName);
  	REG.entreLastName().sendKeys(Constant.lastName);
  	REG.entreAddress().sendKeys(Constant.Address);
  	REG.entreCity().sendKeys(Constant.City);
  	REG.entreState().sendKeys(Constant.City);
  	REG.entreZipCode().sendKeys(Constant.ZipCode);
  	REG.entrePhoneNo().sendKeys(Constant.PhoneNum);
  	REG.entreSSN().sendKeys(Constant.SSN);
  	username=RanGen.result;
  	REG.entreUsername().sendKeys(username);
  	//REG.entreUsername().sendKeys(Constant.Username);
  	REG.entrePassword().sendKeys(Constant.Password);
  	REG.entreConfirm().sendKeys(Constant.Confirm);
  	REG.Regester().click();
  	
  	String actRegSuccessText=REG.RegSuccessText().getText();
   	String RegExpSuccessText=Constant.SuccesReg;
   	CommonMethod.handleAssersions(actRegSuccessText,RegExpSuccessText, "Regester success massage did not match");
   	
	}
}
