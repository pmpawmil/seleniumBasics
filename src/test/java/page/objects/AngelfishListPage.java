package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class AngelfishListPage {

    // css = "a.Button[href$='EST-2']")"
    @FindBy(xpath = "//a[contains(@href, \"EST-2\") and @class='Button']")
    WebElement smallAngelfishAddToCartButton;

    public AngelfishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public ShoppingCartPage clickOnAddToCartSmallAngelfish() {
        WaitForElement.waitUntilElementIsClickable(smallAngelfishAddToCartButton);
        smallAngelfishAddToCartButton.click();
        return new ShoppingCartPage();
    }
}
