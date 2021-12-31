package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends HomePage {

        LoadProp loadProp = new LoadProp();
         By _genderMaleRadioButton = By.id("gender-female");
         By _firstNameField = By.id("FirstName");
         By _lastNameField = By.id("LastName");
         By _emailField = By.id("Email");
         By _newsLetterCheckBox = By.id("Newsletter");
         By _passwordField = By.id("Password");
         By _confirmPasswordField = By.id("ConfirmPassword");
         By _clickOnRegisterButton = By.id("register-button");



        //Check if the user is in register page
        public  void checkUserIsInRegisterPage(){
                Assert.assertTrue(driver.getCurrentUrl().contains("register"));
        }

        public void fillUserDetails(){
                //Click on male radio button
                clickOnElement(_genderMaleRadioButton);
                //Enter first name
                typeText(_firstNameField, loadProp.getProperty("FirstName"));
                //Enter last name
                typeText(_lastNameField,loadProp.getProperty("LastName"));
                //Select Day of birth
                Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
                selectDay.selectByValue("15");
                //Select Month of birth
                Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
                selectMonth.selectByVisibleText("May");
                //Select year
                Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
                selectYear.selectByVisibleText("1991");
                //Enter email
                String email = loadProp.getProperty("emailOne") + getCurrentTimeStamp() + loadProp.getProperty("emailTwo");
                typeText(_emailField,email);
                //Deselect newsletter checkbox
                clickOnElement(_newsLetterCheckBox);
                //Enter password
                typeText(_passwordField, loadProp.getProperty("password"));
                //Enter confirm password
                typeText(_confirmPasswordField,loadProp.getProperty("confirmPassword"));

        }

        public  void clickOnRegisterButton(){
                //Click on register button
//        waitForClickable(By.id("register-button"),20);
                clickOnElement(_clickOnRegisterButton);
        }


}