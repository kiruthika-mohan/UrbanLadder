package com.Urban.pageObject;

import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Methods;
import com.Urban.UIstore.CardsUI;

public class Cards {

	public static void cardstab(WebDriver driver) throws InterruptedException {
		Methods.clicking(CardsUI.giftcards, driver);
		Methods.Greetings(CardsUI.title, CardsUI.greetings, driver);
	}
}
