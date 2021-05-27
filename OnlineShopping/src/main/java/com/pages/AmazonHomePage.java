package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
		
	WebDriver driver;
	By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
	By searchButton = By.xpath("//input[@id='nav-search-submit-button']");
	

	public AmazonHomePage(WebDriver driver) {

		this.driver = driver;
	}

	/**
	 *  * This method launch the home page
	 * @param url
	 */
	public void launchURL(String url) {
		driver.get(url);
	}

	/**
	 *  * This method enter the search iteam
	 * @param data
	 */
	public void enterSearchText(String data) {
		driver.findElement(searchBox).sendKeys(data);
		driver.findElement(searchBox).sendKeys(Keys.TAB);
	}

	/**
	 * This method indicates click on search button
	 */
	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}

	
}
