package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FishListPage extends BasePage {

    @FindBy(css = "a[href$=FI-SW-01]")
    WebElement angelfishListPageLink;

    @Step("Click on Angelfish Link")
    public AngelfishListPage clickOnAngelFishProductsLink() {
        angelfishListPageLink.click();
        log().info("Clicked on Angelfish Link");
        return new AngelfishListPage();
    }
}
