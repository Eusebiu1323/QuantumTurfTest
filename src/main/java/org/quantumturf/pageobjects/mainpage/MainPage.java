package org.quantumturf.pageobjects.mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.List;

public class MainPage extends HomePage{

    public MainPage(WebDriver driver, WebDriverWait wait) { super(driver, wait); }


    public final By schedulerTab = By.xpath("//div[.= 'Scheduler']");
    public final By clientPage = By.xpath("//div[.= 'Clients']");


    public void clickOnSchedulerTab() {
        identify(schedulerTab).click();
    }
    public void clickOnClientTab() {
        identify(clientPage).click();
    }
}