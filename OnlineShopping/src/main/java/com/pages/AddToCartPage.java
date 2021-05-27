package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {
	WebDriver driver;
	By addToCart = By.xpath("//input[@id='add-to-cart-button']");
	By getBookPrice = By.xpath("//span[@id='newBuyBoxPrice']");

	public AddToCartPage(WebDriver driver) {

		this.driver = driver;

	}

	/**
	 * This method indicates the add to cart
	 */
	public void addToCart() {
		driver.findElement(addToCart).click();
	}

	/**
	 * This method get the addto card price
	 * @return WebElement
	 */
	public WebElement getAddCartPrice() {
		return driver.findElement(getBookPrice);
	}
}
