package pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import locator.Locator;

public class Login {
	WebDriver driver;
	Locator lc = new Locator();
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	 public void navlogin() throws InterruptedException {
		 driver.findElement(lc.navlogin_xpath).click();
		 Thread.sleep(10000);
	 }
	 public void credential(String username, String password) throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(lc.email_field_id).sendKeys(username);
		 driver.findElement(lc.password_field_id).sendKeys(password);
		 Thread.sleep(10000);
	 }
	  public void loginbtn() throws InterruptedException {
		  driver.findElement(lc.login_btn_xpath).click();
		  Thread.sleep(10000);
	  }
	 

}
