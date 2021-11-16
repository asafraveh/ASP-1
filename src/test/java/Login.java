import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.By.tagName;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class Login extends BasePage {
    public static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\IdeaProjects\\ASP-1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://buyme.co.il/");
       driver.get("https://buyme.co.il/?modal=login");
    }
        @Test
        public void test1() {
        driver.findElement(By.className("seperator-link")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        }
    @Test
    public void test2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"ember931\"]/div/div[1]/div/div/div[3]/div[1]/span")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"ember1481\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1481\"]")).sendKeys("asafraveh");
        driver.findElement(By.xpath("//*[@id=\"ember1484\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1484\"]")).sendKeys("sio.asaf@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ember1487\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1487\"]")).sendKeys("A162534a");
        driver.findElement(By.xpath("//*[@id=\"ember1490\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1490\"]")).sendKeys("A162534a");
        driver.findElement(By.xpath("//*[@id=\"ember1493\"]")).click();

    }


//    @Test
//    public void test3() {
//        //   driver.get("https://buyme.co.il/?modal=login");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        driver.findElement(By.className("title"));
//        //  driver.findElement(By.className("field bottom-lr"));

//          @Test
//    public void test4() {
//              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//              driver.findElement(By.xpath("//*[@id=\"ember1450\"]")).click();
//              driver.findElement(By.xpath("//*[@id=\"ember1450\"]")).sendKeys("asafraveh@gmail.com");
//          }
//        @Test
//                     public void test5() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//      driver.findElement(By.xpath("//*[@id=\"ember1453\"]")).click();
//      driver.findElement(By.xpath("//*[@id=\"ember1453\"]")).sendKeys("A162534a");



    }

