package com.Urban.UIstore;

import org.openqa.selenium.By;

public class SizeUI {

	public static By tvunits=By.cssSelector("a[href='/tv-units?src=explore_categories']");
	public static By tvsize=By.cssSelector("li[data-group='tv size']");
	public static By size=By.cssSelector("label[for='filters_recommended_tv_size_Above_50_inches']");
	public static By price=By.cssSelector("li[data-group='price']");
	public static By range=By.id("price_limit_20000-74999");
	public static By products=By.cssSelector("li[class='product hovercard psticker']");
	public static By title=By.cssSelector("a[class='product-title-block']");
	
}
