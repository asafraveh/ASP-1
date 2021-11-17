import Base.BasePage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends BasePage2 {
    public static WebDriver driver;
String name="asafraveh";
String mail="sio.asaf@gmail.com";
String password="A162534a";

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\IdeaProjects\\ASP-1\\chromedriver.exe");
        driver = new ChromeDriver();
     //   driver.get("https://buyme.co.il/");
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
       // sendkeysToElement(By.xpath("//*[@id=\"ember1481\"]"),"asaf");
        driver.findElement(By.xpath("//*[@id=\"ember1484\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1484\"]")).sendKeys("sio.asaf@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ember1487\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1487\"]")).sendKeys("A162534a");
        driver.findElement(By.xpath("//*[@id=\"ember1490\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1490\"]")).sendKeys("A162534a");
        driver.findElement(By.xpath("//*[@id=\"ember1493\"]")).click();
    }
@Test
    public void test3asstert(){
    Assert.assertEquals(name, driver.findElement(By.xpath("//*[@id=\"ember1481\"]")).getText());
    Assert.assertEquals(mail, driver.findElement(By.xpath("//*[@id=\\\"ember1484\\\"]\"")).getText());
    Assert.assertEquals(password, driver.findElement(By.xpath("//*[@id=\"ember1487\"]")).getText());
    Assert.assertEquals(password, driver.findElement(By.xpath("//*[@id=\"ember1490\"]")).getText());

}

    }

