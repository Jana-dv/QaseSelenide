package tests.parent;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProjectsPage;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest {
    protected LoginPage loginPage;
    protected ProjectsPage projectsPage;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://app.qase.io/";
        Configuration.browserSize = "1920x1080";
        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();
    }

    @AfterMethod
    public void closeWindow() {
        clearBrowserCache();
        Selenide.closeWebDriver();
    }
}
