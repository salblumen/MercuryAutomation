package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseElement {

    protected WebElement rootElement;

    public BaseElement(WebElement rootElement){
        this.rootElement = rootElement;
    }
}
