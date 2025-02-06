package examples;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Test
public class FirstTest {

    // GET https://petstore.swagger.io/v2/pet/findByStatus?status=alive
    public void getRequestWithQueryParam() {
        // Create a response object
        Response response =
            given() // Request specifications
                .baseUri("https://petstore.swagger.io/v2/pet")
                .header("Content-Type", "application/json")
                .queryParam("status", "alive")
            .when() // Send request and receive response
                .get("/findByStatus");

        // Print the status code
        System.out.println("Status Code: " + response.getStatusCode());

        // Print the response body
        System.out.println("Response Body: " + response.getBody().asString());
        System.out.println("Pretty Response Body: " + response.getBody().asPrettyString());

        // Print the response headers
        System.out.println("Response Headers: " + response.getHeaders().asList());

        // Check if the response list is not empty
        if (!response.jsonPath().getList("").isEmpty()) {
            // Extract values from the response
            String petStatus = response.then().extract().path("[0].status");

            // Assert the pet status with TestNG 
            assertEquals(petStatus, "alive");

            // RESTAssured assertion
            response.then().statusCode(200).body("[0].status", equalTo("alive"));
        } else {
            System.out.println("No pets found with status 'alive'");
        }
    }

    // GET https://petstore.swagger.io/v2/pet/{petId}
    public void getRequestWithPathParam() {
        // Send request, receive response, and perform assertions
        Response response = 
            given()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .header("Content-Type", "application/json")
                .pathParam("petId", 77232)
                .log().all() // Log request details for debugging
            .when()
                .get("/{petId}");

        // Print status code and response body
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

        // Check if status code is 404 or not found
        if (response.getStatusCode() == 404) {
            System.out.println("Pet with ID 77232 not found.");
        } else {
            // Assert the response status code and check if the pet name matches
            response.then()
                .statusCode(200)
                .body("name", equalTo("Hansel"));
        }
    }
}
