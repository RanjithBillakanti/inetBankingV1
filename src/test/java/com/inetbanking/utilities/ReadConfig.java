package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

    Properties pro ;
    public ReadConfig()
    {
        File src = new File("./Configuration/config.properties");
        try{
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getApplicationURL()
    {
        String url = pro.getProperty("baseURL");
        System.out.println(url);
        return url;
    }
    public String getUsername()
    {
        String username = pro.getProperty("username");
        return username;
    }
    public String getPassword()
    {
        String password = pro.getProperty("password");
        return password;
    }
    public String getChromepath()
    {
        String chromepath = pro.getProperty("chromepath");
        return chromepath;
    }
    public String getFirefoxpath()
    {
        String firefoxpath = pro.getProperty("firefoxpath");
        return firefoxpath;
    }
    public String getIepath()
    {
        String iepath = pro.getProperty("iepath");
        return iepath;
    }
    public String getSCDURL()
    {
        String url = pro.getProperty("SCDURL");
        System.out.println(url);
        return url;
    }
    public String getscdUsername()
    {
        String scdusername = pro.getProperty("scdusername");
        return scdusername;
    }
    public String getscdPassword()
    {
        String scdpassword = pro.getProperty("scdpassword");
        return scdpassword;
    }

}
