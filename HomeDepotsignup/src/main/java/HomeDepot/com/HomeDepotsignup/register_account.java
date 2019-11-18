package HomeDepot.com.HomeDepotsignup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register_account {
	static WebDriver driver;

	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='password-input-field']")
	WebElement pswd;
	@FindBy(xpath="//input[@id='zipCode']")
	WebElement zipc;
	@FindBy(xpath="//input[@id='phone']")
	WebElement phn;
	@FindBy(xpath="//span[contains(text(),'Create an Account')]")
	WebElement regstbutton;
	
	public register_account (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void emailfield(String emailadd) {
		email.sendKeys(emailadd);
	}
	public void password (String pswrd) {
		pswd.sendKeys(pswrd);
	}
	public void zipcode (String zpcode) {
		zipc.sendKeys(zpcode);
	}
	public void phone (String phnumber) {
		phn.sendKeys(phnumber);
	}
	public void registerbutton () {
		regstbutton.click();
	}
}
