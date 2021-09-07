package mx.AIT.maven.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.AIT.maven.appium.BaseAppium;
import mx.AIT.maven.userinterfaces.Login;
import mx.AIT.maven.userinterfaces.HomePage;
import mx.AIT.maven.userinterfaces.CartPage;


public class HappyPathSteps {
    @Given("^We enter to application$")
    public void We_enter_to_application() {
        BaseAppium app = new BaseAppium();
        try{
            app.init();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Given("^user login$")
    public void user_login() throws Throwable {
        Login login = new Login();
        login.login();
        throw new PendingException();
    }

    @When("^We purchase the product$")
    public void we_purchase_the_product() throws Throwable {
        HomePage home = new HomePage();
        CartPage cart = new CartPage();
        home.addProduct();
        cart.checkProduct();
        throw new PendingException();
    }

    @Then("^The purchase is successful$")
    public void the_purchase_is_successful() throws Throwable {
        CartPage cart = new CartPage();
        cart.finishCheck();
        throw new PendingException();
    }
}
