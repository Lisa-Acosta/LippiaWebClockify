package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @And("^ingresa el email (.*)$")
    public void ingresaElEmail(String email) {
        LoginService.inputEmail(email);
    }

    @And("^ingresa la password (.*)$")
    public void ingresaLaPassword(String password) {
        LoginService.inputPassword(password);
    }

    @Then("se ingresa a la home page")
    public void seIngresaALaHomePage() {
       LoginService.verifyPage();
    }

    @Then("^se visualiza el mensaje (.*)$")
    public void seVisualizaElMensaje(String mensaje) {
        LoginService.viewMsj(mensaje);
    }

    @And("ingresa con una cuenta de Google")
    public void ingresaConUnaCuentaDeGoogle() {
        LoginService.inputEmailGoogle();
    }

    @And("intenta loguearse por 4 veces")
    public void intentaLoguearsePorVeces() {
        LoginService.bloqueoCuenta();
    }

    @And("^ingresa con email (.*) y password (.*)$")
    public void ingresaConEmailYPassword(String email, String pass) {
        LoginService.completarEmailYPass(email,pass);
    }

    @And("ingresa con email y password validos")
    public void ingresaConEmailYPasswordValidos(){
        LoginService.completarEmailYPass();
    }

    @Then("se visualiza la pagina del Login")
    public void seVisualizaLaPaginaDelLogin()  {
        LoginService.visualizarLogin();
    }
}
