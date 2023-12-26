package model;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonMethod {
    ChromeDriver driver;

    public commonMethod(ChromeDriver driver){
        this.driver = driver;
    }

    public void setText(By fieldText, String inputText){

        driver.findElement(fieldText).sendKeys(inputText);
    }

    public void clickOnButton(By btnLocator){
        driver.findElement(btnLocator).click();
    }



}
