package Failure;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.testCases.BaseClass;
import com.inetbanking.utilities.Log;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TC_LoginTest extends BaseClass {
    @Test
    public void loginTest()
    {
        driver.get(baseURL);
        Log.info("URL is opened");
        Log.debug("this is sample");
        //logger.info("URL is opened");
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        Log.info("username name entered"+username);
        lp.setPassword(password);
        Log.info("password entered"+password);
        assertEquals(2+2,3,"Addition Problem! 2+2 must be 4!\n");
        lp.clickSubmit();

        if(driver.getTitle().equals("GTPL Bank Home Page"))
        {
            Assert.assertTrue(true);
            Log.info("Test Passed");
            //System.out.println(driver.getTitle());
        }
        else
        {
            Assert.assertTrue(false);
            Log.info("Test Failed");
            //System.out.println(driver.getTitle());
        }

    }}
    /*@AfterClass
    public void tearDown()
    {
        driver.quit();
    }
 }*/
