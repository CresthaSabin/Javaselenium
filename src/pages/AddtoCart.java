package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import locator.Locator;

public class AddtoCart {
	WebDriver driver ;
	Locator lc = new Locator();
	
	public AddtoCart(WebDriver driver) {
		this.driver=driver;
	}
	 public void navlogin() throws InterruptedException {
		 driver.findElement(lc.navlogin_xpath).click();
		 Thread.sleep(10000);
	 }
	 @SuppressWarnings("deprecation")
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
	 @SuppressWarnings("deprecation")
	public void homepage() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(lc.homepage_id).click();
	 }
	 public void prod1() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(lc.prod1_xpath).click();
	 }
	 public void addtocart() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(lc.addtocart_xpath).click();
	 }
	 public void contshop() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(lc.cont_shopping_xpath).click();
	 }
	
	 public void popular() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(lc.popular_xpath).click();
	 }
	 public void prod2() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(lc.prod2_xpath).click();
	 }
	
	 

}
