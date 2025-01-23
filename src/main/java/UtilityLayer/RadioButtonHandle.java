package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class RadioButtonHandle extends BaseClass {

	public static void RadioButtonHandle(List<WebElement> list, String gender)
	{
		
		for(WebElement wb: list)
		{
			String actualvalue=wb.getText();
			
			if(actualvalue.equals(gender))
			{
				WebElementHelper.clickElement(wb);
				break;
			}
			
		}
	}
	
}
