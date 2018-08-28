package com.BJSS.framework.helpers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.specification.RequestSpecification;

import static com.jayway.restassured.RestAssured.given;

public class ApiHelper {
    private static Gson gson;
    private static String baseUrl = "https://reqres.in/";

    static {
        RestAssured.baseURI = baseUrl;

    }

    protected static RequestSpecification givenConfig() {
        RestAssured.useRelaxedHTTPSValidation();
        return given().header("Content-Type", "application/json").header("Accept-Language", "en");
    }

    public static Gson gson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        // if uncommented will also create Json for fields which are null
        //   gsonBuilder.serializeNulls();
        gson = gson(gsonBuilder);
        return gson;
    }

    public static Gson gson(GsonBuilder gsonBuilder) {
        gson = gsonBuilder.create();
        return gson;
    }
}
