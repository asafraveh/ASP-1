import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.By.tagName;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class NonIntractableElements extends BasePage {
    public static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\IdeaProjects\\ASP-1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://buyme.co.il/");
    }

    @Test
    public void test01_waitForDisturbingElementToDisappear() {
        By disturbingElement = By.className("ui-tabs-panel");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(disturbingElement));

    }

    @Test
    public void test02_moveFocusToElement() throws InterruptedException {
        WebElement elementToClick = driver.findElement(By.className("seperator-link"));
        new Actions(driver).moveToElement(elementToClick).click().perform();
    }

    @Test
    public void test03() {
        WebElement elementtext = driver.findElement(By.id("ember1539"));
        new Actions(driver).moveToElement(elementtext).sendKeys("asaf").perform();
    }


    @Test
    public void test03_moveFocusToElement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        //     wait.until(ExpectedConditions.elementToBeClickable(By.className("text-link theme")));
        WebElement elementToClick = driver.findElement(withTagName("text-link theme").toLeftOf(By.xpath(("פעם ראשונה ב-BUYME?"))));
        new Actions(driver).moveToElement(elementToClick).click().perform();
    }

}

