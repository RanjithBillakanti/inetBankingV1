package com.inetbanking.testCases;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.eServicePortal;
import com.inetbanking.utilities.Log;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class TC_CreateNewApplication extends BaseClass{

    @Test
    public void CreateNewApplication() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        eServicePortal eSP = new eServicePortal(driver);
        eSP.clickCreateNewApplication();
        Log.info("Create New Application Page opened");

    }
}
