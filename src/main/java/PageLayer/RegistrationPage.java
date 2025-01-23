package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropdown;
import UtilityLayer.RadioButtonHandle;
import UtilityLayer.WebElementHelper;

public class RegistrationPage extends BaseClass{

	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(name="birthday_day")
	private WebElement date;
	
	@FindBy(name="birthday_month")
	private WebElement month;
	
	@FindBy(name="birthday_year")
	private WebElement year; 
	
	@FindBys(@FindBy(xpath="//input[@type='radio']/parent::label"))
	private List<WebElement> gender;
	
	
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
	
	public void enterBdate()
	{
		HandleDropdown.selectDropdown(date, "17");
	}
	
	
	public void enterBmonth()
	{
		HandleDropdown.selectDropdown(month, "May");
	}
	
	public void enterByear()
	{
		HandleDropdown.selectDropdown(year, "2024");
	}

	public void selectGender()
	{
		RadioButtonHandle.RadioButtonHandle(gender, "Male");
	}
	
}
