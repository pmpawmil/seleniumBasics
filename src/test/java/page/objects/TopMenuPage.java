package page.objects;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class TopMenuPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    private WebElement signOnLink;

    @FindBy(css = "#Sidebar img[src*='fish']")
    private WebElement fishCategoryLink;

    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("Click on Sign In Link")
    public LoginPage clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(signOnLink);
        signOnLink.click();
        logger.info("Clicked on Sign on Link");
        return new LoginPage();
    }

    @Step("Click on Fish Category Link")
    public FishListPage clickOnFishCategoryLink() {
        WaitForElement.waitUntilElementIsClickable(fishCategoryLink);
        fishCategoryLink.click();
        logger.info("Clicked on Fish Category Link");
        return new FishListPage();
    }
}

