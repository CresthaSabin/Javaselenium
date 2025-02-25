package locator;

import org.openqa.selenium.By;

public class Locator {
	//url 
	public String url ="https://gb.bishalkarki.com/index.php";
	// Login Page Locators
	public By navlogin_xpath = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	public By email_field_id = By.id("email");
	public By password_field_id = By.id("passwd");
	public By login_btn_xpath = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	
	//Add to cart 
	public By homepage_id = By.id("header_logo");
	public By prod1_xpath  = By.xpath("//*[@id=\"blocknewproducts\"]/li[1]/div/div[2]/h5/a");
	public By prod2_xpath  = By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a");
	public By addtocart_xpath  = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	public By cont_shopping_xpath = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span");
	public By popular_xpath = By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a");
	
	
	

}
