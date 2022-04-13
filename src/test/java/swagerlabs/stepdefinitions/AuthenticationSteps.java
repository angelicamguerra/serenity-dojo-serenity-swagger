package swagerlabs.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.ui.Button;
import swagerlabs.model.SwaglabsUser;
import swagerlabs.tasks.authentication.Login;
import swagerlabs.tasks.navigation.Navigate;


public class AuthenticationSteps {

    @Given("{actor} is on the login page")
    public void colin_is_on_the_login_page(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheLoginPage());
                //Open.url("https://www.saucedemo.com/"));
    }
    @When("{actor} logs in with valid credential")
    public void colin_logs_in_with_valid_credential(Actor actor) {
        actor.attemptsTo(

                Login.asA(SwaglabsUser.STANDARD_USER)
        );
    }
    @Then("{actor} should be presented with the product catalog")
    public void he_should_be_presented_with_the_product_catalog(Actor actor) {
        actor.attemptsTo(
        Ensure.that(Text.of(".title")).isEqualToIgnoringCase("Products")
        );

    }


}
