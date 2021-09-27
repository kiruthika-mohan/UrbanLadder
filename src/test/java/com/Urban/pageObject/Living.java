package com.Urban.pageObject;

import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Methods;
import com.Urban.UIstore.LivingUI;

public class Living {

	public static void livingTab(WebDriver driver) {
		Methods.Tab(LivingUI.living, driver);
		Methods.tabClick(LivingUI.sofa, driver);
		Methods.Title_img(LivingUI.title,LivingUI.image, driver);
		Methods.tabCart(driver);
		Methods.addCart(LivingUI.cart, driver);
		Methods.verifyCart(LivingUI.verify, driver);
	}
}
