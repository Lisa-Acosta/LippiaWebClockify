package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

import static lippia.web.constants.LoginConstants.*;

public class LoginService extends ActionManager {


    public static void completarEmailYPass() {
        setInput(INPUT_EMAIL, PropertyManager.getProperty("user"));
        setInput(INPUT_PASSWORD, PropertyManager.getProperty("pass"));
    }
    public static void completarEmailYPass(String email, String pass) {
        setInput(INPUT_EMAIL, email);
        setInput(INPUT_PASSWORD, pass);
    }

    public static void verifyPage() {
        waitVisibility(SIDEBAR_NAVIGATION);
        Assert.assertTrue(isVisible(LoginConstants.SIDEBAR_NAVIGATION));
    }

    public static void inputEmail(String email) {
        setInput(INPUT_EMAIL,email);
    }

    public static void inputPassword(String password) {
        setInput(INPUT_PASSWORD, password);
    }

    public static void viewMsj(String mensaje) {
        waitVisibility(TEXT_MENSAJE,mensaje);
        Assert.assertTrue(isVisible(TEXT_MENSAJE,mensaje));
    }

    public static void inputEmailGoogle() {
        setInput(INPUT_EMAIL_GOOGLE, PropertyManager.getProperty("user"));
        click(BUTTON_GOOGLE_SIGUIENTE);
        click(BUTTON_GOOGLE_REINTENTAR);
        waitVisibility(INPUT_PASSWORD_GOOGLE);
        setInput(INPUT_PASSWORD_GOOGLE, PropertyManager.getProperty("pass"));
        click(BUTTON_GOOGLE_SIGUIENTE);
    }

    public static void bloqueoCuenta() {
        int intentos = 0;
        while (intentos <5){
            completarEmailYPass("","");
            completarEmailYPass(PropertyManager.getProperty("user2"),"cualquiera");
            intentos++;
        }
    }


}
