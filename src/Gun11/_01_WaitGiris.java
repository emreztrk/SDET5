package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;

import java.time.Duration;

/*
    Selenium Bekletme Komutları:

    pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.

    Implicityly wait:
    Tüm sayfadaki elemanlar için, elemanın locatorı sayfa bulunabilir haline getirene kadar verilen bekleme süresi.
    Bütün elemanlar için geçerli ve elemanlar bulundugunda kalan süreyi beklemez. NoSuchElement hatası için verilen süre
    kadar bekler.

    Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

     Explicit  Wait  : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur
 */

public class _01_WaitGiris extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration muhlet=Duration.ofSeconds(30);
        driver.manage().timeouts().implicitlyWait(muhlet);

        //MyFunc.Bekle(30); bu programı(javayı) durduruyor. Sayfayla bir ilgisi olmadıgı için sonuna kadar bekler.
        // interviewlerde bekletme olarak kesinlikle söylenmiyor.

        WebElement message= driver.findElement(By.xpath("//p[text()='WebDriver']"));

        WaitClose();







    }
}
