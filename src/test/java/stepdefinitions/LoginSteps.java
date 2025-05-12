package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("the user is on the login page")
    public void user_on_login_page() {
        driver.get("https://google.com/login");
    }

    @When("the user enters {string} and {string}")
    public void user_enters_credentials(String username, String password) throws Exception {
        Thread.sleep(10000);
        //loginPage.login(username, password);
    }

    @Then("the user should be redirected to the homepage")
    public void user_on_homepage() {
        // validation here
    }
}
    