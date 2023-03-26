package _HomeWorks_.Subat23;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class site5 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(1);

        WebElement fakeAlert= driver.findElement(By.id("fakealerttest"));
        fakeAlert.click();
        MyFunc.Bekle(1);

        WebElement showAlert= driver.findElement(By.id("fakealert"));
        showAlert.click();
        MyFunc.Bekle(1);

        WebElement ok= driver.findElement(By.id("dialog-ok"));
        ok.click();

        WaitClose();


    }

}
