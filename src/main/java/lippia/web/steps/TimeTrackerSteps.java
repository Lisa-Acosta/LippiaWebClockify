package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.TimeTrackerService;

public class TimeTrackerSteps extends PageSteps {

    @When("^ingresa el trabajo \"(.*)\"$")
    public void ingresaElTrabajo(String trabajo) {
        TimeTrackerService.ingresarTrabajo(trabajo);
    }

    @And("^ingresa la hora de inicio \"(.*)\"$")
    public void ingresaLaHoraDeInicio(String inicio) {
        TimeTrackerService.ingresarInicio(inicio);
    }

    @And("^ingresa la hora de fin \"(.*)\"$")
    public void ingresaLaHoraDeFin(String fin) {
        TimeTrackerService.ingresarFin(fin);
    }

    @And("^ingresa la fecha \"(.*)\"$")
    public void ingresaLaFecha(String fecha) {
        TimeTrackerService.ingresarFecha(fecha);
    }

    @Then("se visualiza el trabajo \"(.*)\"$")
    public void seVisualizaElTrabajo(String trabajo) {
        TimeTrackerService.visualizarTrabajo(trabajo);
    }
}