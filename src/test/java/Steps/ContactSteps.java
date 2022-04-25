package Steps;

import com.crm.base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.io.IOException;

public class ContactSteps extends Base {
    public ContactSteps() throws IOException {
    }

    @And("Clicks on contacts")
    public void Clicks_on_contacts () throws IOException {
        contactsPage = homepage.ClicksOncontacts();
    }

    @Then("Email text field should be visible")
    public void emailTextFieldShouldBeVisible() {
    Assert.assertTrue(contactsPage.emailTextFieldVisible());
    }

    @And("Clicks on add new contact")
    public void clicks_on_add_new_contact () {
        contactsPage.clicksOnAddnewContact();
    }


    @And("Fill the first name and password")
    public void fillTheFirstNameAndPassword() {
        contactsPage.fillTheFirstAndSecondNames();
    }

    @Then("a new contact should be added")
    public void aNewContactShouldBeAdded() {
        Assert.assertTrue(contactsPage.aNewContactAdded());
    }

}
