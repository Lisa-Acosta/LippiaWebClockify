package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ProyectoService;

public class ProyectoSteps extends PageSteps {
    @Given("el usuario esta en la pagina de Proyectos")
    public void elUsuarioEstaEnLaPaginaDeProyectos() throws InterruptedException {
        ProyectoService.proyectosPage();
    }


    @When("^ingresa el nombre del proyecto (.*)$")
    public void ingresaElNombreDelProyecto(String nombre) {
        ProyectoService.ingresarNombre(nombre);
    }

    @And("^selecciona el cliente (.*)$")
    public void seleccionaElCliente(String cliente) {
        ProyectoService.seleccionarCliente(cliente);
    }

    @And("^elige la visibilidad (.*)$")
    public void eligeLaVisibilidad(String visibilidad) {
        ProyectoService.elegirVisibilidad(visibilidad);
    }

    @And("^elige un color (.*)$")
    public void eligeUnColor(String color) {
        ProyectoService.elegirColor(color);
    }

    @Then("^se visualiza el proyecto con el nombre (.*)$")
    public void seVisualizaElProyectoConElNombre(String nombre) {
        ProyectoService.visualizarproyecto(nombre);
    }

    @Then("^no se visualiza el proyecto (.*)$")
    public void noSeVisualizaElProyecto(String proyecto) {
        ProyectoService.noVisualizarProyecto(proyecto);
    }
}
