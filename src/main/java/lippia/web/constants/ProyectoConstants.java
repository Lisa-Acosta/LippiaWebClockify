package lippia.web.constants;

public class ProyectoConstants {

    public static final String LINK_PROYECTOS ="xpath://span[contains(.,'Projects')]";
    public static final String BUTTON_NEW_PROJECT = "xpath://button[contains(text(),'Create new')]";
    public static final String TITTLE_CREATE_PROJECT = "xpath://h1[.='Create new project']";
    public static final String INPUT_PROJECT_NAME = "xpath://input[@placeholder='Enter project name']";
    public static final String BUTTON_SELECT_CLIENT = "xpath://button[contains(text(),'Select client')]";
    public static final String DROPDOWN_CLIENT = "xpath://li[contains(.,'%s')]";
    public static final String BUTTON_CREATE_PROJECT = "xpath://button[@data-cy='create-project']";

    public static final String BUTTON_COLORS ="xpath://span[@class='cl-color-picker-item pointer']";
    public static final String DROPDONW_LIST = "xpath://*[@style='background: var(--default-picker-color-1);']";
    public static final String DROPDONW_LIST_COLORS = "xpath://*[@style='%s']";

    public static final String CHECK_PUBLIC ="xpath://app-checkbox[@class='ng-untouched ng-valid ng-dirty']";
    public static final String NAME_PROJECTS ="xpath://a[.='%s']";
    public static final String TEXT_MENSAJE = "xpath://*[contains(text(),\"%s\")]";


}
