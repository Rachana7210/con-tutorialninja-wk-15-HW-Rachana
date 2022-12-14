package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyAccount extends Utility {
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'My Account')]")
   WebElement myAccount;
    public void clickOnMyAccount() {
        clickOnElement(myAccount);
    }
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Register Account')]")
    WebElement verifyRegister;

    public String getVerifyRegister() {
        return getTextFromElement(verifyRegister);

    }
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Returning Customer')]")
    WebElement verifyReturning;

    public String getVerifyReturning() {
        return getTextFromElement(verifyReturning);

    }
    @CacheLookup
    @FindBy(id="input-firstname")
    WebElement firstName;

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }
    @CacheLookup
    @FindBy(id="input-lastname")
    WebElement lastName;

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }
    @CacheLookup
    @FindBy(id="input-email")
    WebElement enterEmail;

    public void enterEmailAdd(String email) {
        sendTextToElement(enterEmail, email);
    }
    @CacheLookup
    @FindBy(id="input-telephone")
    WebElement enterPhone;

    public void enterPhone(String phone) {
        sendTextToElement(enterPhone, phone);
    }
    @CacheLookup
    @FindBy(id="input-password")
    WebElement enterPass;

    public void enterPassword(String phone) {
        sendTextToElement(enterPass, phone);
    }
    @CacheLookup
    @FindBy(id="input-confirm")
    WebElement confirmPass;

    public void enterConfirmPass(String phone) {
        sendTextToElement(confirmPass, phone);
    }
    @CacheLookup
    @FindBy(xpath="//input[@name='newsletter']")
    WebElement newsLetter;

    public void clickYesonNewsLetter() {
        clickOnElement(newsLetter);
    }

    @CacheLookup
    @FindBy(xpath="//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicy;

    public void clickOnPrivacy() {
        clickOnElement(privacyPolicy);
    }

    @CacheLookup
    @FindBy(xpath="//div[@class = 'buttons']//input[@value='Continue']")
    WebElement clickOnContinue;

    public void clickFinalContinue() {
        clickOnElement(clickOnContinue);
    }
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement verifyMessage;

    public String getVerifyMessage() {
        return getTextFromElement(verifyMessage);
    }
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement continueButton;

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'My Account')]")
    WebElement myAccountTab;

    public void clickOnMyAccountTab() {
        clickOnElement(myAccountTab);
    }
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Account Logout')]")
    WebElement verifyLogout;
    public String getVerifyLogout() {
        return getTextFromElement(verifyLogout);
    }
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement continueButtonTab;

    public void clickOnContinueTab() {
        clickOnElement(continueButton);
    }
    @CacheLookup
    @FindBy(xpath="//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginButton;

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

}
