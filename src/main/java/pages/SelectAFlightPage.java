package pages;

import org.openqa.selenium.WebDriver;

public class SelectAFlightPage extends BasePage{
    public SelectAFlightPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }
}
