package com.Urban.pageObject;

import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Methods;
import com.Urban.UIstore.ColoursUI;

public class Colours {

	public static void choose(WebDriver driver) {
		Methods.Tab(ColoursUI.living, driver);
		Methods.tabClick(ColoursUI.sofa, driver);
		Methods.Title_img(ColoursUI.title, ColoursUI.image, driver);
		Methods.tabCart(driver);
		Methods.colorChoose(ColoursUI.select1, ColoursUI.clr, driver);
		Methods.colorChoose(ColoursUI.select2, ColoursUI.clr, driver);
		Methods.colorChoose(ColoursUI.select3, ColoursUI.clr, driver);
		Methods.colorChoose(ColoursUI.select4, ColoursUI.clr, driver);
		Methods.colorChoose(ColoursUI.select5, ColoursUI.clr, driver);
		Methods.colorChoose(ColoursUI.select6, ColoursUI.clr, driver);
	}
}
