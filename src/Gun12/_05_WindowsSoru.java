package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSoru extends BaseDriver {
    /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/");

        String anasayfaWindowID=driver.getWindowHandle();

        List<WebElement> linkler= driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link: linkler)
            if (!link.getAttribute("href").contains("mail"))
                link.click();

        // her bir sayfaya geçip url ve title ını yazdırıyor
        Set<String> windowsIdler=driver.getWindowHandles();

        for (String id: windowsIdler){
            MyFunc.Bekle(1);
            driver.switchTo().window(id);   // sıradaki windowa geçmiş oldum.
            System.out.println("title="+driver.getTitle()+", url="+driver.getCurrentUrl());
        }

        // burada aşamaları görmek için iki ayrı for kullandık fakat tek bir for un içinde de halledilirdi.
        for (String id: windowsIdler) {
            if (id.equals(anasayfaWindowID))
                continue;

            driver.switchTo().window(id);   // sıradaki windowa geçmiş oldum.
            driver.close();
        }


        WaitClose();
    }
}
