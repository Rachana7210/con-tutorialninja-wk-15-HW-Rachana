package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(linkText="Desktops")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Desktops')]")
    WebElement verifyText;
    @CacheLookup
    @FindBy(linkText="Laptops & Notebooks")
    WebElement laptopNotebookLink;
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement verifyText1;
    @CacheLookup
    @FindBy(linkText="Components")
    WebElement componentsLink;
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Components')]")
    WebElement verifyText2;

    public void clickOnDesktopLink() {clickOnElement(desktopLink);
    }

    public String getVerifyText() {
        return getTextFromElement(verifyText);
    }

    public void clickOnLaptopNotebooksLink() {
        clickOnElement(laptopNotebookLink);
    }

    public String getVerifyText1() {
        return getTextFromElement(verifyText1);
    }

    public void clickOnComponentsLink() {
        clickOnElement(componentsLink);
    }

    public String getVerifyText2() {
        return getTextFromElement(verifyText2);
    }
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

}
