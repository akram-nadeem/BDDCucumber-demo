package StepsDefinition;

import Pages.logInPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;


public class LogInStepsDef  {
    logInPage log=new logInPage();
    BaseTestStart base=new BaseTestStart();

@Before
public void beforeStart(){
    base.setup();
}



    @Given("User is on login page")
    public void user_is_on_login_page() {

    log.verifyUserIsOnLoginPage();
    }


    @When("user enters valid username and pass")
    public void user_enters_valid_username_and_pass() {
        log.enterUserName();
        log.enterPassword();


    }
    @And("Clicks on login btn")
    public void clicks_on_login_btn() {

      log.clickLoginBtn();

    }
    @Then("user is redirected to home page")
    public void user_is_redirected_to_home_page() {

        log.verifyUserIsOnHomePage();

    }
    @After
    public void OneTimeTearDown() {

        base.tearDown();
    }




}

