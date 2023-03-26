package _HomeWorks_.Mart06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cities extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        MyFunc.Bekle(5);

        WebElement madrid= (WebElement) driver.findElements(By.xpath("//div[text()='Madrid']"));

        WebElement spain= (WebElement) driver.findElements(By.xpath("(//div[@class='destinationBox'])[14]"));

        Actions actions=new Actions(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

        actions.clickAndHold(madrid).build().perform();
        MyFunc.Bekle(2);
        actions.moveToElement(spain).release().build().perform();


    }
}
