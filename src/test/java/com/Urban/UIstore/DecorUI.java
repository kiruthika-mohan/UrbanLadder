package com.Urban.UIstore;

import org.openqa.selenium.By;

public class DecorUI {

	public static By decor=By.cssSelector("li[class='topnav_item decorunit']");
	public static By footstools=By.cssSelector("a[href='/footstools?src=g_topnav_decor_ottoman-pouffe_footstools']");
	public static By offers=By.cssSelector(".listing-discount-ribbon-content");
	public static By soldOut=By.cssSelector("div[class='outofstock_text ribbon fill']");
	public static By sort=By.cssSelector("div[data-group='sorting']");
	public static By newArrive=By.cssSelector("li[data-key='new_arrival']");//new_arrival
	public static By products=By.cssSelector("img[class='lazy product-img-default']");
}
