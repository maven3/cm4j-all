package com.cm4j.taobao.utils;

public class ValidateUtils {

	/**
	 * 判断字符串是否符合2位小数格式，如 0000.00
	 * 
	 * @param decimal
	 * @return
	 */
	public static boolean validateDecimal(String decimal) {
		return decimal.matches("^(([1-9]\\d+)|([0-9]))(\\.\\d{1,2})?$");
	}

	/**
	 * 判断字符串是否符合折扣格式，1.0-9.9
	 * 
	 * @param discount
	 * @return
	 */
	public static boolean validateDiscount(String discount) {
		return discount.matches("^[1-9](\\.\\d)?$");
	}
}
