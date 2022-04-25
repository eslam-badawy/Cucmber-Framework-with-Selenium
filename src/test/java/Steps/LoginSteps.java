package Steps;


import com.crm.base.Base;
import com.crm.pages.LoginPage;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;


public class LoginSteps extends Base {


	public LoginSteps() throws IOException {
	}

	@Given("User open the website and go to login page")
	public void user_open_the_website_and_go_to_login_page() throws IOException {
		loginPage = new LoginPage();

	}
	@When("User fill email as {string} and password as {string} and click on login")
	public void user_fill_email_and_password_and_click_on_login(String username, String password) throws InterruptedException, IOException {
		homepage = loginPage.Perform_Login(username,password);
	}
	@Then("User should navigate to home page")
	public void user_should_navigate_to_home_page() {
		Assert.assertTrue(homepage.isLogoDisplayed());

	}
	@Then("Error message should appeared")
	public void Error_message_should_appeared() {
		Assert.assertTrue(loginPage.Error_message());
	}


}
