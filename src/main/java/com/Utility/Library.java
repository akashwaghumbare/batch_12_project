package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Library {

	
	public static void Custom_SendKeys(WebElement element,String Value) {
		try {
		element.sendKeys(Value);
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public static void Custom_Click(WebElement element) {
		
		try {
		element.click();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

	public static void Handle_DropDown(WebElement element,String Text) {
		
		try {
		Select select=new Select(element);
		select.selectByVisibleText(Text);
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		}
		
	
	
	
	
}
