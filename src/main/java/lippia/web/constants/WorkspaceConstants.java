package lippia.web.constants;

public class WorkspaceConstants {

    public static final String LINK_WORKSPACE ="xpath://*[@data-cy='workspace-dropdown']";
    public static final String LINK_WORKSPACE_MANAGE ="xpath://a[contains(.,'Manage')]";
    public static final String BUTTON_NEW_CREATE_WORKSPACE ="xpath://button[contains(.,'Create new ')]";
    public static final String INPUT_NAME ="xpath://input[@formcontrolname='name']";
    public static final String BUTTON_CREATE_WORKSPACE ="xpath://button[@type='submit' and contains(text(),' Create ')]";
    public static final String NAME_WORKSPACE ="xpath://workspace-row[contains(.,'%s')]";
    public static final String HOME_WORKSPACE ="xpath://div[@id='workspace-picker']/div[contains(.,'%s')]";
    public static final String BUTTON_DELETE_WORKSPACE = "xpath://workspace-row[contains(.,'%s')" +
            "]//button//*[@data-cy='delete-workspace']";
    public static final String INPUT_DELETE = "xpath://input[@formcontrolname='confirmationModel']";
    public static final String BUTTON_CONFIRM_DELETE ="xpath://button[.=' Delete Workspace ']";
    public static final String TITTLE_WORKSPACES ="xpath://h1[.='Workspaces']";
    public static final String LINK_CANCEL_WORKSPACE ="xpath://a[.='Cancel']";
    public static final String TEXT_MENSAJE = "xpath://*[contains(text(),\"%s\")]";



}
