package org.quantumturf.pageobjects.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.quantumturf.pageobjects.mainpage.MainPage;

public class ClientPage extends MainPage {
    public final By searchForClient = By.xpath("/html/body/div[2]/div[2]/div/input");
    public final By addClientButton = By.cssSelector(".green-button");
    public final By firstName = By.xpath("//div[.='First Name']/../following-sibling::div/input");
    public final By lastName = By.xpath("//div[.='Last Name']/../following-sibling::div/input");
    public final By emailInput = By.cssSelector("input[placeholder='Email']");
    public final By phoneNumber = By.cssSelector("input[placeholder*='0000000']");
    public final By addressInput = By.cssSelector("input[placeholder *='12345']");
    public final By citySelector = By.xpath("//div[.='City']/../following-sibling::div/input");
    public final By zipCode = By.cssSelector("input[placeholder= '000000']");
    public final By selectState = By.cssSelector(".dwn-toggle");
    public final By searchState = By.xpath("//div[.='State']/../following-sibling::div/div/input");
    public final By saveForm = By.xpath("//div[.= 'Add Client']/../following-sibling::div/button");


    public ClientPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void searchForClientInput(String clientName) {
        identify(searchForClient).sendKeys(clientName);
    }

    public void clickOnAddClientButton() {
        identify(addClientButton).click();
    }
    public void firstNameField(String firstName){ identify(firstName).sendKeys (firstName);}
public void lastNameField(String lastName ){identify(lastName).sendKeys (lastName);}


