import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
    private static WebDriver driver;

    public static WebDriver getDriverInstance(){
        if(driver == null){
          System.setProperty("webdriver.chrome.driver", " path of driver ");
            driver = new ChromeDriver();
            driver.get("https://buyme.co.il/");
        }

        return driver;
    }
}
