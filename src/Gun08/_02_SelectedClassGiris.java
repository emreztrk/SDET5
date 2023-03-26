package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectedClassGiris extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu= driver.findElement(By.id("searchDropdownBox"));

        // bu element select tag i ile başlıyorsa, sen bunu SELECT e cast yap ve öyle kullan.

        Select ddMemu=new Select(webMenu); // elementi daha rahat kullanabilir SELECT nesnesini haline dönüştürdü.
        //ddMemu.selectByIndex(4); // ister bu şekilde seçebilirsin
        //ddMemu.selectByValue("search-alias=electronics"); // ister bu şekilde seçebilirsin
        ddMemu.selectByVisibleText("Elektronik"); // ister bu şekilde seçebilirsin

        System.out.println("ddMemu.getOptions().size() = " + ddMemu.getOptions().size());

        WaitClose();





    }
}
