package com.Urban.UIstore;

import org.openqa.selenium.By;

public class StudyUI {
	
	public static By study=By.cssSelector("li[class='topnav_item studyunit']");
    public static By chairs=By.xpath("//a[@href='/study-chair?src=g_topnav_study_study-chairs_study-chairs']");
    public static By sort=By.cssSelector("div[data-group='sorting']");
    public static By high2low=By.cssSelector("li[data-key='price_desc']");
    public static By price=By.cssSelector(".price-number");
}
