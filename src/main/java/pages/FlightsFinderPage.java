package pages;

import org.openqa.selenium.WebDriver;

public class FlightsFinderPage extends BasePage{
    public FlightsFinderPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }
}
