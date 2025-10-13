package pages;

import com.codeborne.selenide.SelenideElement;
import utils.PropertyReader;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private static final String USER_CSS = "[placeholder='Work email']";
    private final SelenideElement password_input = $x("//*[@placeholder='Password']");
    private final SelenideElement submit = $x("//*[@type='submit']");

    public LoginPage openPage() {
        open("login");
        return this;
    }

    public LoginPage login() {
        $(USER_CSS).setValue(PropertyReader.getProperty("user_login")).pressEnter();
        password_input.sendKeys(PropertyReader.getProperty("user_password"));
        return this;
    }

    public LoginPage submit() {
        submit.submit();
        return this;
    }
}
