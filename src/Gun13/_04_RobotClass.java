package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class _04_RobotClass extends BaseDriver {
    @Test
    public void Test() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Bekle(1);

        driver.switchTo().frame(8);   // name : "gdpr-consent-notice"

        List<WebElement> accept= driver.findElements(By.xpath("//span[text()='Accept All']"));

        if (accept.size()>0)
            accept.get(0).click();

        /************************************/

        Robot rbt=new Robot();

        for (int i = 0; i < 21; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        // buraya kadar windows dosya bul açıldı

        // aşağıdaki bölüm dosyanın yolunu hafızaya kopyalıyor.

        StringSelection dosyaYolu = new StringSelection("C:\\Users\\emre_\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL); // bu iki tuşa aynı anda basıldı ctrl+v
        rbt.keyPress(KeyEvent.VK_V);

        MyFunc.Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL); // bu iki tuş aynı anda bırakıldı
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER); // entere basılarak dosya gönderildi.
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(1);
        // checkBox a gelindi
        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }
        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);

        MyFunc.Bekle(1);
        // butona gelindi
        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement mesaj= wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(mesaj.isDisplayed());

        WaitClose();
    }
}
