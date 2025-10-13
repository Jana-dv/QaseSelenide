package tests;

import org.testng.annotations.Test;
import tests.parent.BaseTest;

public class LoginTest extends BaseTest {
    @Test(description = "Проверка авторизации с корректными данными")
    public void loginTest() {
        loginPage.openPage()
                .login()
                .submit();

        projectsPage.waitPageLoaded()
                .checkPageTitle()
                .checkProjectExist();
    }
}
