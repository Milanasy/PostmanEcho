package ru.netology.rest;

import io.restassured.specification.Argument;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {
    @Test
    void returnSendData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello"));

    }
}
