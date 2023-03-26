package _HomeWorks_.Subat27;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class site_6 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(1);

        WebElement fakeAlert= driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAlert.click();
        MyFunc.Bekle(1);

        WebElement showDialog=driver.findElement(By.xpath("//input[@id='modaldialog']"));
        showDialog.click();
        MyFunc.Bekle(1);

        WebElement ok= driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        ok.click();

        WaitClose();

    }
}
