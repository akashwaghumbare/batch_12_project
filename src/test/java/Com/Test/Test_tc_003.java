package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPagePom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_tc_003 {

	public class Test_tc_001 extends BaseClass {

		
		@Test
		public void Test_Login_invalidData() {
			
			LoginPagePom login=PageFactory.initElements(driver, LoginPagePom.class);
			Library.Custom_SendKeys(login.getEmail(),excel.getStringData("Sheet1", 0, 0));
			Library.Custom_SendKeys(login.getPass(), excel.getStringData("Sheet1", 0, 1));
		    Library.Custom_Click(login.getLogin_btn());
		}
	}

	
	
	
	
	
	
	
	
}
