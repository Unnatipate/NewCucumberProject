package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ComputerPage extends HomePage {
    By _desktopHeading = By.xpath("//h2/a[@href=\"/desktops\"]");

    public void checkUserIsInTheComputersPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("computers"));
    }

    public void clickOnDesktopsHeading(){
        //Click on Desktop heading
        clickOnElement(_desktopHeading);

    }
}



