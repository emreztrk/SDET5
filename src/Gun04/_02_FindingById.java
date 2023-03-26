package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement nameBox= driver.findElement(By.id("first_8")); // elemanı id ile bul
        nameBox.sendKeys("Emre"); // kutucuklara yazı gönderme

        WebElement lastNameBox= driver.findElement(By.id("last_8"));
        lastNameBox.sendKeys("Öztürk");

        //MyFunc.Bekle(2);
        //nameBox.clear();
        //lastNameBox.clear();

        // Chrome ctrl+f ye basıldığında inspect bölümünde
        // (inspect bölümü aktifken) arama kutusunu aççar
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());

        WebElement labelLastName= driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());

        WebElement submitButton=driver.findElement(By.id("input_2"));
        submitButton.click();


        MyFunc.Bekle(5);
        driver.quit();


    }
}
