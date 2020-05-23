package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightDetailsSection extends BaseSection{

    public WebElement getTripType() {
        return tripType;
    }

    public Select getPassengersCount() {
        return passengersCount;
    }

    public Select getDepartingFrom() {
        return departingFrom;
    }

    public Select getMonthOn() {
        return monthOn;
    }

    public Select getDayOn() {
        return dayOn;
    }

    public Select getArrivingIn() {
        return arrivingIn;
    }

    public Select getMonthReturn() {
        return monthReturn;
    }

    public Select getDayReturn() {
        return dayReturn;
    }

    private WebElement tripType;
    private Select passengersCount;
    private Select departingFrom;
    private Select monthOn;
    private Select dayOn;
    private Select arrivingIn;
    private Select monthReturn;
    private Select dayReturn;


    public FlightDetailsSection(WebDriver driver) {
        super(driver);
    }

}
