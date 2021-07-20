package com.inetbanking.testCases;

//import org.apache.log4j.Logger;

import com.inetbanking.utilities.ReadConfig;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    ReadConfig readConfig = new ReadConfig();

    public String baseURL = readConfig.getApplicationURL();
    public String scdURL = readConfig.getSCDURL();
    public String username = readConfig.getUsername();
    public String password = readConfig.getPassword();
    public static WebDriver driver;
    public String scdusername = readConfig.getscdUsername();
    public String scdpassword = readConfig.getscdPassword();

    public static Logger logger;
    @Parameters("browser")
    @BeforeClass
    public void setup(String br) throws IOException {
        logger = Logger.getLogger("ebanking");
        String log4jConfPath = System.getProperty("user.dir")+"//log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        if(br.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",readConfig.getChromepath());
            driver = new ChromeDriver();
        }
        else if (br.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver",readConfig.getFirefoxpath());
            DesiredCapabilities desired = new DesiredCapabilities();
            File pathBinary = new File("C:\\Users\\Billakanti.K\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
            FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
            FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\Billakanti.K\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\qp2yq44q.Ranjith"));
            FirefoxOptions options = new FirefoxOptions().addPreference("security.insecure_password.ui.enabled", false).addPreference("security.insecure_field_warning.contextual.enabled", false);
            desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
            options.setProfile(profile);
            driver = new FirefoxDriver(options);

        }
        else if(br.equals("ie"))
        {
            System.setProperty("webdriver.ie.driver",readConfig.getIepath());
           driver = new InternetExplorerDriver();
            //System.setProperty("webdriver.ie.driver", path + "\\Drivers\\IEDriverServer.exe");
            /*InternetExplorerOptions explorerOptions = new InternetExplorerOptions().setAcceptInsecureCerts(true);
            driver = new InternetExplorerDriver(explorerOptions);*/
        }
       // driver.get(baseURL);
        driver.get(scdURL);
       // System.out.println(baseURL);

    }

    /*@AfterClass
    public void tearDown()
    {
    driver.quit();
    }*/
}
