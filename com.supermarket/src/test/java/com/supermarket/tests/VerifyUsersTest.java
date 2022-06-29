package com.supermarket.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.supermarket.base.BaseClass;
import com.supermarket.pages.HomePage;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.VerifyUsersPage;

public class VerifyUsersTest extends BaseClass {

	LoginPage loginpage;
	SoftAssert softassert;
	VerifyUsersPage verifyuserspage;

	@Test
	public void verifyVisibilityOfUsers()
	{
		loginpage = new LoginPage(driver);
		loginpage.loginUtility();
		verifyuserspage = new VerifyUsersPage(driver);		
		String expectedAttribute="nav-link";
		verifyuserspage.checkVisibilityofVerifyUsersofPage();
		
	}
	
}
