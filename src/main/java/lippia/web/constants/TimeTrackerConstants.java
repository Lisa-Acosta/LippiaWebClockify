package lippia.web.constants;

public class TimeTrackerConstants {

    public static final String INPUT_WORKED ="xpath://input[@name='autocomplete-input']";
    public static final String INPUT_AM_PM_INIT ="css:.cl-mobile-hide-input-date-picker input-time-ampm:nth-of-type(1) > .cl-form-control";
    public static final String INPUT_AM_PM_END ="css:.cl-mobile-hide-input-date-picker input-time-ampm:nth-of-type(2) > .cl-form-control";
    public static final String INPUT_DATE ="xpath://input[contains(@class,'input-date')]";
    public static final String LABEL_MSJ_OK ="xpath://*[@aria-label='Time entry has been created']";
    public static final String BUTTON_ADD_WORK ="xpath://button[contains(@class,'cl-d-none')]";
    public static final String GROUP_WORK ="xpath://entry-group[@class='ng-star-inserted']";
    public static final String LABEL_WORK ="xpath://*[contains(text(),'%s')]";

}
