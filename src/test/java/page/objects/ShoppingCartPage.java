package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(css = "a[href$='newOrderForm=']")
    WebElement proceedToCheckoutButton;

    @Step("Click on Proceed to checkout Button")
    public CheckoutPage clickOnProceedToCheckout() {
        proceedToCheckoutButton.click();
        log().info("Clicked on Proceed to checkout Button");
        return new CheckoutPage();
    }

}
