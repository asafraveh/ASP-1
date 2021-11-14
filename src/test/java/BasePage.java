import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private static WebDriver driver;


    public WebElement getWebElement(By locator) {
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

    public WebElement getWebElements(By locator, int index) {
        return DriverSingleton.getDriverInstance().findElements(locator).get(index);
    }

    public void clickElementFromlist(By locator, int index) {
        getWebElements(locator, index).click();
    }


    public void clickElement(By locator) {
        getWebElement(locator).click();
    }

    public void sendKeysToElement(By locator, String text) {
        getWebElement(locator).sendKeys(text);
    }

    public void sendKeysToElementWithKeys(By locator, Keys key, String text) {
        getWebElement(locator).sendKeys(text);
    }


    public void clearText(By locator) {
        getWebElement(locator).clear();
    }


}

