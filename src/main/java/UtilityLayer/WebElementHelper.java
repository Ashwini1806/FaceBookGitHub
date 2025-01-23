package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class WebElementHelper extends BaseClass {

	
	public static void clickElement(WebElement wb)
	{
		wb.click();
	}
	
	public static void SendKeysValue(WebElement wb, String value)
	{
		wb.sendKeys(value);
	}
}
