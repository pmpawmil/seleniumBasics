package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static navigation.ApplicationURLs.LOGIN_URL;

public class PositiveLoginTests extends TestBase {

    @Test
    @Description("The goal of this test is to log in using proper username and password" +
            " and check if Dog Banner is displayed after")
    public void asUserLoginUsingValidLoginAndPassword() {

        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .assertThatDogBannerIsDisplayed();
    }
}
