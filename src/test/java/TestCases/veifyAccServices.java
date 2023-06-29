package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.AccountServices;

import PageObjectModel.CommonMethod;
import PageObjectModel.LogInPage;
import PageObjectModel.RegesterPageObject;
import Resources.BaseClass;
import Resources.Constant;

public class veifyAccServices extends BaseClass {
	SoftAssert assertions = new SoftAssert();

	public AccountServices AS;
	public LogInPage LOG;
	public WebElement selectaccount;
	@Test
	   public void Login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LOG=new LogInPage(driver);
	    LOG.entreUser().sendKeys(VrifyRegester.username);
	   // LOG.entreUser().sendKeys(Constant.Username);
	    LOG.entrePass().sendKeys(Constant.Password);
	    LOG.clickSubmit().click();
	    
	  	
		 AS=new AccountServices(driver);
//opennewaccount
		 AS.opennewaccount().click();
		 Select dropdown = new Select(AS.selectaccount());
		 dropdown.selectByVisibleText("SAVINGS"); 
		 Select dropdown1 = new Select(AS.selectaccountnumber());
		 dropdown1.selectByIndex(0);
		 Thread.sleep(2000);
		 AS.opennewaccountclk().click();
		 String act=AS.validopennewacnt().getText();
		 String exp="Congratulations, your account is now open.";
		 assertions.assertEquals(act, exp, "account not open");
		 
//acountoverview
		 
		  AS.clickAccountsOverview().click();
		  String act1=AS.accountoverviewvalid().getText();
		  String exp1="Accounts Overview";
		  assertions.assertEquals(act, exp, "account not overview");
		  

//find transaction  
		 AS.clickFindTransactions().click();
		/* Select selectaccount = new Select(AS.selectaccount());
		 selectaccount.selectByIndex(0);*/
		
		AS.date().sendKeys("06-28-2023");
		 Thread.sleep(2000);
		 AS.findtransctionbutton().click();
		/* AS.ammount1().sendKeys("1000");
		 Thread.sleep(2000);
		 AS.findtrance ().click();*/
		 String act3=AS.FindTransevalid().getText();
		 String exp3="Transaction Results";
		  assertions.assertEquals(act, exp, "results");

		 
		 
//update profile		
		 AS.clickUpdateCon().click();
		 AS.firstname().sendKeys("RAM");
		 AS.lastname().sendKeys("SWAMI");
		 AS.aadress().sendKeys("PUNE");
		 AS.city1().sendKeys("PUNE");
		 AS.state1().sendKeys("UP");
		 AS.zipcode1().sendKeys("146233");
		 AS.phonenumber1().sendKeys("7854569845");
		 AS.updateprofile().click();
		 String act4=AS.updatevalid().getText();
		 String exp4="Your updated address and phone number have been added to the system. ";
		  assertions.assertEquals(act, exp, "update msg not given");

		 
//request loan
		 AS.clickReqLoan().click();
		 AS.loanammount().sendKeys("10000");
		 AS.downpayment().sendKeys("1200");
		 Select dropdown2 = new Select(AS.fromaccount());
		 dropdown2.selectByIndex(0);
		Thread.sleep(2000);
		 AS.applynow().click();
		 String act5=AS.loanvalid().getText();
		 String exp5="Congratulations, your loan has been approved.";
		  assertions.assertEquals(act, exp, "loan msg not given");

		 
//billpay
		 AS.clickBillPay().click();
		 AS.entrepayee().sendKeys(Constant.firstName);
		 AS.PayeeAdd().sendKeys(Constant.State);
		 AS.payeeCity().sendKeys(Constant.City);
		 AS.payeeState().sendKeys(Constant.State);
		 AS.PayeeZip().sendKeys(Constant.ZipCode);
		 AS.payeePhNo().sendKeys(Constant.PhoneNum);
		 AS.payeeAccNo().sendKeys("16089");
		 AS.payeeveriAcc().sendKeys("16089");
		 Thread.sleep(1000);
		 AS.payeeAmo().sendKeys(Constant.Ammount);
		 Select accountfrm = new Select(AS.accountfrm());
		 accountfrm.selectByIndex(0);
		
		 Thread.sleep(2000);
		 AS.clickSendPay().click();
		 String act6=AS.billvalid().getText();
		 String exp6="Bill Payment Complete";
		  assertions.assertEquals(act, exp, "payment not complete");
		  
	//transferfund		  
			 AS.clickTransferFunds().click();
			 AS.clickBillPay().click();
			 AS.clickTransferFunds().click();
			 Thread.sleep(2000);
			 AS.ammount().sendKeys("1000");
			 Thread.sleep(2000);
			 Select fromacnt = new Select(AS.frmacnt());
			 fromacnt.selectByIndex(0); 
			 Select toacnt = new Select(AS.toacnt());
			 toacnt.selectByIndex(0);
			 Thread.sleep(2000);
			 
			 AS.trancefer().click();
			 String act2=AS.trancefervalid().getText();
			 String exp2="Transfer Complete!";
			  assertions.assertEquals(act, exp, "ammount not trancefer");


//logout
		 AS.logout().click();
		 String act7=AS.logvalid().getText();
		 String exp7="Experience the difference";
		  assertions.assertEquals(act, exp, "logout");

	   }
}
