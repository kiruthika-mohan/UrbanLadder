package com.Urban.pageObject;

import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Methods;
import com.Urban.UIstore.UrbanUI;

public class Urban {

	public void Close(WebDriver driver) throws InterruptedException {
		Methods.clicking(UrbanUI.close, driver);
	}
	public static void login(WebDriver driver) {
		Methods.Tab(UrbanUI.login, driver);
		Methods.tabClick(UrbanUI.loginclick, driver);
	}
	public static void Email(WebDriver driver,String email) throws InterruptedException {
		Methods.getEmail(UrbanUI.email, driver, email);
	}
	public static void password(WebDriver driver,String password) throws InterruptedException {
		Methods.getPassword(UrbanUI.password, driver, password);
	}
	public static void signUp(WebDriver driver) throws InterruptedException {
		Methods.clicking(UrbanUI.signup, driver);
	}
}
