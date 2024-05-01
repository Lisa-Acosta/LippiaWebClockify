package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;
import static lippia.web.constants.TimeTrackerConstants.*;

public class TimeTrackerService extends ActionManager {

    public static void ingresarTrabajo(String trabajo) {
        setInput(INPUT_WORKED, trabajo);
    }

    public static void ingresarInicio(String inicio) {
        click(INPUT_AM_PM_INIT);
        setInput(INPUT_AM_PM_INIT, inicio);
    }

    public static void ingresarFin(String fin) {
        click(INPUT_AM_PM_END);
        setInput(INPUT_AM_PM_END, fin);
    }

    public static void ingresarFecha(String fecha) {
        click(INPUT_DATE);
        setInput(INPUT_DATE, fecha);
    }

    public static void visualizarTrabajo(String trabajo) throws InterruptedException {
            waitVisibility(LABEL_MSJ_OK);
            Thread.sleep(4000);
            Assert.assertTrue(isPresent(LABEL_WORK, trabajo));
        }
    }

