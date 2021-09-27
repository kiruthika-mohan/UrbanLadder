package com.Urban.pageObject;

import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Methods;
import com.Urban.UIstore.SizeUI;

public class Size {

	public static void TvUnitsTab(WebDriver driver) throws InterruptedException {
		Methods.clicking(SizeUI.tvunits, driver);
		Methods.Tab(SizeUI.tvsize, driver);
		Methods.tabClick(SizeUI.size, driver);
		Methods.Tab(SizeUI.price, driver);
		Methods.tabClick(SizeUI.range, driver);
		Methods.sizeTV(SizeUI.products, driver);
		Methods.productDetails(SizeUI.title, driver);
	}
}
