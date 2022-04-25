package com.crm.pages;

import com.crm.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends Base {
    public LoginPage() throws IOException {
        PageFactory.initElements(driver,this);
    }

    @FindBy (name = "username")
    WebElement username;

    @FindBy (name = "password")
    WebElement password;

    @FindBy (xpath = "//input[@value='Login']")
    WebElement login;

   public HomePage Perform_Login(String name, String pass) throws InterruptedException, IOException {
       Thread.sleep(3000);
       username.sendKeys(name);
       password.sendKeys(pass);
       login.click();
       return new HomePage();
   }
   public  Boolean Error_message(){
       return username.isDisplayed();
   }





}
