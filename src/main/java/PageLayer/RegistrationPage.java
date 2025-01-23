package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class RegistrationPage extends BaseClass{

	@FindBy(name="")
	private WebElement firstname;
	
	public RegistrationPage()
	{
		PageFactory.initElements(getDriver(),this);
	}
	
	public void enterFname()
	{
		WebElementHelper.SendKeysValue(firstname, "Manish");
	}
	
	
}
