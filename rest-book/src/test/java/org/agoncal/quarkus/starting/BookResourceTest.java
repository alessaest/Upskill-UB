package org.agoncal.quarkus.starting;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
class BookResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/api/books")
          .then()
             .statusCode(200) 
             .body(is("Hello RESTEasy"));
    }

}