package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;

import static navigation.ApplicationURLs.APPLICATION_URL;

public class ShoppingCartTest extends TestBase {

    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout() {

        DriverUtils.navigateToPage(APPLICATION_URL);

        LandingPage landingPage = new LandingPage();
        landingPage
                .clickOnEnterStoreLink()
                .clickOnFishCategoryLink()
                .clickOnAngelFishProductsLink()
                .clickOnAddToCartSmallAngelfish()
                .clickOnProceedToCheckout();

        LoginPage loginPage = new LoginPage();
        loginPage.assertThatWarningIsDisplayed("You must sign on before attempting to check out. " +
                "Please sign on and try checking out again.");

    }

}
