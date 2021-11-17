import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Maintest {
    Login login = new Login();
    Select2 select2=new Select2();
    select1 select=new select1();

    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sioas\\IdeaProjects\\ASP-1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://buyme.co.il/");
   //    driver.get("https://buyme.co.il/?modal=login");
    }
    //  @Test
    public void setLogin() {
        driver.get("https://buyme.co.il/?modal=login");
     // login.test1();
        login.test2();
    }
  //  @Test
    public void select() throws InterruptedException {
select.test01_waitForDisturbingElementToDisappear();
select.test02amunt();
select.test03amuntselect();
select.test04area();
select.test05areaselect();
select.test06category();
select.test07_categoryselect();
select.test08findgift();
select.test09();
select.test10pickBusinessAndMount();
select.test11selectBusinessAndMount();
select.test12pickBusinessAndMount();
select.test13someone();
select.test14someone();

    }
@Test
    public void select2(){
    driver.get("https://buyme.co.il/money/16552152?price=200");
        select2.test01celesct2();
        select2.test02send();
        select2.test03sendname();
}
}