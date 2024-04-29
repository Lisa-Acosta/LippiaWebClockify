package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lippia.web.services.CommonService;

public class CommonSteps extends PageSteps {
    @Given("^el usuario esta en la pagina Clockify.me$")
    public void home() {
        CommonService.navegarWeb();
    }
    @And("^hace click en el link \"(.*)\"$")
    public void haceClickEnElLink(String login) throws InterruptedException {
        CommonService.clickLink(login);
    }

    @And("^hace click en el boton \"(.*)\"$")
    public void haceClickEnElBoton(String boton) throws InterruptedException  {
        CommonService.clickButton(boton);
    }
}
