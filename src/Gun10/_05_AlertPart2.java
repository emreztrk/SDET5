package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BaseDriver {
    @Test
    public void Test(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        MyFunc.Bekle(2);
        clickMe1.click();

        MyFunc.Bekle(2);

        driver.switchTo().alert().dismiss();

        WaitClose();




    }
}
