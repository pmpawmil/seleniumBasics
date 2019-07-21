package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class ShoppingCartPage {

    @FindBy(css = "a[href$='newOrderForm=']")
    WebElement proceedToCheckoutButton;

    public ShoppingCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public CheckoutPage clickOnProceedToCheckout() {
        proceedToCheckoutButton.click();
        return new CheckoutPage();
    }
}
