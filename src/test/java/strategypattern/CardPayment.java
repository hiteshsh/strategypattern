package strategypattern;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

/**
 * Created by hiteshs on 3/5/18.
 */
public class CardPayment implements PaymentStrategy {
    public void payment() {

        //Selenide.$(By.id("payment-card")).click();
        Selenide.$(By.xpath("//*[@id=\"payment-methods\"]/ul/li[1]/label")).click();
        //Selenide.$("input[type='tel']").setValue("1234123412341234");
        System.out.println("Card payment done");
    }
}
