package com.test.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.scripts.BaseClass;
import com.pages.AddToCartPage;
import com.pages.AmazonHomePage;
import com.pages.AmazonSearchPage;
import com.pages.CheckOutPage;
import com.util.Util;



public class TestAmazon extends BaseClass {
	
	String searchPrice="";
	String addToCartPrice="";
	
	/**
	 * This method indicates the launch the amazon page
	 */
	@Test(priority = 1)
	public void launchAmazonPage() {
		AmazonHomePage amazonPage=new AmazonHomePage(driver);
		amazonPage.launchURL("https://www.amazon.com/");
	}
	
	/**
	 * This method indicates the search iteam in amazon page
	 */
	@Test(dependsOnMethods ="launchAmazonPage" )
	public void searchIteam() {
		AmazonHomePage amazonPage=new AmazonHomePage(driver);
		amazonPage.enterSearchText("qa testing for beginners");		
		amazonPage.clickSearchButton();		
	}
	
	/**
	 * This method indicates add to Cart the selected iteam
	 */
	@Test(dependsOnMethods ="searchIteam" )
	public void addToCard() {
		AmazonSearchPage amazonSearchPage=new AmazonSearchPage(driver);		
		searchPrice=amazonSearchPage.getPrice().getText();
		amazonSearchPage.clickOnBook();
		AddToCartPage addCardPage=new AddToCartPage(driver);
		addToCartPrice=addCardPage.getAddCartPrice().getText();
		addToCartPrice=Util.getPrice(addToCartPrice);		
		Assert.assertEquals(searchPrice,addToCartPrice);
		addCardPage.addToCart();
	}
	
	/**
	 * This method indicates checkout the iteam
	 */
	@Test(dependsOnMethods ="addToCard" )
	public void checkOut() {
		CheckOutPage checkOutPage=new CheckOutPage(driver);
		String checkOutPrice=checkOutPage.getcheckOutPrice().getText();
		checkOutPrice=Util.getPrice(checkOutPrice);
		Assert.assertEquals(checkOutPrice,addToCartPrice);
		checkOutPage.proceedTocheckOut();
	}
	
	
}
