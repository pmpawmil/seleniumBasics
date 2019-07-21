package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage {

    @FindBy(css = "a[href$=FI-SW-01]")
    WebElement angelfishListPageLink;

    public FishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public AngelfishListPage clickOnAngelFishProductsLink() {
        angelfishListPageLink.click();
        return new AngelfishListPage();
    }
}
