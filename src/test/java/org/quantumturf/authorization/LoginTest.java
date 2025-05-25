package org.quantumturf.authorization;

import net.datafaker.Faker;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.quantumturf.BaseTest;
import org.quantumturf.pageobjects.authorization.LoginPage;
import org.quantumturf.pageobjects.mainpage.MainPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    MainPage mainPage;
    LoginPage loginPage;
    Faker faker;

    public LoginTest(ChromeDriver driver, WebDriverWait wait) {

    }


    @BeforeMethod
    public void setUpPage() {
        loginPage = new LoginPage(driver, wait);
        mainPage = new MainPage(driver, wait);
        faker = new Faker();
    }
@Test
public void succesfullLoginTest(){
        loginPage.clickOnSignInButton();
loginPage.fillEmailField("rustyhaidu@gmail.com");
loginPage.typeAndDeletePassword("SkillBrain06@");
loginPage.clickOnContinue();

}
}
