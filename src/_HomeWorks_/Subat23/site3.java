package _HomeWorks_.Subat23;

import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class site3 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement box=driver.findElement(By.cssSelector("[id='inputValEnter']"));
        box.sendKeys("teddy bear");

        WebElement search=driver.findElement(By.cssSelector(".searchTextSpan"));
        search.click();

        WebElement results= driver.findElement(By.xpath("//span[@class='nnn']"));

        Assert.assertTrue("failed", results.getText().contains("We've got 319 results for teddy bear"));

        WaitClose();
    }
}
