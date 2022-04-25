package com.crm.pages;

import com.crm.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ContactsPage extends Base {
    public ContactsPage() throws IOException {
        PageFactory.initElements(driver,this);
    }


    @FindBy (xpath = "//input[@name='cs_email']")
    WebElement emailTextField;

    @FindBy (xpath = "//input[@value='New Contact']")
    WebElement newContact;

    @FindBy (id = "first_name")
    WebElement firstName;

    @FindBy (id = "surname")
    WebElement secondName;

    @FindBy (xpath = "//input[@value='Save']")
    WebElement save;

    @FindBy (xpath = "//input[@value='Next']")
    WebElement next;

    public boolean emailTextFieldVisible() {
        return emailTextField.isDisplayed();
    }

    public void clicksOnAddnewContact () {
        newContact.click();
    }

    public void fillTheFirstAndSecondNames() {
        firstName.sendKeys("hatem");
        secondName.sendKeys("hatamleh");
        save.click();
    }

    public boolean aNewContactAdded() {
        return next.isDisplayed();
    }






}
