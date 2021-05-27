package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.util.KeyWords;

public class AmazonSearchPage {
	WebDriver driver;
	By searchBook = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
	By addToCart = By.xpath("//input[@id='add-to-cart-button']");
	By price = By.xpath("(//span[@class='a-price-whole'])[1]");

	public AmazonSearchPage(WebDriver driver) {

		this.driver = driver;

	}

	/**
	 * This method indicates select the iteam
	 */
	public void clickOnBook() {
		driver.findElement(searchBook).click();
	}

	/**
	 * This method verify selected the iteam is selected
	 * @return
	 */
	public boolean SelectBook() {

		boolean selectthebook = driver.findElement(searchBook).isSelected();
		System.out.println(" selected >>" + selectthebook);
		return selectthebook;
	}

	/**
	 * This method selecting the addToCart button
	 */
	public void AddToCart() {
		driver.findElement(addToCart).click();
	}

	/**
	 * This method get iteam price
	 * @return WebElement
	 */
	public WebElement getPrice() {
		KeyWords.explicitWait(driver, price);
		return driver.findElement(price);
	}
}