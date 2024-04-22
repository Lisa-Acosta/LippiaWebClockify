package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @Given("^The client is on clockify page$")
    public void home() {LoginService.navegarWeb();
    }


    @When("^The client login with credentials email (.*) and password (.*)$")
    public void login(String email, String password) {
        LoginService.enterLoginPage();
        LoginService.login(email,password);
    }

    @Then("The client verify clockify home page is displayed")
    public void homePageIsDisplayed() {LoginService.verifyPage();
    }
}
