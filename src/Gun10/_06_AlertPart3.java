package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {
    @Test
    public void Test(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        MyFunc.Bekle(2);
        clickMe1.click();

        MyFunc.Bekle(2);

        driver.switchTo().alert().sendKeys("emre");
        MyFunc.Bekle(2);
        driver.switchTo().alert().accept();

        WebElement txtActual= driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("Beklenen yazı gözüktü mü?", txtActual.getText().contains("emre"));

        WaitClose();




    }
}
