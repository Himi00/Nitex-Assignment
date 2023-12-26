package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class base {
   public static ChromeDriver driver;

    @BeforeTest
    public  ChromeDriver setbrowser() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://example.com/login");
        return driver;
    }

    public  ChromeDriver getDriver(){
        return driver;
    }
    @AfterTest
    public void closebrowser() {
        driver.close();
    }

}
