package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class TopMenuPage extends BasePage {

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    private WebElement signOnLink;

    @FindBy(css = "#Sidebar img[src*='fish']")
    private WebElement fishCategoryLink;

    @Step("Click on Sign In Link")
    public LoginPage clickOnSignInLink() {
        WaitForElement.waitUntilElementIsClickable(signOnLink);
        signOnLink.click();
        log().info("Clicked on Sign on Link");
        return new LoginPage();
    }

    @Step("Click on Fish Category Link")
    public FishListPage clickOnFishCategoryLink() {
        WaitForElement.waitUntilElementIsClickable(fishCategoryLink);
        fishCategoryLink.click();
        log().info("Clicked on Fish Category Link");
        return new FishListPage();
    }

}

