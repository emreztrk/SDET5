package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

//        1- Hepsiburada.com sayfasına git
//        2- arama kutusuna usb yaz
//        3- Ara butonuna bas
//        4- Çıkan ürünlerin açıklamasında USB kelimesi
//        ni kontrol.

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");  // sayfaya gider

//        eleman aramakutusu = aramakutusunu bul;
//        aramakutusu.yaziGonder("usb");
//        elemanlar =  urunListesiniAl;
//
//        for döngüsü ile kontrol et.

        MyFunc.Bekle(5);
        driver.quit();


    }
}
