package pages;

import org.openqa.selenium.WebDriver;
import sections.PassengerSection;

public class BookAFlightPage extends BasePage{

    private PassengerSection passengerSection;

    public BookAFlightPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }


}
