package com.Urban.UIstore;

import org.openqa.selenium.By;

public class SearchingUI {

	public static By searchtab=By.xpath("//input[@class='typeahead tt-input']");////input[@class='typeahead tt-input']
	//tDZNG _2pmB6
	public static By price=By.cssSelector(".caret");
	public static By range=By.id("price_limit_780-1019");
	public static By verify=By.cssSelector(".selrange-filter");
	public static By close=By.cssSelector("span[class='close icofont icofont-cross']");
}
