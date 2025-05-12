package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    @Test
    public void testGetRequest() {
        RestAssured
                .given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .basePath("/posts/1")
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}
