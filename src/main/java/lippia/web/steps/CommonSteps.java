package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.CommonService;

public class CommonSteps extends PageSteps {
    @Given("^el usuario esta en la pagina Clockify.me$")
    public void home() {
        CommonService.navegarWeb();
    }
    @And("^hace click en el link \"(.*)\"$")
    public void haceClickEnElLink(String link) throws InterruptedException {
        CommonService.clickLink(link);
    }

    @And("^hace click en el boton \"(.*)\"$")
    public void haceClickEnElBoton(String boton) throws InterruptedException  {
        CommonService.clickButton(boton);
    }

    @When("hace click en el boton del avatar")
    public void haceClickEnElBotonDelAvatar() {
        CommonService.clickAvatar();
    }

    @Given("el usuario esta logueado en la web Clockify.me")
    public void elUsuarioEstaLogueadoEnLaWebClockifyMe() throws InterruptedException {
        CommonService.login();
    }
}
