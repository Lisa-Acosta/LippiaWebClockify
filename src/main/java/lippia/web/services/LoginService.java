package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterLoginPage(){
        click(LoginConstants.HEADER_LOGIN);
    }

    public static void login(String email, String password) {
        click(LoginConstants.BUTTON_MANUAL_LOGIN);
        setInput(LoginConstants.INPUT_EMAIL, email);
        setInput(LoginConstants.INPUT_PASSWORD, password);
        click(LoginConstants.BUTTON_LOGIN);
    }

    public static void verifyPage() {
        waitVisibility(LoginConstants.SIDEBAR_NAVIGATION);
        Assert.assertTrue(isVisible(LoginConstants.SIDEBAR_NAVIGATION));
    }
}
