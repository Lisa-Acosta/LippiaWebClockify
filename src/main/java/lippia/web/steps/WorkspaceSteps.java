package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.WorkspaceService;

public class WorkspaceSteps extends PageSteps {
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

    @When("hace click en las opciones del workspace")
    public void haceClickEnLasOpcionesDelWorkspace() {
        WorkspaceService.clickOpciones();
    }

    @And("^elije el workspace (.*)$")
    public void elijeElWorkspace(String workspace) {
        WorkspaceService.elegirWorkspace(workspace);
    }

    @And("^actualiza el workspace (.*)$")
    public void actualizaElWorkspace(String workspaceActualizado) {
        WorkspaceService.actualizarWorkspace(workspaceActualizado);
    }

    @Then("^se visualiza el nombre del workspace (.*)$")
    public void seVisualizaElNombreDelWorkspace(String nombreWorkspace) {
        WorkspaceService.visualizarNombreWorkspace(nombreWorkspace);
    }
}
