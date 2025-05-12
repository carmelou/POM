package stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class APISteps {
    Response response;

    @Given("la API está disponible")
    public void la_api_esta_disponible() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @When("hago una petición GET al endpoint {string}")
    public void hago_peticion_get(String endpoint) {

        response = RestAssured.get(endpoint);
    }

    @Then("el código de respuesta debe ser {int}")
    public void el_codigo_respuesta_debe_ser(int codigo) {
        assertEquals(codigo, response.getStatusCode());
    }
}
