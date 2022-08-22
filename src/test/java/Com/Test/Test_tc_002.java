package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPagePom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_tc_002 extends BaseClass {

	
	@Test
	public void Test_Login_invalidData() {
		
		LoginPagePom login=PageFactory.initElements(driver, LoginPagePom.class);
		Library.Custom_SendKeys(login.getEmail(), "Akash@gmail.com");
		Library.Custom_SendKeys(login.getPass(), null);
	    Library.Custom_Click(login.getLogin_btn());
	}
}
