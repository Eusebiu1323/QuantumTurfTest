package org.quantumturf.pageobjects.authorization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.quantumturf.pageobjects.mainpage.HomePage;

public class LoginPage extends HomePage {
    public final By emailSelector = By.xpath("//div[.='Email']/../following-sibling::div/input");
    public final By passwordSelector = By.xpath("//div[.='Password']/../following-sibling::div/input");
    public final By continueButton=By.cssSelector(".green-button");
    private final By forgotPassword= By.xpath("//div[.='Forgot Password?']");
    public String loginURL = "https://www.quantumturf.io/login";
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void fillEmailField(String email) {
        driver.findElement(emailSelector).sendKeys(email);
    }

    public void typeAndDeletePassword(String wrongPassword) {
        WebElement passwordInput = identify(this.passwordSelector);
        passwordInput.sendKeys(wrongPassword);
        for (int i = 0; i < wrongPassword.length(); i++) {
            passwordInput.sendKeys(Keys.BACK_SPACE);
        }
    }

    public void fillPasswordField(String password) {
        driver.findElement(passwordSelector).sendKeys(password);
    }

    public void clickOnContinue() {
        driver.findElement(continueButton).click();
    }

    public void performLogin(String email, String password) {
        clickOnSignInButton();
        fillEmailField(email);
        fillPasswordField(password);
        clickOnContinue();
    }

    public void performLogin() {
        performLogin("rustyhaidu@gmail.com", "SkillBrain06@");
    }

    public void clickOnForgotPassword(){
        identify(forgotPassword).click();
    }
}

