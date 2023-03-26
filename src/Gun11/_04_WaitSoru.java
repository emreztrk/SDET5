package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {

    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

    @Test
    public void Test(){
        driver.get("https://www.demoblaze.com/index.html");

        WebElement s6= driver.findElement(By.linkText("Samsung galaxy s6"));
        s6.click();

        WebElement cart= driver.findElement(By.linkText("Add to cart"));
        cart.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent()); // alert çıkana kadar bekle

        driver.switchTo().alert().accept();

        WebElement base= driver.findElement(By.xpath("//a[@id='nava']"));
        base.click();


    }
}
