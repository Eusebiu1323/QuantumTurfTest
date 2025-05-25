package org.quantumturf.pageobjects.scheduler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.quantumturf.pageobjects.mainpage.MainPage;

public class SchedulerPage extends MainPage {

    private final By mapCameraControls = By.cssSelector("button[aria-label='Map camera controls']");
    private final By mapControlDown = By.cssSelector("button[aria-label='Move down']");
    private final By dateButton = By.cssSelector(".page-layout .row > div:nth-child(1) .mt-2 .text-dark-black");
    public final By startingDate = By.xpath("(//div[contains(@class, 'dwn-menu-calendar')]//li[1]//button)[1]\n");
    public final By selectStartDate = By.xpath("//div[contains(@class, 'dwn-menu-calendar')]//li[contains(@class, 'from-to-dwn-menu-calendar')]//div[contains(@class, 'rmdp-day-picker')]//div/div[4]/div[6]");
    public final By endingDate = By.xpath("(//li[contains(@class, 'from-to-dwn-menu-calendar')]//button)[2]");
    public final By selectEndDate =By.cssSelector("li.from-to-dwn-menu-calendar  div:nth-child(6) > div:nth-child(5)");

    public SchedulerPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickOnCameraControls() {
        identify(mapCameraControls).click();
    }

    public void clickOnMapDownControl() {
        identify(mapControlDown).click();
    }

    public void setDateButton() {
        identify(dateButton).click();
    }

    public void startingDateButton() {
        identify(startingDate).click();
    }

    public void selectStartDateButton() {
        identify(selectStartDate).click();
    }

    public void endingDateButton() {
        identify(endingDate).click();
    }
    public void selectEndDateButton() {
        identify(selectEndDate).click();
    }
}
