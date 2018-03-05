package strategypattern;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
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
        PaymentStrategy strategy= new AliPay();
        strategy.payment();
        Thread.sleep(5000);
    }

    public void testCardPay(){
        Configuration.browser="Chrome";
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/webdrivers/chromedriver");
        open("https://stripe-payments-demo.appspot.com/");

        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        PaymentStrategy strategy= new CardPayment();
        strategy.payment();
    }

    public void testWeChatPay(){
        Configuration.browser="Chrome";
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/webdrivers/chromedriver");
        open("https://stripe-payments-demo.appspot.com/");

        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        PaymentStrategy strategy= new WeChatPayment();
        strategy.payment();
    }
}
