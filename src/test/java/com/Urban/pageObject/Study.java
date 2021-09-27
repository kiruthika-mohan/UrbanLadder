package com.Urban.pageObject;

import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Methods;
import com.Urban.UIstore.StudyUI;

public class Study {

	public static void studyTab(WebDriver driver) {
		Methods.Tab(StudyUI.study, driver);
		Methods.tabClick(StudyUI.chairs, driver);
		Methods.Tab(StudyUI.sort, driver);
		Methods.tabClick(StudyUI.high2low, driver);
		Methods.listPrice(StudyUI.price, driver);
	}
}
