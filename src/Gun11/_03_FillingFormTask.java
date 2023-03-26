package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name= driver.findElement(By.cssSelector("input[id='title']"));
        name.sendKeys("emre");

        WebElement comment= driver.findElement(By.cssSelector("textarea[id='description']"));
        comment.sendKeys("öztürk");

        WebElement submit= driver.findElement(By.id("btn-submit"));
        submit.click();

        // implicitlyWait elemanın locator bulması süresiyle ilgili, burdaki zaten elemanlar zaten hemen bulunuyor
        //burada kriter bulunan elemanın görünen yazısının oluşma süresi
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //findElement

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@id='submit-control']"), "Form submited Successfully!"));

        WebElement mesaj= driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!",mesaj.getText());

        WaitClose();






    }
}
