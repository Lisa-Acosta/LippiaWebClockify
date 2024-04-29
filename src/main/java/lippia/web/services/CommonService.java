package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import java.util.HashMap;
import java.util.Map;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.LoginConstants.*;
import static lippia.web.services.LoginService.*;

public class CommonService extends ActionManager {

    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void login() throws InterruptedException {
        navigateTo("https://app.clockify.me/en/login");
        clickLink("Log in manually");
        completarEmailYPass(PropertyManager.getProperty("user"), PropertyManager.getProperty("pass"));
        clickButton("LOG IN");
        verifyPage();
    }

    public static void clickLink(String link) throws InterruptedException{
        Map<String,String> links = new HashMap<>();
        links.put("Log in", LINK_HEADER_LOGIN);
        links.put("Log in manually", LINK_MANUAL_LOGIN);
        links.put("Log out", LINK_LOGOUT);

        try{
            waitClickable(links.get(link)).click();
        }catch(Exception e){
            Thread.sleep(8000);
            waitClickable(links.get(link)).click();
        }
    }

    public static void clickButton(String button) throws InterruptedException
    {
            Map<String, String> buttons = new HashMap<>();
            buttons.put("LOG IN", BUTTON_LOGIN );
            buttons.put("CONTINUE WITH EMAIL", BUTTON_WITH_EMAIL);
            buttons.put("Continue with Google",BUTTON_WITH_GOOGLE);

        try{
            waitPresence(buttons.get(button)).click();
        }catch(Exception e){
            Thread.sleep(8000);
            waitPresence(buttons.get(button)).click();

        }


    }

    public static void clickAvatar() {
        click(LINK_AVATAR);
    }
}
