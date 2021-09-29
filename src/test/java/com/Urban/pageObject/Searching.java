package com.Urban.pageObject;

import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Methods;
import com.Urban.UIstore.SearchingUI;

public class Searching {
	
	public static void searchTab(WebDriver driver,String key) throws InterruptedException {
		Methods.clickSearch(SearchingUI.searchtab, driver, key);
		Methods.Tab(SearchingUI.price, driver);
		Methods.tabClick(SearchingUI.range, driver);
		//Methods.verifyPriceRange(SearchingUI.close, driver);
	}

}
