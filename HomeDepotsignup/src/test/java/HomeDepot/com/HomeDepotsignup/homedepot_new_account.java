package HomeDepot.com.HomeDepotsignup;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class homedepot_new_account {
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  Home_page obj1=new Home_page(driver);
	  register_account obj2=new register_account(driver);
	  obj1.myaccount();
	  obj1.register();
	  obj2.emailfield("thehero2099@gmail.com");
	  obj2.password("Hero@2019!");
	  obj2.zipcode("22002");
	  obj2.phone("202-211-4411");
	  obj2.registerbutton();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yoga\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.navigate().to("https://www.homedepot.com");
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(15000);
	  driver.close();
  }

}
