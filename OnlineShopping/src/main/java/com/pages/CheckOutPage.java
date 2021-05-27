package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	WebDriver driver;
	By checkOutPrice = By.xpath("(//span[@class='a-color-price hlb-price a-inline-block a-text-bold'])[1]");
	By proceedToCheckOutBtn = By.xpath("(//a[contains(text(),'Proceed to checkout')])[1]");

	
	public CheckOutPage(WebDriver driver) {

		this.driver = driver;

	}

	/**
	 * This method indicates get checkout price value
	 * @return WebElement
	 */
	public WebElement getcheckOutPrice() {
		return driver.findElement(checkOutPrice);
	}

	/**
	 * This method indicates selecting
	 * proceed to checkout button
	 */
	public void proceedTocheckOut() {
		driver.findElement(proceedToCheckOutBtn).click();
	}

}