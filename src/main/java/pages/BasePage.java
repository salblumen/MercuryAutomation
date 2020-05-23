package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sections.LeftMenuSection;
import sections.TopMenuSection;

public abstract class BasePage {

    protected WebDriver driver;
    protected String baseURL;

    protected HomePage homePage;
    protected RegisterPage registerPage;
    protected SignOnPage signOnPage;
    protected SelectAFlightPage selectAFlightPage;
    protected FlightsFinderPage flightsFinderPage;
    protected BookAFlightPage bookAFlightPage;

    protected LeftMenuSection leftMenuSection;
    protected TopMenuSection topMenuSection;


    public BasePage(WebDriver driver, String baseURL){
        this.driver = driver;
        this.baseURL= baseURL;
        initSections();
        PageFactory.initElements(driver,this);
    }

    private void initSections() {
        if(this.isLoaded()) {
            this.homePage = new HomePage(driver);
            this.registerPage = new RegisterPage(driver);
            this.signOnPage = new SignOnPage(driver);
            this.selectAFlightPage = new SelectAFlightPage(driver);
            this.flightsFinderPage = new FlightsFinderPage(driver);
            this.bookAFlightPage = new BookAFlightPage(driver);
            this.topMenuSection = new TopMenuSection(driver);
            this.leftMenuSection = new LeftMenuSection(driver);
        }

    }

    public boolean isLoaded(){ return true}


}
