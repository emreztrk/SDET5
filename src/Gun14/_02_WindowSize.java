package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;


public class _02_WindowSize extends BaseDriver {
    @Test
    public void Test(){

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        MyFunc.Bekle(4);

        Dimension yeniBoyut=new Dimension(516,600);
        driver.manage().window().setSize(yeniBoyut);



        WaitClose();
    }
}
