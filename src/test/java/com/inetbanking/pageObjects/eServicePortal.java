package com.inetbanking.pageObjects;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class eServicePortal {
    WebDriver ldriver;

   public eServicePortal(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this); // why are we using page factory ?
    }

    @FindBy(xpath="//p[normalize-space()='Create New Application']")
    @CacheLookup
    WebElement LinkCreateNewApplication;

   @FindBy(xpath = "//select[@class='ng-tns-c215-2']")
   @CacheLookup
   WebElement LstSelectService;

   @FindBy(xpath = "//button[normalize-space()='Submit']")
   @CacheLookup
   WebElement BtnSubmit;

   @FindBy(xpath = "//input[@placeholder='Submitter Name']")
   @CacheLookup
   WebElement TxtSubmitterName;

   @FindBy(xpath = "//select[@class='ng-untouched ng-pristine ng-valid']")
   @CacheLookup
   WebElement LstSubmitterType;



    public void clickCreateNewApplication()
    {
        LinkCreateNewApplication.click();
    }
    public void clickSelectService()
    {
        LstSelectService.click();
    }
    public void clickSubmit()
    {
        BtnSubmit.click();
    }
    public void setSubmitterName(String sname)
    {
        TxtSubmitterName.sendKeys(sname);
    }
    public void setSubmitterType()
    {
        LstSubmitterType.click();
    }
}
