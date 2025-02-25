package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

public class LoginTest {
	WebDriver driver = new ChromeDriver();
	
	
  @BeforeTest
  public void beforeTest() {
	  driver.manage().window().maximize();
	  driver.get("https://gb.bishalkarki.com/index.php");
	  
  }@Test
  public void f() throws InterruptedException {
	  Login lg = new Login(driver);
	  lg.navlogin();
	  lg.credential("yovoh22831@intady.com","Testing123");
	  lg.loginbtn();
	 
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
