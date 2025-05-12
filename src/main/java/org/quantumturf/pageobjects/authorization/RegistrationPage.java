package org.quantumturf.pageobjects.authorization;

import org.openqa.selenium.By;
import org.quantumturf.pageobjects.mainpage.MainPage;

public class RegistrationPage extends MainPage {
public final By firstNameSelector= By.xpath("//div[.='First Name']/../following-sibling::div/input");
public final By lastNameSelector = By.xpath("//div[.='Last Name']/../following-sibling::div/input");
public final By emailselector=By.xpath("//div[.='Email']/../following-sibling::div/input");
public final By passwordSelector=By.xpath("//div[.='Password']/../following-sibling::div/input");
public final By privacyPolicyCheckbox=By.xpath("//span[.='Privacy Policy']/preceding-sibling::span");
        public final By termsAndConditionsChrckbox=By.xpath("//span[.='Tems and Conditions']/preceding-sibling::span");
        public final By getStartedButton =By.xpath("button.btn");

}public void fillLastNameField(String lastName) {
        identify(lastNameFieldSelector).sendKeys(lastName);
}

public void fillEmailField(String email) {
        identify(emailFieldSelector).sendKeys(email);
}

public void fillFirstNameField(String firstName) {
        identify(fistNameFieldSelector).sendKeys(firstName);
}

public void fillPasswordFieldSelector(String password) {
        identify(passwordFieldSelector).sendKeys(password);
}


public void clickOnPrivacyPolicyCheckbox() {
        identify(privacyPolicyCheckboxSelector).click();
}

public void clickOnTemsAndConditionsCheckbox() {
        identify(temsAndConditionsCheckboxSelector).click();
}

public void clickOnGetStartedButton() {
        identify(getStartedButtonSelector).click();
}

