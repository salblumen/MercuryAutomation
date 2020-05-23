package pages;

import org.openqa.selenium.WebDriver;

public class SignOnPage extends BasePage{
    public SignOnPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }
}
