package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class RegistrationPage extends BaseClass{

	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	public RegistrationPage()
	{
		PageFactory.initElements(getDriver(),this);
	}
	
	public void enterFname()
	{
		WebElementHelper.SendKeysValue(firstname, "Manish");
	}
	
	public void enterLname()
	{
		WebElementHelper.SendKeysValue(lastName, "Patil");
	}
	
	
}
