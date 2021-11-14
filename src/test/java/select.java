import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class select extends BasePage {
    public static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\IdeaProjects\\ASP-1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://buyme.co.il/");
    }

    @Test
    public void test01_waitForDisturbingElementToDisappear() {
        By disturbingElement = By.className("ember1012");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(disturbingElement));
    }

    @Test
    public void test02() throws InterruptedException {
        WebElement elementToClick = driver.findElement(By.className("chosen-single"));
        new Actions(driver).moveToElement(elementToClick).click().perform();
    }

    @Test
    public void test03() {
        WebElement mySelection = driver.findElement(By.className("chosen-results"));
        Actions myAction = new Actions(driver);
        myAction.moveToElement(mySelection);
        myAction.click().perform();
    }

    @Test
    public void test04() throws InterruptedException {
        WebElement areaToClick = driver.findElement(By.id("ember1027_chosen"));
        new Actions(driver).moveToElement(areaToClick).click().perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test
    public void test05() {

    }
}





