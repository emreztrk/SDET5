package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {
    @Test
    public void Test() {

        driver.get("https://www.copado.com/robotic-testing");
        driver.manage().deleteAllCookies(); // cookieleri sil, accept her zaman çıksın diye

        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element= driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element); // elemente kadar kaydır

        // element.click(); tıklatma özelliği, eğer buton bir barın altında kalıyorsa tıklatamaz.

        js.executeScript("arguments[0].click();", element); // html içinden elemente ulaşır ve tıklatır.
        // barın altında kalsa bile tıklatır.

        MyFunc.Bekle(5);







        WaitClose();
    }
}
