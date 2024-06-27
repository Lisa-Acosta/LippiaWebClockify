package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.WorkspaceConstants;
import org.testng.Assert;
import static lippia.web.constants.WorkspaceConstants.*;

public class WorkspaceService extends ActionManager {

    public static void workspacePage() throws InterruptedException {
        CommonService.login();
        click(LINK_WORKSPACE_OPTIONS);
        click(LINK_WORKSPACE_MANAGE);
    }
    public static void ingresarNombre(String nombre) {
        setInput(INPUT_NAME, nombre);
    }

    public static void visualizarWorkspace(String nombre){
        waitVisibility(NAME_WORKSPACE,nombre);
        Assert.assertTrue(isVisible(NAME_WORKSPACE, nombre));
    }

    public static void noVisualizarWorkspace(String nombre) {
        waitVisibility(TITLE_WORKSPACES);
        Assert.assertFalse(isPresent(NAME_WORKSPACE, nombre));
    }

    public static void mensaje(String mensaje) {
        waitVisibility(TEXT_MENSAJE,mensaje);
        Assert.assertTrue(isVisible(TEXT_MENSAJE, mensaje));
    }

    public static void eliminarWorkspace(String workspace) throws InterruptedException {
        click(LINK_WORKSPACE_OPTIONS);
        click(HOME_WORKSPACE, "HOME_WORKSPACE");
        waitPresence(BUTTON_DELETE_WORKSPACE, workspace).click();
        setInput(INPUT_DELETE, "DELETE");
        waitClickable(BUTTON_CONFIRM_DELETE).click();
        Thread.sleep(4000);
        noVisualizarWorkspace(workspace);
    }

    public static void clickOpciones() {
        click(LINK_WORKSPACE_OPTIONS);
    }

    public static void elegirWorkspace(String workspace) {
        click(WorkspaceConstants.WORKSPACE_SETTINGS_BUTTON, workspace);
    }

    public static void actualizarWorkspace(String workspaceActualizado) {
        setInput(INPUT_WORKSPACE_NAME,workspaceActualizado,false,true);
        click(LINK_WORKSPACE_OPTIONS);
    }

    public static void visualizarNombreWorkspace(String nombreWorkspace) {
        waitVisibility(TITLE_WORKSPACE_NAME,nombreWorkspace);
        Assert.assertTrue(isVisible(WorkspaceConstants.TITLE_WORKSPACE_NAME, nombreWorkspace));
    }
}
