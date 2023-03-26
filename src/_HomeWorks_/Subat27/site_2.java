package _HomeWorks_.Subat27;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class site_2 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");

        WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(2);

        WebElement sign=driver.findElement(By.xpath("//a[@id='log-in']"));
        sign.click();

        WebElement writing=driver.findElement(By.xpath("//h6[@id='time']"));

        Assert.assertTrue("failed", writing.getText().equals("Your nearest branch closes in: 30m 5s"));

        WaitClose();
    }
}
