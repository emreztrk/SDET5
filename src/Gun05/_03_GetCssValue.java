package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        //elemanın parametrelerine ulaşmak için getAttribute u kullanıyoruz
        WebElement inputValEnter= driver.findElement(By.id("inputValEnter"));

//        <input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
//        id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands"
//        value="" strtindx="" endindx="">

        //Class ın karşılığı olan CSS-Sekillendirme değerlerini almak için getCssValue kullanılır.
        System.out.println("inputValEnter.getAttribute(class) = " + inputValEnter.getAttribute("class"));
        System.out.println("inputValEnter.getCssValue(color) = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getCssValue(font-size) = " + inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter.getCssValue(background) = " + inputValEnter.getCssValue("background"));

        WaitClose();
    }
}
