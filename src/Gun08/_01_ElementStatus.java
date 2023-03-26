package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElementStatus extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("sali.isDisplayed() = " + sali.isDisplayed()); //is derken soru soruyor, görüntüleniyor mu?
        System.out.println("sali.isEnabled() = " + sali.isEnabled());   // aktif edilmiş mi?
        System.out.println("sali.isSelected() = " + sali.isSelected()); // seçilmiş mi?

        MyFunc.Bekle(2);
        sali.click();
        MyFunc.Bekle(2);
        System.out.println("sali.isSelected() = " + sali.isSelected()); // seçilmiş mi?
        
        WebElement cumartesi= driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));

        System.out.println("cumartesi.isDisplayed() = " + cumartesi.isDisplayed());
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled());
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected());

        WaitClose();





    }
}
