package withoutstrategypattern;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import strategypattern.AliPay;
import strategypattern.CardPayment;
import strategypattern.PaymentStrategy;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by hiteshs on 3/5/18.
 */

@Test
public class TestPayment {

    public void testAliPay() throws InterruptedException {
        Configuration.browser="Chrome";
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/webdrivers/chromedriver");

        open("https://stripe-payments-demo.appspot.com/");

        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        Payment payment= new Payment();
        payment.payUsingAliPay();
        Thread.sleep(5000);
    }

    public void testCardPay(){
        Configuration.browser="Chrome";
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/webdrivers/chromedriver");
        open("https://stripe-payments-demo.appspot.com/");

        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        Payment payment= new Payment();
        payment.payUsingCard();
    }

    public void testCardWeChatPay(){
        Configuration.browser="Chrome";
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/webdrivers/chromedriver");
        open("https://stripe-payments-demo.appspot.com/");

        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        Payment payment= new Payment();
        payment.payUsingWechatPay();
    }
}
