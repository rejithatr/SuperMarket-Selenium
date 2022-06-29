package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtility;
import com.supermarket.utilities.PropHandler;

public class VerifyUsersPage {
	WebDriver driver;
	PropHandler prop = new PropHandler();
	GeneralUtility generalutility;

	@FindBy(xpath = "//li[5]//a")
	private WebElement verifyUsersButton;

	public VerifyUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String checkVisibilityofVerifyUsersofPage() {
		generalutility = new GeneralUtility(driver);
		String attributeValue = generalutility.getAttributeValue(verifyUsersButton, "class");		
		System.out.println(attributeValue);
		return attributeValue;
	}
	

}
