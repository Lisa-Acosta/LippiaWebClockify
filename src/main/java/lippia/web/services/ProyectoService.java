package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;
import static lippia.web.constants.LoginConstants.*;
import static lippia.web.constants.ProyectoConstants.*;

public class ProyectoService extends ActionManager {

    public static void proyectosPage() throws InterruptedException{
        CommonService.login();
        waitVisibility(SIDEBAR_NAVIGATION);
        click(LINK_PROYECTOS);
    }

    public static void ingresarNombre(String proyecto) {
        waitVisibility(TITTLE_CREATE_PROJECT);
        setInput(INPUT_PROJECT_NAME, proyecto);
    }

    public static void ingresarNombreRandom(String nombre) {
        String nombreRandom = nombre + generarRandom(2);
        setInput(INPUT_PROJECT_NAME, nombreRandom);
    }

    public static void seleccionarCliente(String cliente) {
        click(BUTTON_SELECT_CLIENT);
        click(DROPDOWN_CLIENT, cliente);
    }

    public static void elegirVisibilidad(String visibilidad) {
        if (!visibilidad.equals("Public")){
            click(CHECK_PUBLIC);
        }
    }

    public static void elegirColor(String color) {
        click(BUTTON_COLORS);
        click(DROPDONW_LIST_COLORS, color);
    }

    public static void visualizarproyecto(String nombre) {
        waitVisibility(NAME_PROJECTS, nombre);
        Assert.assertTrue(isVisible(NAME_PROJECTS, nombre));
    }

    public static void noVisualizarProyecto(String proyecto) {
        waitVisibility(SIDEBAR_NAVIGATION);
        Assert.assertFalse(isPresent(NAME_PROJECTS, proyecto));
    }

    public static String generarRandom(int numero) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < numero; i++) {
            int randomIndex = (int) (Math.random() * characters.length());
            randomString.append(characters.charAt(randomIndex));
        }
        return randomString.toString();
    }

    public static void mostrarProyectoCreado() {
        waitVisibility(PROJECT_CREATED);
        Assert.assertTrue(isVisible(PROJECT_CREATED));
    }
}
