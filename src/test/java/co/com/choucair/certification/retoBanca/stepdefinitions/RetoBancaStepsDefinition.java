package co.com.choucair.certification.retoBanca.stepdefinitions;

import co.com.choucair.certification.retoBanca.model.DataAutomation;
import co.com.choucair.certification.retoBanca.questions.Answer;
import co.com.choucair.certification.retoBanca.tasks.Fill;
import co.com.choucair.certification.retoBanca.tasks.OpenUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class RetoBancaStepsDefinition {


    public RetoBancaStepsDefinition() {
    }

    @Given("^that (.*) wants create a new profile on Utest$")
    public void thatUserWantsToCreateANewProfile(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(new Performable[]{OpenUp.thePage()} );
    }


    @When("^user complete all the require steps$")
    public void userCompleteAllTheRequireSteps(List<DataAutomation> dataAutomation ) {
        OnStage.theActorInTheSpotlight().attemptsTo(new Performable[]{Fill.the(
                ((DataAutomation)dataAutomation.get(0)).getName(),
                ((DataAutomation)dataAutomation.get(0)).getLast_name(),
                ((DataAutomation)dataAutomation.get(0)).getEmail(),
                ((DataAutomation)dataAutomation.get(0)).getBirth_day(),
                ((DataAutomation)dataAutomation.get(0)).getBirth_month(),
                ((DataAutomation)dataAutomation.get(0)).getBirth_year(),
                ((DataAutomation)dataAutomation.get(0)).getLanguage(),
                ((DataAutomation)dataAutomation.get(0)).getCity(),
                ((DataAutomation)dataAutomation.get(0)).getPostal(),
                ((DataAutomation)dataAutomation.get(0)).getCountry(),
                ((DataAutomation)dataAutomation.get(0)).getPassword()
        )});
    }

    @Then("^the profile is create successful$")
    public void tehProfileIsCreateSuccessful() {
        OnStage.theActorInTheSpotlight().should(new Consequence[]{GivenWhenThen.seeThat((Question<Boolean>) Answer.toThe("The last step"))});
    }
}
