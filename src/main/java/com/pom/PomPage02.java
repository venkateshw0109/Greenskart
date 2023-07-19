package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage02 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Enter promo code']")
	private WebElement promoCode;
	
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement apply;
	
	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement placeOrder;

	public PomPage02(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getPromoCode() {
		return promoCode;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

}
