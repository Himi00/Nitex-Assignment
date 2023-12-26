package test;

import base.base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import page.loginPage;
import testData.values;

public class loginTest extends base {
    @Test

    public void gologin() throws InterruptedException{
        ChromeDriver driver = getDriver();
        loginPage login = new loginPage(driver);

        login.emailinput(values.email);
        login.passwordinput(values.password);
        login.submit();
        login.dashboardAssert();




    }
}
