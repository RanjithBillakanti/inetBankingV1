package com.inetbanking.testCases;

import com.inetbanking.pageObjects.LoginPage;

import com.inetbanking.pageObjects.eServicePortal;
import com.inetbanking.utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class TC_LoginTest extends BaseClass{
    @Test
    public void loginTest() throws InterruptedException {
        //driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(scdURL);
        Log.info("URL is opened");
        driver.manage().window().maximize();
        //logger.info("URL is opened");
        LoginPage lp = new LoginPage(driver);
        //lp.setUserName(username);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.elementToBeSelected(lp.setScdusername(scdusername)));
        lp.setScdusername(scdusername);
        Log.info("username name entered"+scdusername);
        //lp.setPassword(password);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        lp.setScdPassword(scdpassword);
        Log.info("password entered"+scdpassword);
        //lp.clickSubmit();
        lp.clickSCDSubmit();
        String title = driver.getTitle();
        System.out.println("Title of the page is"+title);
        if(driver.getTitle().equals(title))
        {
            Assert.assertTrue(true);
            Log.info("eServicePortal Successfully launched");
            //System.out.println(driver.getTitle());
        }
        else
        {
            Assert.assertTrue(false);
            Log.info("Test Failed");
            //System.out.println(driver.getTitle());
        }
        System.out.println("This is the End of the Test Case...");
        /*eServicePortal eSP = new eServicePortal(driver);
        eSP.clickCreateNewApplication();
        Log.info("Create New Application Page opened");
        eSP.clickSelectService();
        Log.info("List of services displayed");
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='ng-tns-c215-2']"));
        Select select = new Select(dropdown);
        Thread.sleep(5000);
        //select.selectByValue("Construction Plan Approval");
        int listSize = select.getOptions().size();
        System.out.println("List size: " +listSize);
        select.selectByVisibleText("Construction Plan Approval");
        Log.info("Construction Plan Approval Option Selected");
        eSP.clickSubmit();
        Log.info("Construction Plan Approval Option Selected and Submited");
        eSP.setSubmitterName("RanjithBillakanti");
        Log.info("Submitter Name entered");
        WebElement submiterType = driver.findElement(By.xpath("//select[@class='ng-untouched ng-pristine ng-valid']"));
        Select sltsubmiterType = new Select(submiterType);
        sltsubmiterType.selectByVisibleText("Establishment");
        Log.info("Submiter Type Option Selected");*/
    }
}
