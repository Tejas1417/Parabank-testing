package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	
	public WebDriver driver;
	private By user=By.xpath("//input[@name='username']");
	private By pass=By.xpath("//input[@type='password']");
	private By Submit=By.xpath("//input[@type='submit']");
	private By validate = By.xpath("//b[contains(text(),'Welcome')]");

	private By contactCust=By.xpath("//a[contains(text(),'contact')]");
	private By sucText=By.xpath("//p[contains(text(),'A Customer Care Representative will be contacting you.')]");
	private By CusName=By.xpath("//input[@id='name']");
	private By CusEmail=By.xpath("//input[@id='name']");
	private By CustMsg=By.xpath("//input[@id='message']");
	private By SendCare=By.xpath("//input[@value='Send to Customer Care']");
	
	public LogInPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement clickSendCare() {
		return driver.findElement(SendCare);
	}
	
	public WebElement validate() {
		return driver.findElement(validate);
	}
	public WebElement entreCustMsg() {
		return driver.findElement(CustMsg);
	}
	public WebElement entreCusEmail() {
		return driver.findElement(CusEmail);
	}
	public WebElement entreCusName() {
		return driver.findElement(CusName);
	}
	public WebElement succontactText() {
		return driver.findElement(sucText);
	}
	public WebElement clickcontactCust() {
		return driver.findElement(contactCust);
	}
	public WebElement clickSubmit() {
		return driver.findElement(Submit);
	}
	public WebElement entrePass() {
		return driver.findElement(pass);
	}
	public WebElement entreUser() {
		return driver.findElement(user);
	}
}
