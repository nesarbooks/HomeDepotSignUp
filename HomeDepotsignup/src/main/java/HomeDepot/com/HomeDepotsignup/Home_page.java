package HomeDepot.com.HomeDepotsignup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	static WebDriver driver;

	@FindBy(xpath="//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold'][contains(text(),'My Account')]")
	WebElement myacct;
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement rgstr;
	
	public Home_page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void myaccount () {
		myacct.click();
	}
	public void register () {
		rgstr.click();
	}
}
