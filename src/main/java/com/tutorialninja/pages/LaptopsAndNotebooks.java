package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooks extends Utility {
    @CacheLookup
    @FindBy(linkText="Laptops & Notebooks")
    WebElement laptopLink;

    public void clickOnLaptopsLink() {
        clickOnElement(laptopLink);
    }

    public String shortPriceLowToHigh() {
        // Get all the products price and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (Low > High)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
        return null;
    }

    public void changeCurrency() {
        // clickOnElement(By.xpath("//span[contains(text(),'Currency')]"));
        List<WebElement> currencyList = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }
    @CacheLookup
    @FindBy(linkText="Show All Laptops & Notebooks")
    WebElement allLaptopAndNotebooksLink;

    public void clickOnAllLaptopAndNotebooksLink() {
        clickOnElement(allLaptopAndNotebooksLink);
    }
    @CacheLookup
    @FindBy(id="input-sort")
    WebElement sortByPriceHighToLow;

    public void sortByPriceHighToLowFromDropdown() {
        sendTextToElement(sortByPriceHighToLow, "Price (High > Low)");
    }
    @CacheLookup
    @FindBy(linkText="MacBook")
    WebElement macbookLink;

    public void clickOnMacbookLink() {
        clickOnElement(macbookLink);
    }
    @CacheLookup
    @FindBy(linkText="MacBook")
    WebElement verifyMacbook;

    public String getVerifyMacbook() {
        return getTextFromElement(verifyMacbook);
    }
    @CacheLookup
    @FindBy(xpath="//button[@id='button-cart']")
    WebElement addToCart;
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }
    @CacheLookup
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
    WebElement verifySuccess;
    public String getVerifySuccess() {
        return getTextFromElement(verifySuccess);
    }

    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    public void clickOnShoppingCart() {
        clickOnElement(addToCart);
    }
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'shopping cart')]")
    WebElement verifyCart;
    public String getVerifyCart() {
        return getTextFromElement(verifyCart);
    }
    @CacheLookup
    @FindBy(xpath="//div[@id='content']//h1")
    WebElement verifyProductMacbook;
    public String getVerifyProductMacbook() {
        return getTextFromElement(verifyProductMacbook);
    }
    @CacheLookup
    @FindBy(xpath="//button[@id='button-cart']")
    WebElement updateCart;
    public void clickOnUpdateCart() {
        clickOnElement(updateCart);
    }
    @CacheLookup
    @FindBy(xpath="//body/div[@id='product-product']/div[1]")
    WebElement verifyCartText;
    public String getVerifyCartText() {
        return getTextFromElement(verifyCartText);
    }
    @CacheLookup
    @FindBy(xpath="//header/div[1]/div[1]/div[3]/div[1]/button[1]")
    WebElement verifyTotal;
    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }
    @CacheLookup
    @FindBy(xpath="//header/div[1]/div[1]/div[3]/div[1]/button[1]")
    WebElement clickOnCart;
    public void clickOnCheckoutCart() {
        clickOnElement(clickOnCart);
    }
    @CacheLookup
    @FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]")
    WebElement clickOnCheckout;
    public void clickOnFinalCheckout() {
        clickOnElement(clickOnCheckout);
    }
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Checkout')]")
    WebElement verifyCheckout;
    public String getVerifyCheckout() {
        return getTextFromElement(verifyCheckout);
    }

    @FindBy(xpath="//div[@class='col-sm-6']//h2")
    WebElement verifyNewCustomer;
    public String getVerifyNewCustomer() {
        return getTextFromElement(verifyNewCustomer);
    }
    @CacheLookup
    @FindBy(xpath="//label[text()[normalize-space()='Guest Checkout']]")
    WebElement guestCheckout;
    public void clickOnGuestCheckout() {
        clickOnElement(guestCheckout);
    }
    @CacheLookup
    @FindBy(xpath="//input[@id='button-account']")
    WebElement continueTab;
    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }
    @CacheLookup
    @FindBy(name="firstname")
    WebElement nameField;
    public void enterName(String name) {
        sendTextToElement(nameField, name);
    }
    @CacheLookup
    @FindBy(name="lastname")
    WebElement lastnameField;

    public void enterLastName(String lastname) {
        sendTextToElement(lastnameField, lastname);
    }
    @CacheLookup
    @FindBy(id="input-payment-email")
    WebElement emailField;

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }
    @CacheLookup
    @FindBy(name="telephone")
    WebElement telePhone;

    public void enterTelephone(String phone) {
        sendTextToElement(telePhone, phone);
    }
    @CacheLookup
    @FindBy(name="address_1")
    WebElement addressLine;

    public void enterAddress(String street) {
        sendTextToElement(addressLine, street);
    }
    @CacheLookup
    @FindBy(name="city")
    WebElement cityName;
    public void enterCity(String city) {
        sendTextToElement(cityName, city);
    }
    @CacheLookup
    @FindBy(name="postcode")
    WebElement postCode;

    public void enterPostcode(String code) {
        sendTextToElement(postCode, code);
    }
    @CacheLookup
    @FindBy(id="input-payment-country")
    WebElement countryName;

    public void enterCountry(String country) {
        sendTextToElement(countryName, country);
    }
    @CacheLookup
    @FindBy(xpath="//select[@id='input-payment-zone']")
    WebElement zoneName;
    public void enterState(String state) {
        sendTextToElement(zoneName, state);
    }
    @CacheLookup
    @FindBy(xpath="(//input[@value='Continue'])[2]")
    WebElement continueCheckout;
    public void clickOnCheckout() {
        clickOnElement(continueCheckout);
    }
    @CacheLookup
    @FindBy(xpath="//textarea[@name='comment']")
    WebElement passText;
    public void enterText(String msg) {
        sendTextToElement(passText, msg);
    }
    @CacheLookup
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement termsCondition;
    public void clickOnTerms() {
        clickOnElement(termsCondition);
    }
    @CacheLookup
    @FindBy(xpath="//input[@id='button-payment-method']")
    WebElement lastContinue;
    public void clickContinue() {
        clickOnElement(lastContinue);
    }
    @CacheLookup
    @FindBy(xpath="//div[contains(@class,'alert alert-danger')]")
    WebElement warningMsg;

    public String getVerifyWarningMsg() {
        return getTextFromElement(warningMsg);
    }

}
