package lippia.web.services;


import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static lippia.web.constants.WorkspaceConstants.*;


public class WorkspaceService extends ActionManager {


    public static void workspacePage() throws InterruptedException {
        CommonService.login();
        waitVisibility(LINK_WORKSPACE);
        click(LINK_WORKSPACE);
        click(LINK_WORKSPACE_MANAGE);
    }

    public static void ingresarNombre(String nombre) {
        setInput(INPUT_NAME, nombre);
    }

    public static void visualizarWorkspace(String nombre) {
        waitVisibility(NAME_WORKSPACE,nombre);
        Assert.assertTrue(isVisible(NAME_WORKSPACE, nombre));
    }

    public static void eliminarWorkspace(String workspace) {
        waitVisibility(LINK_WORKSPACE).click();
        waitVisibility(PRECEDING_WORKSPACE).click();
        waitClickable(IMG_DELETE_WORKSPACE).click();
        setInput(INPUT_DELETE, "DELETE");
        waitClickable(BUTTON_CONFIRM_DELETE).click();
        waitVisibility(TITTLE_WORKSPACES);
        Assert.assertFalse(isVisible(NAME_WORKSPACE, workspace));
    }

    public static void noVisualizarWorkspace(String nombre) {
        waitVisibility(TITTLE_WORKSPACES);
        Assert.assertFalse(isPresent(NAME_WORKSPACE, nombre));
    }

    public static void mensaje(String mensaje) {
        waitVisibility(TEXT_MENSAJE,mensaje);
        Assert.assertTrue(isVisible(TEXT_MENSAJE, mensaje));
    }
}
