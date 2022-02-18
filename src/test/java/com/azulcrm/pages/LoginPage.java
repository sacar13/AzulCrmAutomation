package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "(//input[@class='login-inp'])[1]")
    public WebElement usernameInputBox;

    @FindBy(xpath = "(//input[@class='login-inp'])[2]")
    public WebElement passwordInputBox;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    public void login(String username,String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }

}
