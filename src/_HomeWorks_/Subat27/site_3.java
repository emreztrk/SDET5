package _HomeWorks_.Subat27;

import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class site_3 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement box=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
        box.sendKeys("teddy bear");

        WebElement search=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        search.click();

        WebElement results= driver.findElement(By.xpath("//span[@class='nnn']"));

        Assert.assertTrue("failed", results.getText().contains("We've got 319 results for teddy bear"));

        WaitClose();
    }
}
