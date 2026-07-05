package base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import utils.ConfigReader;

public class ApiBase {

    protected RequestSpecification request;

    public void setup() {

        RestAssured.baseURI = ConfigReader.getProperty("base.url");

        request = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");
    }
}