package _HomeWorks_.Subat27;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class site_1 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");

        WebElement fullname= driver.findElement(By.xpath("//input[@id='userName']"));
        fullname.sendKeys("Automation");

        WebElement eMail= driver.findElement(By.xpath("//input[@id='userEmail'] "));
        eMail.sendKeys("Testing@gmail.com");

        WebElement currentAdress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAdress.sendKeys("Testing Current Address");

        WebElement permanentAdress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAdress.sendKeys("Testing Permanent Address");

        MyFunc.Bekle(2);
        WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

        WebElement found=driver.findElement(By.xpath("//p[@id='name']"));

        Assert.assertTrue("failed", found.getText().contains("Automation"));

        WaitClose();

    }
}
