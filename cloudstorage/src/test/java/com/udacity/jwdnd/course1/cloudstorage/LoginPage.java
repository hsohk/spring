package com.udacity.jwdnd.course1.cloudstorage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="inputUsername")
    private WebElement usernameField;

    @FindBy(id="inputPassword")
    private WebElement passwordField;

    @FindBy(id="buttonLogin")
    private WebElement submitButton;

    public LoginPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        this.usernameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.submitButton.submit();
        Thread.sleep(2000);
    }
}
