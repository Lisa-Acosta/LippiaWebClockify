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
        navigateTo(PropertyManager.getProperty("web.base.url"));
        completarEmailYPass(PropertyManager.getProperty("user"), PropertyManager.getProperty("pass"));
        clickButton("LOG IN");
        verifyPage();
    }

    public static void clickLink(String link) throws InterruptedException{
        Map<String,String> links = new HashMap<>();
        links.put("Log in", LINK_HEADER_LOGIN);
        links.put("Log In Manually", LINK_MANUAL_LOGIN);

        try{
            waitVisibility(links.get(link));
            waitClickable(links.get(link)).click();
        }catch(Exception e){
            Thread.sleep(8000);
            waitVisibility(links.get(link));
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
}
