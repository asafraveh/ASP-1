import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void login(){
        enterCredentials();
        pressLogin();
    }

    private void enterCredentials(){
        sendKeysToElement(By.id("ember2675"), "asaf");
        sendKeysToElement(By.id("ember2692"), "123456");
    }

    private void pressLogin(){
        clickElement(By.id("login"));
    }

}
