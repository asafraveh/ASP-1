
import Base.BasePage2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class select1 extends BasePage2 {
    public static WebDriver driver;

    public select1() {

    }

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
    public void test02amunt() throws InterruptedException {
        WebElement elementToClick = driver.findElement(By.className("chosen-single"));
        new Actions(driver).moveToElement(elementToClick).click().perform();
    }

    @Test
    public void test03amuntselect() {
        WebElement mySelection = driver.findElement(By.className("chosen-results"));
        Actions myAction = new Actions(driver);
        myAction.moveToElement(mySelection);
        myAction.click().perform();
    }

    @Test
    public void test04area() throws InterruptedException {
        WebElement areaToClick = driver.findElement(By.id("ember1027_chosen"));
        new Actions(driver).moveToElement(areaToClick).click().perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test
    public void test05areaselect() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ember1027_chosen\"]/div/ul/li[3]")).click();

    }

    @Test
    public void test06category() throws InterruptedException {
        WebElement areaToClick = driver.findElement(By.id("ember1037_chosen"));
        new Actions(driver).moveToElement(areaToClick).click().perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void test07_categoryselect() {
        driver.findElement(By.xpath("//*[@id=\"ember1037_chosen\"]/div/ul/li[2]")).click();

    }

    @Test
    public void test08findgift() {
        driver.findElement(By.xpath("//*[@id=\"ember1072\"]")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void test09() {
        WebElement areaToClick = driver.findElement(By.className("bottom"));
        new Actions(driver).moveToElement(areaToClick).click().perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
     @Test
    public void test10pickBusinessAndMount() {
        WebElement title = driver.findElement(By.xpath("//*[@id=\"ember1632\"]"));
        new Actions(driver).moveToElement(title).click().perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void test11selectBusinessAndMount() {
        WebElement title = driver.findElement(By.xpath("//*[@id=\"ember1623\"]"));
        new Actions(driver).moveToElement(title).click().perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test
    public void test12pickBusinessAndMount() {
        WebElement el = driver.findElement(By.xpath("//*[@id=\"ember1623\"]"));
        el.sendKeys("hello!");
        el.clear();
        int orderNumber = 200;
        el.sendKeys(String.valueOf(orderNumber));
        el.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void test13someone() {
        WebElement name = driver.findElement(By.className("bm-h1"));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }
    //
    @Test
    public void test14someone() {
        WebElement el = driver.findElement(By.id("friendName"));
        el.sendKeys("helo1");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //     el.sendKeys(Keys.TAB);


    }
    @Test public void test15someone() {


    driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div/div[1]/form/div[2]/div[4]/label")).click();
    driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div/div[1]/form/div[2]/div[4]/label")).sendKeys("תודה");



//    String actualUrl="https://www.linkedin.com/feed/";
//    String expectedUrl= driver.getCurrentUrl();
//
//        Assert.assertEquals(expectedUrl,actualUrl);

    }
    }
