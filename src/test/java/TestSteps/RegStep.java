package TestSteps;

import BaseLayer.BaseClass;
import PageLayer.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegStep extends BaseClass {

	static RegistrationPage rg;

	@Given("User should open {string} browser")
	public void user_should_open_browser(String browsername) throws Exception {

		BaseClass.initialization(browsername);
	}

	@When("User should enter valid firstname")
	public void user_should_enter_valid_firstname() {
		rg = new RegistrationPage();
		rg.enterFname();

	}

	@When("User should enter valid Lastname")
	public void user_should_enter_valid_lastname() {
		rg.enterLname();

	}

}
