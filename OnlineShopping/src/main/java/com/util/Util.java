package com.util;

public class Util {
	
	/**
	 * This method indicates the
	 * covert to price value
	 * @param price
	 * @return String
	 */
	public static String getPrice(String price) {
		price=price.replace("$", "");
		String costVal[]=price.split("\\.");
		if(costVal.length>0){
			return costVal[0];
		}else {
			return "";
		}
	}
}
