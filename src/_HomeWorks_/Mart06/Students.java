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

public class Students extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        WebElement a= driver.findElement(By.xpath("//li[text()='Student A']"));
        WebElement b= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement c= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement e= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement f= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement g= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement h= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement i= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement j= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement k= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement l= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement m= driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement n= driver.findElement(By.xpath("//li[text()='Student B']"));

        WebElement teamA= driver.findElement(By.id("box1"));
        WebElement teamB= driver.findElement(By.id("box2"));
        WebElement teamC= driver.findElement(By.id("box3"));
        WebElement teamD= driver.findElement(By.id("box4"));
        WebElement teamE= driver.findElement(By.id("box5"));

        Actions actions=new Actions(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

        actions.clickAndHold(a).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("box1")));
        actions.moveToElement(teamA).release().build().perform();








    }
}
