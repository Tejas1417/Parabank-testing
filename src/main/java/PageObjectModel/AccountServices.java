package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountServices {
	

		
		public WebDriver driver;
//open new account
		private By opennewaccount=By.xpath("//a[contains(text(),'Open New Account')]");
		
		private By selectaccount = By.xpath("//select[@ng-model=\"types.selectedOption\"]");
	       
		private By selectaccountnumber = By.xpath("//select[@ng-model=\"accounts.selectedOption\"]");

		private By opennewaccountclk = By.xpath("//input[@value=\"Open New Account\"]");
		
		private By validopennewacnt=By.xpath("//p[contains(text(),'Congratulations, your account is now open.')]");

//account overview
		private By AccOverview=By.xpath("//a[contains(text(),'Accounts Overview')]");
		private By accountoverviewvalid = By.xpath("//h1[contains(text(),'Accounts Overview')]");
		
//fund trancfer
		private By TransferFunds=By.xpath("//a[contains(text(),'Transfer Funds')]");
		private By ammount = By.xpath("//input[@id=\"amount\"]");
		private By frmacnt=By.xpath("//select[@id=\"fromAccountId\"]");
		private By toacnt=By.xpath("//select[@id=\"toAccountId\"]");

		private By trancefer = By.xpath("//input[@value=\"Transfer\"]");
        private By trancefervalid=By.xpath("//h1[contains(text(),'Transfer Complete!')]");
		
//bill pay
		private By BillPay=By.xpath("//a[contains(text(),'Bill Pay')]");
		private By payee=By.xpath("//input[@name='payee.name']");
		private By Add=By.xpath("//input[@name='payee.address.street']");
		private By city=By.xpath("//input[@name='payee.address.city']");
		private By payState=By.xpath("//input[@name='payee.address.state']");
		private By zip=By.xpath("//input[@name='payee.address.zipCode']");
		private By phNo=By.xpath("//input[@name='payee.phoneNumber']");
		private By Acc=By.xpath("//input[@name='payee.accountNumber']");
		private By veriAcc=By.xpath("//input[@name='verifyAccount']");
		private By Amm=By.xpath("//input[@name=\"amount\"]");
		private By accountfrm=By.xpath("//select[@name=\"fromAccountId\"]");
		private By SendPay=By.xpath("//input[@value='Send Payment']");
		private By billvalid=By.xpath("//h1[contains(text(),'Bill Payment Complete')]");
//findtranction	
		private By FindTransactions=By.xpath("//a[contains(text(),'Find Transactions')]");
		private By date = By.xpath("//input[@ng-model=\"criteria.onDate\"]");
		private By findtransctionbutton = By.xpath("(//button[contains(text(),'Find Transactions')])[2]    ");
		private By ammount1 = By.xpath("//input[@ng-model=\"criteria.amount\"]");
		private By findtrance = By.xpath("(//button[contains(text(),'Find Transactions')])[4]    ");
		private By findtrancevalid=By.xpath("//h1[contains(text(),'Transaction Results')]");
		
//updateprofile
		private By UpdateCon=By.xpath("//a[contains(text(),'Update Contact Info')]");
		private By firstname = By.xpath("//input[@name=\"customer.firstName\"]");
		private By lastname = By.xpath("//input[@name=\"customer.lastName\"]");
		private By aadress = By.xpath("//input[@name=\"customer.address.street\"]");
		private By city1 = By.xpath("//input[@name=\"customer.address.city\"]");
		private By state1 = By.xpath("//input[@name=\"customer.address.state\"]");
		private By zipcode = By.xpath("//input[@name=\"customer.address.zipCode\"]");
		private By phonenumber = By.xpath("//input[@name=\"customer.phoneNumber\"]");
		private By updateprofile = By.xpath("//input[@value=\"Update Profile\"]");
		private By updatevalid=By.xpath("//p[contains(text(),'Your updated address and phone number have been added to the system.')]");
//reqlaon
		private By ReqLoan=By.xpath("//a[contains(text(),'Request Loan')]");
		private By loanammount = By.xpath("//input[@id=\"amount\"]");
		private By downpayment = By.xpath("//input[@id=\"downPayment\"]");
		private By fromaccount = By.xpath("//select[@id=\"fromAccountId\"]");
		private By applynow = By.xpath("//input[@value=\"Apply Now\"]");
		private By loanvalid=By.xpath("//p[contains(text(),'Congratulations, your loan has been approved.')]");

		private By Amount=By.xpath("//input[@id='amount']");
		private By Transfer=By.xpath("//input[@value='Transfer']");
		private By TransferComp=By.xpath("//h1[@class='title']");
		private By FindTransac=By.xpath("//h1[contains(text(),'Find Transactions')]");
		//private By newAcc=By.xpath("//a[contains(text(),'Open New Account')]");
//logout		
		private By logout=By.xpath("//a[contains(text(),'Log Out')]");
        private By logvalid=By.xpath("//p[contains(text(),'the difference')]");
		
		
		
		public AccountServices(WebDriver driver2) {
			this.driver=driver2;
		}
		
		public WebElement logvalid() {
			return driver.findElement(logvalid);
		}
		
		public WebElement opennewaccount() {
			return driver.findElement(opennewaccount);
		}
		public WebElement selectaccount() {
			return driver.findElement(selectaccount);
		}
		public WebElement selectaccountnumber() {
			return driver.findElement(selectaccountnumber);
		}
		public WebElement opennewaccountclk() {
			return driver.findElement(opennewaccountclk);
		}
		
		public WebElement clickAccountsOverview() {
			return driver.findElement(AccOverview);
		}
		public WebElement validopennewacnt() {
			return driver.findElement(validopennewacnt);
		}
		public WebElement accountoverviewvalid() {
			return driver.findElement(accountoverviewvalid);
		}
	
	//	public WebElement newAcc() {
		//	return driver.findElement(newAcc);
	//	}
		public WebElement FindTransacText() {
			return driver.findElement(FindTransac);
		}
		public WebElement FindTransevalid() {
			return driver.findElement(findtrancevalid);
		}
		
		public WebElement TransferCompText() {
			return driver.findElement(TransferComp);
		}
		public WebElement amoTransfer() {
			return driver.findElement(Transfer);
		}
		public WebElement trancefervalid() {
			return driver.findElement(trancefervalid);
		}
		
		public WebElement entreAmount() {
			return driver.findElement(Amount);
		}
		public WebElement frmacnt() {
			return driver.findElement(frmacnt);
		}
		public WebElement toacnt() {
			return driver.findElement(toacnt);
		}
		
		
		public WebElement clickReqLoan() {
			return driver.findElement(ReqLoan);
		}
		public WebElement loanammount() {
			return driver.findElement(loanammount);
		}
		public WebElement loanvalid() {
			return driver.findElement(loanvalid);
		}


		public WebElement downpayment() {
			return driver.findElement(downpayment);
		}

		public WebElement fromaccount() {
			return driver.findElement(fromaccount);
		}

		public WebElement applynow() {
			return driver.findElement(applynow);
		}


		public WebElement clickUpdateCon() {
			return driver.findElement(UpdateCon);
		}
		public WebElement clickFindTransactions() {
			return driver.findElement(FindTransactions);
		}
		public WebElement firstname() {
			return driver.findElement(firstname);
		}

		public WebElement lastname() {
			return driver.findElement(lastname);
		}

		public WebElement aadress() {
			return driver.findElement(aadress);
		}

		public WebElement city1() {
			return driver.findElement(city1);
		}

		public WebElement state1() {
			return driver.findElement(state1);
		}

		public WebElement zipcode1() {
			return driver.findElement(zipcode);
		}

		public WebElement phonenumber1() {
			return driver.findElement(phonenumber);
		}

		public WebElement updateprofile() {
			return driver.findElement(updateprofile);
		}


		public WebElement clickBillPay() {
			return driver.findElement(BillPay);
		}
		public WebElement clickTransferFunds() {
			return driver.findElement(TransferFunds);
		}
		public WebElement date() {
			return driver.findElement(date);
		}

		public WebElement findtransctionbutton() {
			return driver.findElement(findtransctionbutton);
		}

		public WebElement ammount1() {
			return driver.findElement(ammount1);
		}

		public WebElement findtrance() {
			return driver.findElement(findtrance);
		}

		public WebElement ammount () {
			return driver.findElement(ammount );
		}
		public WebElement trancefer () {
			return driver.findElement(trancefer );
		}
		
		public WebElement logout() {
			return driver.findElement(logout);
		}
		public WebElement updatevalid() {
			return driver.findElement(updatevalid);
		}
		
		
		public WebElement payeeState() {
			return driver.findElement(payState);
		}
		public WebElement clickSendPay() {
			return driver.findElement(SendPay);
		}
		public WebElement payeeAmo() {
			return driver.findElement(Amm);
		}
		public WebElement payeeveriAcc() {
			return driver.findElement(veriAcc);
		}
		public WebElement payeeAccNo() {
			return driver.findElement(Acc);
		}
		public WebElement payeePhNo() {
			return driver.findElement(phNo);
		}
		public WebElement PayeeZip() {
			return driver.findElement(zip);
		}
		public WebElement PayeeAdd() {
			return driver.findElement(Add);
		}
		public WebElement entrepayee() {
			return driver.findElement(payee);
		}
		public WebElement payeeCity() {
			return driver.findElement(city);
		}
		public WebElement accountfrm() {
			return driver.findElement(accountfrm);
		}
		
		public WebElement billvalid() {
			return driver.findElement(billvalid);
		}
	
	}


