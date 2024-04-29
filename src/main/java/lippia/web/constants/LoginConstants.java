package lippia.web.constants;

public class LoginConstants {

    public static final String LINK_HEADER_LOGIN = "xpath://a[.='Log in']";
    public static final String LINK_MANUAL_LOGIN = "xpath://a[contains(.,'Log in manually')]";

    public static final String INPUT_EMAIL = "id:email";
    public static final String INPUT_PASSWORD = "xpath://input[@id='password']";
    public static final String INPUT_EMAIL_GOOGLE = "xpath://input[@type='email']";
    public static final String INPUT_PASSWORD_GOOGLE = "xpath://input[@name='Passwd']";

    public static final String SIDEBAR_NAVIGATION = "xpath://sidebar-navigation[contains(.,'TIME TRACKER')]";

    public static final String TEXT_MENSAJE = "xpath://*[contains(text(),'%s')]";

    public static final String BUTTON_LOGIN = "xpath://button[contains(text(),'Log In')]";
    public static final String BUTTON_WITH_EMAIL = "xpath://button[contains(.,'Continue with email')]";
    public static final String BUTTON_WITH_GOOGLE = "xpath://*[contains(text(),'Continue with Google ')]";
    public static final String BUTTON_GOOGLE_REINTENTAR = "xpath://*[contains(text(),'Reintentar')]";
    public static final String BUTTON_GOOGLE_SIGUIENTE = "xpath://*[contains(text(),'Siguiente')]";
}
