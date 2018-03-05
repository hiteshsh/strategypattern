package strategypattern;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

/**
 * Created by hiteshs on 3/5/18.
 */
public class WeChatPayment implements PaymentStrategy {
    public void payment() {
        Selenide.$(By.xpath("//*[@id=\"payment-methods\"]/ul/li[10]/label")).click();
        System.out.println("We chat payment done");
    }
}
