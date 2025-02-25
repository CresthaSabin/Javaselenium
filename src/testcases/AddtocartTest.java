package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import locator.Locator;
import pages.AddtoCart;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AddtocartTest {
	WebDriver driver = new ChromeDriver();
	Locator lc = new Locator();
	AddtoCart atc = new AddtoCart(driver);
	
    @BeforeTest
  public void beforeTest() {
    	driver.manage().window().maximize();
    	driver.get(lc.url);
    	
  }
    @Test
  public void f() throws InterruptedException {
    	
    	atc.navlogin();
    	Thread.sleep(2000);
    	atc.credential("yovoh22831@intady.com","Testing123");
    	Thread.sleep(2000);
    	atc.loginbtn();
    	Thread.sleep(2000);
    	atc.homepage();
    	Thread.sleep(2000);
    	atc.prod1();
    	Thread.sleep(2000);
    	atc.addtocart();
    	Thread.sleep(2000);
    	atc.contshop();
    	Thread.sleep(2000);
    	atc.homepage();
    	Thread.sleep(2000);
    	atc.popular();
    	Thread.sleep(2000);
    	atc.prod2();
    	Thread.sleep(2000);
    	atc.addtocart();
    	Thread.sleep(2000);
    	
  }
    


  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
