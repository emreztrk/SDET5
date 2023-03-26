package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement element= driver.findElement(By.id("autoCompleteSingleInput"));
        // element.sendKeys("Ahmet");

        // shift a yazıp shifti bırakıp hmet yazarak yapacağız ->Ahmet
        Actions actions=new Actions(driver);

        Action action=actions
                .moveToElement(element)     // kutucuğa gel
                .click()                          // içine tıklat
                .keyDown(Keys.SHIFT)         // shift e bas
                .sendKeys("a")             // shift+a -> A
                .keyUp(Keys.SHIFT)          // shift i bırak
                .sendKeys("hmet")         // yazıyı gönder
                .build();

        MyFunc.Bekle(2);
        action.perform();

        WaitClose();





    }
}
