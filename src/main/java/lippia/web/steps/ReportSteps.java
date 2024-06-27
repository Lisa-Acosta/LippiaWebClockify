package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import lippia.web.services.CommonService;


public class ReportSteps extends PageSteps {
    @Then("se visualiza la descarga del Pdf")
    public void seVisualizaLaDescargaDelPdf() {
        CommonService.visualizarDescarga();
    }
}



