package com.Urban.pageObject;

import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Methods;
import com.Urban.UIstore.MattressesUI;

public class Mattresses {
	
	public static void matTab(WebDriver driver) throws InterruptedException {
		Methods.Tab(MattressesUI.mat, driver);
		Methods.tabClick(MattressesUI.range, driver);
		//Methods.verifyTitle(MattressesUI.title, driver);
		Methods.matTypes(MattressesUI.title,MattressesUI.names, driver);
	}
}
