package org.quantumturf.pageobjects.authorization;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.quantumturf.pageobjects.mainpage.MainPage;

public class RegistrationPage extends MainPage {
    public final By firstNameSelector = By.xpath("//div[.='First Name']/../following-sibling::div/input");
    public final By lastNameSelector = By.xpath("//div[.='Last Name']/../following-sibling::div/input");
    public final By emailselector = By.xpath("//div[.='Email']/../following-sibling::div/input");
    public final By passwordSelector = By.xpath("//div[.='Password']/../following-sibling::div/input");
    public final By privacyPolicyCheckbox = By.xpath("//span[.='Privacy Policy']/preceding-sibling::span");
    public final By termsAndConditionsChrckbox = By.xpath("//span[.='Tems and Conditions']/preceding-sibling::span");
    public final By getStartedButton = By.xpath("button.btn");
    public final By invalidFirstNameErrorMessage = By.xpath("//div[.='Invalid first name format.']");

    public String getInvalidFirstNameFormatErrorMessage() {
        return identify(invalidFirstNameErrorMessage).getText();
    }

    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void fillLastNameField(String lastName) {
        identify(lastNameSelector).sendKeys(lastName);
    }

    public WebElement identify(By by) {
        return null;
    }

    public void fillEmailField(String email) {
        identify(emailselector).sendKeys(email);
    }

    public void fillFirstNameField(String firstName) {
        identify(firstNameSelector).sendKeys(firstName);
    }

    public void fillPasswordFieldSelector(String password) {
        identify(passwordSelector).sendKeys(password);
    }


    public void clickOnPrivacyPolicyCheckbox() {
        identify(privacyPolicyCheckbox).click();
    }

    public void clickOnTemsAndConditionsCheckbox() {
        identify(termsAndConditionsChrckbox).click();
    }

    public void clickOnGetStartedButton() {
        identify(getStartedButton).click();
    }


}