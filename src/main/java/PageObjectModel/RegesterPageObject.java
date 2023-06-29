package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegesterPageObject {

	public WebDriver driver;
	private By Reg=By.xpath("//a[contains(text(),'Register')]");
	private By titleRegester=By.xpath("//h1[@class='title']");
	private By FirstName=By.xpath("//input[@id='customer.firstName']");
	private By LastName=By.xpath("//input[@id='customer.lastName']");
	private By Address=By.xpath("//input[@id='customer.address.street']");
	private By City=By.xpath("//input[@id='customer.address.city']");
	private By State=By.xpath("//input[@id='customer.address.state']");
	private By ZipCode=By.xpath("//input[@id='customer.address.zipCode']");
	private By PhoneNo=By.xpath("//input[@id='customer.phoneNumber']");
	private By SSN=By.xpath("//input[@id='customer.ssn']");
	private By Username=By.xpath("//input[@id='customer.username']");
	private By Password=By.xpath("//input[@id='customer.password']");
	private By Confirm=By.xpath("//input[@id='repeatedPassword']");
	private By Regester=By.xpath("//input[@value='Register']");
	private By RegSuccess=By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in.')]");
	private By logout=By.xpath("//input[@value='Register']");
	
	public RegesterPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement clicklogout() {
		return driver.findElement(logout);
	}
	public WebElement RegSuccessText() {
		return driver.findElement(RegSuccess);
	}
	public WebElement Regester() {
		return driver.findElement(Regester);
	}
	public WebElement entreConfirm() {
		return driver.findElement(Confirm);
	}
	public WebElement entrePassword() {
		return driver.findElement(Password);
	}
	public WebElement entreUsername() {
		return driver.findElement(Username);
	}
	public WebElement entreState() {
		return driver.findElement(State);
	}
	public WebElement entreSSN() {
		return driver.findElement(SSN);
	}
	public WebElement entrePhoneNo() {
		return driver.findElement(PhoneNo);
	}
	public WebElement entreZipCode() {
		return driver.findElement(ZipCode);
	}
	public WebElement entreCity() {
		return driver.findElement(City);
	}
	public WebElement entreAddress() {
		return driver.findElement(Address);
	}
	public WebElement entreLastName() {
		return driver.findElement(LastName);
	}

	public WebElement clickOnRegester() {
		return driver.findElement(Reg);
	}
	public WebElement GettitleRegester() {
		return driver.findElement(titleRegester);
	}
	public WebElement entreFirstName() {
		return driver.findElement(FirstName);
	}
}
