package _HomeWorks_.Subat23;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class site2 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");

        WebElement username= driver.findElement(By.cssSelector("[id='username']"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password= driver.findElement(By.cssSelector("[id='password']"));
        password.sendKeys("techno123.");

        WebElement sign=driver.findElement(By.cssSelector(".btn-primary"));
        sign.click();

       WebElement writing=driver.findElement(By.cssSelector("[id='time']"));

       if (writing.getText().equals("Your nearest branch closes in: 30m 5s"))
           System.out.println("confirmed");
       else
           System.out.println("ignored");

       WaitClose();
    }
}
