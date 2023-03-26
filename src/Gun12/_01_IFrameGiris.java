package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");

        // id=frame1 name=iamframe  index?: bulundugu sayfadaki kod sırası
        driver.switchTo().frame(0); // name ve id oldukca yavas çalısıyor, index ise hızlı
        //driver.switchTo().frame("frame1");
        //driver.switchTo().frame("iamframe");

        // index > name > id

        WebElement input=driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");

        // iframe içindeki bir locator da işlem yapılacaksa önce o iframe e geçmem lazım.
        //driver.switchTo().frame(0);   ilgili odaya (iframe) e geç
        //driver.switchTo().parentFrame();      bir önceki odaya, (parent) e geç
        //driver.switchTo().defaultContent();   ilk ana sayfaya direk geçer

        WaitClose();




    }
}
