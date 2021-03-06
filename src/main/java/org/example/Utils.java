package org.example;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Utils extends BrowserManager {
    public static void captureScreenshot(String fileName) {
        //convert web driver object to TakeScreenshot
        TakesScreenshot screenshot = ((TakesScreenshot) driver);

        //Call getScreenshotsAs method to create image file
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File destFile = new File("src/test/screenshots/" + fileName + getCurrentTimeStamp() + ".png");

        //Copy file at destination
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void clickOnBtn(String btnText) {
//        clickOnElement(By.xpath("//[contains()," +btnText+ ]"));
    }

    public static void clickOnMenuItem(String category) {
        clickOnElement(By.linkText(category));
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static String getCurrentTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }

    public static WebElement getElement(By by) {
        return driver.findElement(by);
    }

    public static void selectWithVisibleText(By by, String visibleText) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(visibleText);
    }

    public static void waitForVisible(By by, long timeInSeconds) {
//        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}



