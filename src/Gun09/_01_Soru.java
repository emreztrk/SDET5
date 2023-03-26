package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_Soru extends BaseDriver {

    @Test
    public void Test(){
//                Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.

        driver.get("https://www.facebook.com/");

         //List<WebElement> cookies=driver.findElements(By.xpath("")) bende çıkmadı cookie ama çıkarsa bu şekilde tuşa basabilirdik

        // if (cookies.size()>0)
            //cookies.get(0).click();

        WebElement create=driver.findElement(By.linkText("Yeni hesap oluştur"));
        create.click();
        MyFunc.Bekle(1);

        WebElement firstname= driver.findElement(By.name("firstname"));
        firstname.sendKeys("Emre");

        WebElement lastname= driver.findElement(By.name("lastname"));
        lastname.sendKeys("Öztürk");

        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed()); // beklenen durum: görünmemesi, false


        WebElement email= driver.findElement(By.cssSelector("[name='reg_email__']"));
        email.sendKeys("emreozturk@gmail.com");
        Assert.assertTrue(email.isDisplayed()); // beklenen görünmesi, true

        WebElement password=driver.findElement(By.cssSelector("[name='reg_passwd__']"));
        password.sendKeys("123456789");

        WebElement webDay=driver.findElement(By.id("day"));
        Select day=new Select(webDay);
        day.selectByVisibleText("22");
        MyFunc.Bekle(1);

        WebElement webMonth=driver.findElement(By.id("month"));
        Select month=new Select(webMonth);
        month.selectByValue("12");
        MyFunc.Bekle(1);

        WebElement webYear=driver.findElement(By.id("year"));
        Select year=new Select(webYear);
        year.selectByVisibleText("1997");
        MyFunc.Bekle(1);








    }
}
