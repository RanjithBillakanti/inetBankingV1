package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;

   public LoginPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this); // why are we using page factory ?
    }

    @FindBy(name="uid")
    @CacheLookup
    WebElement txtUserName;
    @FindBy(name="password")
    @CacheLookup
    WebElement txtPassword;
    @FindBy(name="uid")
    @CacheLookup
    WebElement btnLogin;
    @FindBy(xpath = "//input[@placeholder='User name or email']")
    @CacheLookup
    public WebElement txtscdusername;
    @FindBy(xpath = "//input[@placeholder='Password']")
    @CacheLookup
    WebElement txtscdpassword;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    @CacheLookup
    WebElement btnScdLogin;

    public void setUserName(String  uname)
    {
        txtUserName.sendKeys(uname);
    }
    public void setPassword(String  pwd)
    {
        txtPassword.sendKeys(pwd);
    }
    public void clickSubmit()
    {
        btnLogin.click();
    }
    public void setScdusername(String scduname)
    {
        txtscdusername.sendKeys(scduname);
    }
    public void setScdPassword(String scdpwd)
    {
        txtscdpassword.sendKeys(scdpwd);
    }
    public void clickSCDSubmit()
    {
        btnScdLogin.click();
    }
    /*public WebElement setScdusername(By by)
    {
        return txtscdusername;
    }*/

}
