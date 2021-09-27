package com.Urban.pageObject;

import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Methods;
import com.Urban.UIstore.DecorUI;

public class Decor {

	public static void decorTab(WebDriver driver) throws InterruptedException {
		Methods.Tab(DecorUI.decor, driver);
		Methods.tabClick(DecorUI.footstools, driver);
		Methods.offerdetails(DecorUI.offers, DecorUI.soldOut, driver);
		Methods.Tab(DecorUI.sort, driver);
		Methods.tabClick(DecorUI.newArrive, driver);
		Methods.newArrival(DecorUI.newArrive, driver);
	}
}
