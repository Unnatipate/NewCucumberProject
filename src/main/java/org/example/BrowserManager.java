package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends BaseTest{
    LoadProp loadProp = new LoadProp();
    public String browserName = "chrome";
//    public String browserName = System.getProperty("browser");

    public  void openBrowser(){
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else if(browserName.equalsIgnoreCase("I.E")){
            System.setProperty("webdriver.I.E.driver","src/test/java/driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else{
            System.out.println("Wrong browser!!!");
        }



        driver.manage().window().maximize();
        driver.get(loadProp.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.close();
    }

}