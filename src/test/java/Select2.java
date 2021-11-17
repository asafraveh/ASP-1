import Base.BasePage2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.with;

public class Select2 extends BasePage2 {
    public static WebDriver driver;

    public Select2() {

    }

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\IdeaProjects\\ASP-1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://buyme.co.il/money/16552152?price=200");
    }

    @Test
    public void test01celesct2(){
        driver.findElement(By.xpath("//*[@id=\"friendName\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"friendName\"]")).sendKeys("daniel");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gift-step-1\"]/div[2]/div[2]")).click();
    //   driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"ember1253\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1253\"]")).sendKeys("תודה");
      driver.findElement(By.xpath("//*[@id=\"ember1261\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"ember1269\"]")).click();

    }
    @Test
    public void test02send(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.className("bm-subtitle-1"));
        driver.findElements(By.id("ember3704"));
      //  driver.findElement(By.id("ember3704"));

      //  List<WebElement> sms=driver.findElements(By.id("ember3704"));
       // new Actions(driver).moveToElement((WebElement)).click().perform();

        //  List<WebElement> click=driver.findElements(By.id("ember3704"));

    }
    @Test
    public void test03sendname(){
        driver.findElement(By.className("circle-area")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.id("sms")).sendKeys("050-6992673");
       driver.findElement(By.id("sms")).click();
      //  driver.findElement(By.className("toggle-icon")).click();
        driver.findElement(By.id("sms")).sendKeys(Keys.TAB,"asaf");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"ember1998\"]/div[3]/div[3]")).click();

     //   driver.findElement(By.className("circle")).click();
    //    driver.findElement(By.xpath("//*[@id=\"ember1700\"]/div")).click();


    }
}
