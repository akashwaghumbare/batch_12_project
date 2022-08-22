package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPagePom;
import com.Utility.BaseClass;

public class Test_tc_001 extends BaseClass {

	
	@Test
	public void Login_test_ValidData () {
		
		LoginPagePom login=PageFactory.initElements(driver, LoginPagePom.class);
		login.getEmail().sendKeys("Akashwaghumbare@gmail.com");
		login.getPass().sendKeys("Akash@123");
		login.getLogin_btn().click();
		
	}
	
	
	
	
	
}
