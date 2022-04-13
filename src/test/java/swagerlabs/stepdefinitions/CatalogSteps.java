package swagerlabs.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import swagerlabs.tasks.cart.AddToCart;
import swagerlabs.tasks.navigation.Navigate;

import java.util.List;

public class CatalogSteps {

    @Given("{actor} has logged on to the application")
    public void hasLoggedOnToTheApplication() {
    }

    @And("{actor} is browsing the catalog")
    public void heIsBrowsingTheCatalog(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheCatalogPage());

    }

    @When("{actor} adds the following items to the cart:")
    public void addsTheFollowingItemsToTheCart(Actor actor, List<String> items) {

                items.forEach(
                        itemName -> actor.attemptsTo((AddToCart.item(itemName)))
                );
    }

    @Then("the shopping cart count should be {int}")
    public void theShoppingCartCountShouldBe(int arg0) {
    }

    @And("items should appear in the cart")
    public void itemsShouldAppearInTheCart() {
    }
}
