package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_Tag extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");

        List<WebElement> links=driver.findElements(By.tagName("a"));
        // veirlen tag lerdeki tüm elemanları aldık
        // eğer findelement kullansaydık ilk sıradaki tagi alırdı.

        for (WebElement e : links){
            if (e.getText().isEmpty()) {
                System.out.print("(href) = " + e.getAttribute("href"));
                System.out.print("(title) = " + e.getAttribute("title"));
                System.out.print("(rel) = " + e.getAttribute("rel"));
            }
        }




        WaitClose();
    }
}
