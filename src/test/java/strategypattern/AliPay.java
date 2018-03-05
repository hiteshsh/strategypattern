package strategypattern;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

/**
 * Created by hiteshs on 3/5/18.
 */
public class AliPay implements PaymentStrategy {
    public void payment() {
        Selenide.$(By.xpath("//*[@id=\'payment-methods\']/ul/li[2]/label")).click();

        System.out.println("Alipay payment done");
    }
}
