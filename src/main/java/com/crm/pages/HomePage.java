package com.crm.pages;

import com.crm.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends Base {
    public HomePage() throws IOException {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//td[@class='logo_text']")
    WebElement logo;

    @FindBy (xpath = "//a[@title='Contacts']")
    WebElement contacts;

    public Boolean isLogoDisplayed(){
        driver.switchTo().frame("mainpanel");
        return logo.isDisplayed();
    }
    public ContactsPage ClicksOncontacts () throws IOException {
        driver.switchTo().frame("mainpanel");
        contacts.click();
        return new ContactsPage();
    }

}
