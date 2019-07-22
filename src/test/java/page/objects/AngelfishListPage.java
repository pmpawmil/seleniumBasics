package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class AngelfishListPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href, \"EST-2\") and @class='Button']")
    WebElement smallAngelfishAddToCartButton;

    @Step("Click on Small Angelfish add to cart button")
    public ShoppingCartPage clickOnAddToCartSmallAngelfish() {
        WaitForElement.waitUntilElementIsClickable(smallAngelfishAddToCartButton);
        smallAngelfishAddToCartButton.click();
        log().info("Clicked on Small Angelfish add to cart button");
        return new ShoppingCartPage();
    }

}
