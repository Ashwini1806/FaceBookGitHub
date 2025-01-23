package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropdown extends BaseClass{

	public static void selectDropdown(WebElement wb,String expectedvalue)
	{
		Select sel=new Select(wb);
		
		sel.selectByVisibleText(expectedvalue);
	
	}
	
}
