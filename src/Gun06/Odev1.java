package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();
        MyFunc.Bekle(2);

        WebElement dropDownDiscover= driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();
        MyFunc.Bekle(2);

        WebElement optionOnline=driver.findElement(By.cssSelector("[value='Online Advertising']"));
        optionOnline.click();
        MyFunc.Bekle(2);

        WebElement buttonEveryday=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        buttonEveryday.click();
        MyFunc.Bekle(2);

        WebElement buttonGood=driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        buttonGood.click();
        MyFunc.Bekle(2);

        WebElement howLongDropdown=driver.findElement(By.cssSelector("select[id$='_4597']"));
        howLongDropdown.click();
        MyFunc.Bekle(2);

        WebElement secenek4=driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        secenek4.click();
        MyFunc.Bekle(2);

        buttonGood.click();

        // cssSelector olmayan 2 hareket var

        //elemendan geri gitme
        //ekrandan gözüken yazısı ile bulma

        //By.Id("firstName");
        //By.Name("firstName");
        //By.cssSelector("[id='firstName']")

        //By.xpath(" //[@id='firstName']   ")



        WaitClose();
    }
}
