package com.Urban.pageObject;

import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Methods;
import com.Urban.UIstore.StorageUI;
import com.Urban.UIstore.UrbanUI;

public class Storage {

	public void storageTab(WebDriver driver) {
		Methods.Tab(StorageUI.storage, driver);
		Methods.tabClick(StorageUI.dressers, driver);
		Methods.verifyTitle(StorageUI.title, driver);
		Methods.count(StorageUI.links,StorageUI.product, driver);
	}
}
