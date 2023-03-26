package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Test;

import org.junit.Assert;

public class _02_CssSelector extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="biz testerlar geliyoruz";
        WebElement textBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        textBox.sendKeys(mesajim);
        WebElement button=driver.findElement(By.cssSelector("[onclick='showInput();']"));

        MyFunc.Bekle(3);
        button.click();

        WebElement message=driver.findElement(By.cssSelector("[id='display']"));

//        if (message.getText().equals("biz testerlar geliyoruz"))
//            System.out.println("test passed");
//        else
//            System.out.println("test failed");

        String kutununIcindekiYazi=textBox.getAttribute("value");
        System.out.println(kutununIcindekiYazi);
        // kutunun içine gelen yazıyı almak için getAttribute kullanıyoruz.

        Assert.assertTrue("aranılan mesaj bulunumadı",message.getText().equals(mesajim));
        // verilen değer TRUE mu
        // hata yok ise yani içindeki değer TRUE ise hiç bir bilgi vermez.

        //[id^='u_'] -> id si    u_ ile başlayan  startWith
        //[id*='u_'] -> id sinde u_ geçen         contains
        //[id$='u_'] -> id si    u_ ile biten     endWith




        WaitClose();
    }
}
