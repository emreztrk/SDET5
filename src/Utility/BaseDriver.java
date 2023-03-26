package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;

    static { //public static DriverStart() önceki haliydi. Java kolaylık sağlıyor ve sadece static ile çözülebiliyor.

        CloseIdle();

        //Logger logger= Logger.getLogger(""); // sisteme ait bütün logları üreten objeye/servise ulaştım ""
        //logger.setLevel(Level.SEVERE); // Sadece errorları göster
        // ZATEN GİTMİŞTİ YUKARDAKİ KODLARA GEREK KALMADI FAKAT VERSİYON GÜNCELLMESİ İLE DEĞİŞEBİLİR HABERİN OLSUN.

        // gerekmeyen logları kaldırmak istiyoruz, Chromu başlatırken çıkan kırmızı yazılar.
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        // Sadece tüm sayfanın kodlarının bilgisyarınıza inmesi süresiyle ilgili
        //bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler.: 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
        // eğer 2 sn yüklerse 30 sn. beklemez.

        driver.manage().timeouts().implicitlyWait(dr);
        // Bütün weblementlerin element bazında, elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre. // eğer 2 sn yüklerse 30 sn. beklemez.
    }
    public static void WaitClose(){
        MyFunc.Bekle(3);
        driver.quit();
    }

    public static void CloseIdle(){
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
}
