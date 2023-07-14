package com.naveenautomationlabs.AutomationFramework;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages1.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.Pages1.ForgotYourPassword;
import com.naveenautomationlabs.AutomationFramework.Pages1.MyAccount;
import com.naveenautomationlabs.AutomationFramework.Pages1.WishList;
import com.naveenautomationlabs.AutomationFramework.Pages1.WishList.MyWishListTable;
import com.naveenautomationlabs.AutomationFramework.Pages1.YourStore;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class WishListTest extends TestBase {

	YourStore yourStore;
	AccountLogin accountLogin;
	ForgotYourPassword forgotYourPassword;
	WishList mwlist;

	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStore();
		yourStore.clickMyAccountBtn();
		AccountLogin loginPg = yourStore.clickLoginBtn();
		MyAccount myAccount = loginPg.loginToPortal();
		mwlist = myAccount.clickOnWishListButton();

	}

	@Test
	public void test2() {
		Assert.assertEquals(false, false);
	}

	@Test(enabled = true)
	public void test1() {
		WebElement element = mwlist.getCellElementFromTable(MyWishListTable.STOCK, "Product 15");
		System.out.println(element.getText());
	}
}

