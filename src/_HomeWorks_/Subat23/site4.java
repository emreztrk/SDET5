package _HomeWorks_.Subat23;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class site4 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement calculate= driver.findElement(By.xpath("//*[@id='calculate' and @href='/calculate.php']"));
        calculate.click();

        MyFunc.Bekle(2);

        WebElement input1= driver.findElement(By.id("number1"));
        input1.sendKeys("5");
        MyFunc.Bekle(2);

        WebElement input2= driver.findElement(By.id("number2"));
        input2.sendKeys("10");
        MyFunc.Bekle(2);

        WebElement calculateSubmit= driver.findElement(By.cssSelector("input[id='calculate']"));
        calculateSubmit.click();

        WebElement answer=driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println("Sonuç= "+answer.getText());

        WaitClose();

    }
}
