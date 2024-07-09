package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.hasKey;
import static io.restassured.RestAssured.given;

@QuarkusTest
class NumberResourceTest  {

    @Test
    public void testNumberTest() {
        given()
                .when().get("/api/numbers")
                .then()
                .statusCode(200)
                .body("isbn_13", startsWith("13-"))
                .body("isbn_10", startsWith("10-"))
                .body(not(hasKey("generationDate")));
    }
}
