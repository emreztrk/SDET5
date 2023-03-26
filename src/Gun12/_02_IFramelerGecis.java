package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGecis extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input= driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0); //1. frame in içindeki tek frame dolayısıyla index i 0
        WebElement checkBox= driver.findElement(By.id("a"));

        //driver.switchTo().parentFrame();  bir önceki
        //driver.switchTo().parentFrame();  bir önceki

        driver.switchTo().defaultContent(); // direk olarak ana sayfaya gider

        driver.switchTo().frame(1);
        WebElement webSelect= driver.findElement(By.id("animals"));
        Select nesneSelect=new Select(webSelect);
        nesneSelect.selectByIndex(3); // 4. eleman

        /// 20.45 E KADAR İZLEMEN LAZIM İKİNCİ DERSİ

        WaitClose();

    }
}
