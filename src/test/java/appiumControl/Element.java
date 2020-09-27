package appiumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sessionManager.Session;

import java.net.MalformedURLException;
import java.util.List;

public class Element  {

    //protected By locator;
    protected List<WebElement> elementList;

    public Element(By locator) throws MalformedURLException {
        this.elementList = Session.getInstance().getDriver().findElements(locator);
    }

    public List<WebElement> getElements() {
        return elementList;
    }

    protected int countElements() {
         //this.findControl();
         return this.elementList.size();
    }
}