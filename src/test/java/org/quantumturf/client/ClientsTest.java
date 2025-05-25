package org.quantumturf.client;

import net.datafaker.Faker;
import org.quantumturf.BaseTest;
import org.quantumturf.pageobjects.authorization.LoginPage;
import org.quantumturf.pageobjects.clients.ClientPage;
import org.quantumturf.pageobjects.mainpage.MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClientsTest extends BaseTest {
    LoginPage loginPage;
    MainPage mainPage;
    ClientPage clientPage;
    Faker faker;


    @BeforeMethod
    public void setUpClientPages() {
        loginPage = new LoginPage(driver, wait);
        mainPage = new MainPage(driver, wait);
        clientPage = new ClientPage(driver, wait);
        faker = new Faker();

    }
    @Test
    public void searchForClientTest() throws InterruptedException {
        loginPage.performLogin();
        mainPage.clickOnClientTab();
        Thread.sleep(1000);
        clientPage.searchForClientInput("Alton Howell");

    }
    @Test
    public void createClientTest() {
        loginPage.performLogin();
        mainPage.clickOnClientTab();
        clientPage.clickOnAddClientButton();

    }
}
