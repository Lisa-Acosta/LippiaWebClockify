package lippia.web.steps;

import com.crowdar.core.PageSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import lippia.web.services.WorkspaceService;

public class WorspaceSteps extends PageSteps {
    @Given("el usuario esta en la pagina de Workspace")
    public void elUsuarioEstaEnLaPaginaDeWorkspace() throws InterruptedException {
        WorkspaceService.workspacePage();
    }

    @When("^ingresa el nombre del workspace \"(.*)\"$")
    public void ingresaElNombreDelWorkspace(String nombre) {
        WorkspaceService.ingresarNombre(nombre);
    }

    @Then("^se visualiza el workspace \"(.*)\"$")
    public void seVisualizaElWorkspace(String workspace) {
        WorkspaceService.visualizarWorkspace(workspace);
    }

    @When("^ingresa el nombre del workspaces (.*)$")
    public void ingresaElNombreDelWorkspaces(String nombre) {
        WorkspaceService.ingresarNombre(nombre);

    }

    @Then("^no se visualiza el workspace (.*)$")
    public void noSeVisualizaElWorkspace(String nombre) {
        WorkspaceService.noVisualizarWorkspace(nombre);
    }

    @Then("^se muestra el mensaje \"(.*)\"$")
    public void seMuestraElMensaje(String mensaje) {
        WorkspaceService.mensaje(mensaje);
    }
}
