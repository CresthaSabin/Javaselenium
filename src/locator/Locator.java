package locator;

import org.openqa.selenium.By;

public class Locator {
	// Login Page Locators
	public By navlogin_xpath = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	public By email_field_id = By.id("email");
	public By password_field_id = By.id("passwd");
	public By login_btn_xpath = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	

}
