package lippia.web.constants;

public class TimeTrackerConstants {
    public static final String INPUT_WORKED ="xpath://input[@name='autocomplete-input']";
    public static final String MANUAL_MODE_BUTTON ="id:manual-mode";
    public static final String INPUT_AM_PM_INIT ="css:.cl-mobile-hide-input-date-picker input-time-ampm:nth-of-type(1) > .cl-form-control";
    public static final String INPUT_AM_PM_END ="css:.cl-mobile-hide-input-date-picker input-time-ampm:nth-of-type(2) > .cl-form-control";
    public static final String INPUT_DATE ="xpath://input[contains(@class,'input-date')]";
    public static final String LABEL_MSJ_OK ="xpath://*[@aria-label='Time entry has been created']";
    public static final String LABEL_MSJ_EDIT ="xpath://*[@aria-label='Sucessfully updated description']";
    public static final String BUTTON_ADD_WORK ="xpath://button[contains(@class,'cl-d-none')]";
    public static final String GROUP_WORK ="xpath://entry-group[@class='ng-star-inserted']";
    public static final String LABEL_WORK ="xpath://div[contains(text(),'%s')]";
    public static final String WORK_GROUP ="xpath://div[@class='cl-tracker-entries-wrapper ng-star-inserted']";
    public static final String TIMER_BUTTON ="xpath://div[@class='cl-d-none cl-d-lg-custom-block ng-star-inserted']/a[1]";
    public static final String START_BUTTON ="xpath://app-button[1]";
    public static final String MENU_CANCEL_BUTTON ="xpath://div[@class='pointer cl-non-selectable cl-d-flex cl-dropdown-toggle cl-no-arrow']";
    public static final String CANCELAR_BUTTON ="xpath://a[contains(.,'Discard')]";
    public static final String MODIFICAR_TRABAJO = "xpath://entry-group//input[@class='cl-form-control cl-input-description cl-auto-pointer-event ng-untouched ng-pristine ng-valid']";
    public static final String MODIFICAR_HORA = "Xpath: //entry-group[1]//input-time-ampm[%s]/input";
    public static final String MENU_MODIFICAR = "Xpath: //div[@class='pointer cl-non-selectable cl-component-divided-left cl-d-flex cl-dropdown-toggle cl-no-arrow']/img[@alt='Edit menu dark theme']";
}
