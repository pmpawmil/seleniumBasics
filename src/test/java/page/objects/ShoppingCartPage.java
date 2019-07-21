package page.objects;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "a[href$='newOrderForm=']")
    WebElement proceedToCheckoutButton;

    public ShoppingCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("Click on Proceed to checkout Button")
    public CheckoutPage clickOnProceedToCheckout() {
        proceedToCheckoutButton.click();
        logger.info("Clicked on Proceed to checkout Button");
        return new CheckoutPage();
    }
}
