package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Senaryo extends BaseDriver {

    @Test
    public void Test(){

        // 1- https://www.saucedemo.com/
        //2- login işlemini yapınız.
        //3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
        //4- Sonra geri dönün (Back to products e tıklatın)
        //5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
        //6- sepete tıklatın
        //7- CheckOut a tıklatın
        //8- kullanıcı bilgilerini doldurup Continue ya tıklatın
        //9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
        //   Item total e eşit olup olmadığını Assert ile test ediniz.

        driver.get("https://www.saucedemo.com/");

        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);

        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.Bekle(1);

        WebElement backpack=driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']"));
        // //div[text()='Sauce Labs Backpack'] bu şekilde de görünen texti alarak yapabilirdik.
        backpack.click();
        MyFunc.Bekle(2);

        WebElement addCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addCart.click();
        MyFunc.Bekle(1);

        WebElement backTo=driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backTo.click();
        MyFunc.Bekle(1);

        WebElement tshirt=driver.findElement(By.xpath("//img[@alt='Sauce Labs Bolt T-Shirt']"));
        tshirt.click();
        MyFunc.Bekle(1);

        WebElement addCart2=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addCart2.click();
        MyFunc.Bekle(1);

        WebElement cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();
        MyFunc.Bekle(1);

        WebElement checkOut=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();
        MyFunc.Bekle(1);

        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Emre");

        WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Öztürk");

        WebElement zipCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("12345");

        WebElement continueButton=driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();

        List<WebElement> price=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;
        for (WebElement e : price){
            System.out.println("e.getText() = " + e.getText()); // $29.99 --> e.getText().substring(1) -->29.99
            toplam=toplam+Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);

        WebElement itemTotal=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        System.out.println("itemTotal.getText() = " + itemTotal.getText());
        System.out.println("itemTotal.getText().replaceAll((\"[^0-9,.]\",\"\") ) = " + itemTotal.getText().replaceAll("[^0-9,.]",""));

        Double itemT=Double.parseDouble(itemTotal.getText().replaceAll("[^0-9,.]",""));

        Assert.assertTrue("values are not equal", toplam==itemT);

        WaitClose();








    }
}
