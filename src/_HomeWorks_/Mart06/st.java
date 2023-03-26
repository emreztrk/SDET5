package _HomeWorks_.Mart06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class st extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement> students = driver.findElements(By.xpath("//ul[@id='allItems']//li"));

        List<WebElement> boxes = driver.findElements(By.xpath("//ul[starts-with(@id, 'box')]"));

        Actions actions=new Actions(driver);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

        for (WebElement s : students) {
            for (WebElement b : boxes) {

                actions.clickAndHold(s).build().perform();
                MyFunc.Bekle(1);
                actions.moveToElement(b).release().build().perform();



            }


        }
    }
}
