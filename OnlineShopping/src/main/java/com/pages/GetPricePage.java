package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetPricePage {
	
	WebDriver driver;
	By getBookPrice=By.xpath("//div[@class='a-column a-span2 a-text-right sc-item-right-col a-span-last']//span[contains(@class,'a-size-medium')]");
	public GetPricePage(WebDriver driver){

	       this.driver = driver;
}
	public WebElement getPrice() {
		return driver.findElement(getBookPrice);
	}
}
