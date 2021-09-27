package com.Urban.UIstore;

import org.openqa.selenium.By;

public class UrbanUI {

	public static By close=By.cssSelector("a[data-gaaction='popup.auth.close']");
	public static By login=By.cssSelector(".header__topBarIconList_profile-icon");
	public static By loginclick=By.cssSelector("a[class='login-link authentication_popup']");
	public static By email=By.cssSelector("input[class='email required input_authentication']");//spree_user_email
	public static By password=By.cssSelector("input[class='required input_authentication']");
	public static By signup=By.id("ul_site_login");
}
