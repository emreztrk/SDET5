package _HomeWorks_.Subat23;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class site1 extends BaseDriver {

    @Test
    public void Test() {

        driver.get("http://demoqa.com/text-box");

        WebElement fullName= driver.findElement(By.cssSelector("input[id='userName'] "));
        fullName.sendKeys("Automation");

        WebElement eMail= driver.findElement(By.cssSelector("input[id='userEmail'] "));
        eMail.sendKeys("Testing@gmail.com");

        WebElement currentAdress=driver.findElement(By.cssSelector("[id='currentAddress']"));
        currentAdress.sendKeys("Testing Current Address");

        WebElement permanentAdress=driver.findElement(By.cssSelector("[id='permanentAddress']"));
        permanentAdress.sendKeys("Testing Permanent Address");

        MyFunc.Bekle(2);
        WebElement submit=driver.findElement(By.cssSelector("button[id='submit']"));
        MyFunc.Bekle(2);
        submit.click();

        WebElement found=driver.findElement(By.cssSelector("p[id='name']"));

        Assert.assertTrue("failed", found.getText().contains("Automation"));

        WaitClose();
    }
}
