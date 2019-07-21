package page.objects;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "a[href$=FI-SW-01]")
    WebElement angelfishListPageLink;

    public FishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("Click on Angelfish Link")
    public AngelfishListPage clickOnAngelFishProductsLink() {
        angelfishListPageLink.click();
        logger.info("Clicked on Angelfish Link");
        return new AngelfishListPage();
    }
}
