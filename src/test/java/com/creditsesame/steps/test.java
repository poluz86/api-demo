package com.creditsesame.steps;

import com.creditsesame.requests.SignupRequest;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import javax.swing.text.Utilities;
import java.io.File;

public class test {

    @Before
    public void SetUp(){
        RestAssured.baseURI = "https://test8.hq.creditsesame.com";
        RestAssured.useRelaxedHTTPSValidation();
    }

    @After
    public void TearDown(){

    }

    @Given("^I authenticate into ServiceApi with username: \"([^\"]*)\" password: \"([^\"]*)\" using apiKey: \"([^\"]*)\"$")
    public void iAuthenticateIntoServiceApiWithUsernamePasswordUsingApiKey(String username, String password, String apiKey) throws Throwable {
        given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("X-Requested-With","XMLHttpRequest")
                .header("X-cs-session-id","QA")
                .body("{\"username\":\""+ username +"\",\""+ password +"\":\"password\",\"apiKey\":\""+ apiKey +"\"}")
                .when().post("/api/v1/sessions")
                .then().statusCode(201)
                .and().time(lessThan(1000L));
    }

    @Given("^I authenticate into ServiceApi using body \"([^\"]*)\"$")
    public void iAuthenticateIntoServiceApiUsingBody(String fileName) throws Throwable {
        given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("X-Requested-With","XMLHttpRequest")
                .header("X-cs-session-id","QA")
                .body(new File("src/test/java/resources/"+ fileName))
                .when().post("/api/v1/sessions")
                .then().statusCode(201)
                .and().time(lessThan(3000L));
    }

    @Given("^I signup into ServiceApi with username: \"([^\"]*)\" password: \"([^\"]*)\" using apiKey: \"([^\"]*)\"$")
    public void iSignupIntoServiceApiWithUsernamePasswordUsingApiKey(String username, String password, String apiKey) throws Throwable {
        SignupRequest request = new SignupRequest();
        request.setUsername(username);
        request.setPassword(password);
        request.setApiKey(apiKey);

        given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("X-Requested-With","XMLHttpRequest")
                .header("X-cs-session-id","QA")
                .body(request)
                .when().post("/api/v1/sessions")
                .then().statusCode(201)
                .and().time(lessThan(3000L));
    }
}
