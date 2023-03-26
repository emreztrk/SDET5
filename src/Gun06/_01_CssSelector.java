package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement textBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        textBox.sendKeys("biz testerlar geliyoruz");
        WebElement button=driver.findElement(By.cssSelector("[onclick='showInput();']"));

        MyFunc.Bekle(3);
        button.click();

        WebElement message=driver.findElement(By.cssSelector("[id='display']"));

        if (message.getText().equals("biz testerlar geliyoruz"))
            System.out.println("test passed");
        else
            System.out.println("test failed");




        WaitClose();
    }
}
