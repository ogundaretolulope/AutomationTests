package com.BJSS.framework.pageobjects.api;

import com.BJSS.framework.helpers.ApiHelper;
import com.BJSS.framework.models.UserDetailModel;
import com.BJSS.framework.models.UserRegisterModel;
import com.BJSS.framework.models.UsersDetailsModel;
import com.jayway.restassured.response.Response;

import java.util.List;

public class ApiCalls extends ApiHelper {

    public static final String LIST_USERS = "/api/users?page=2";
    public static final String SINGLE_USER = "/api/users/2";
    public static final String SINGLE_USER_NOT_FOUND = "/api/users/23";
    public static final String LIST_RESOURCES = "/api/unknown";
    public static final String SINGLE_RESOURCE = "/api/unknown/2";
    public static final String SINGLE_RESOURCE_NOT_FOUND = "/api/unknown/23";
    public static final String CREATE_USER = "/api/users";
    public static final String UPDATE_USER = "/api/users/2";
    public static final String DELETE_USER = "/api/users/2";
    public static final String REGISTER_USER = "/api/register";
    public static final String LOGIN = "/api/login";
    public static final String DELAYED_USER_LIST = "/api/users?delay=3";

    public static Response getListOfUsers(String PATH){
        return givenConfig().when().get(PATH);
    }

    public static Response getSingleUserDetails(){
        return givenConfig().when().get(SINGLE_USER);
    }

    public static Response getSingleUserNotFound(){
        return givenConfig().when().get(SINGLE_USER_NOT_FOUND);
    }

    public static Response getListOfResources(){
        return givenConfig().when().get(LIST_RESOURCES);
    }

    public static Response getSingleResource(){
        return givenConfig().when().get(SINGLE_RESOURCE);
    }

    public static Response getSingleResourceNotFound(){
        return givenConfig().when().get(SINGLE_RESOURCE_NOT_FOUND);
    }

    public static Response createUser(List<UsersDetailsModel> usersDetailsModels, String PATH){
        UserDetailModel userData = UserDetailModel.builder().userDetails(usersDetailsModels).build();
        String payload = gson().toJson(userData);
        return getPostResponse(payload, PATH);
    }

    public static Response RegisterOrLoginUser(List<UserRegisterModel> userRegisterModels, String PATH){
        UserDetailModel userData = UserDetailModel.builder().userInfo(userRegisterModels).build();
        String payload = gson().toJson(userData);
        return getPostResponse(payload, PATH);
    }

    public static Response getPostResponse(String payload, String PATH){
        return givenConfig().
                body(payload).
                when().
                post(PATH);
    }

    public static Response updateUser(String requestType, List<UsersDetailsModel> usersDetailsModels, String PATH) {
        UserDetailModel userData = UserDetailModel.builder().userDetails(usersDetailsModels).build();
        String payload = gson().toJson(userData);
        Response response = null;
        if (requestType.equalsIgnoreCase("PUT")) {
            response = givenConfig().
                       body(payload).
                       when().
                       put(PATH);
        } else if (requestType.equalsIgnoreCase("PATCH")) {
            response = givenConfig().
                       body(payload).
                       when().
                       patch(PATH);
        } return response;
    }

    public static Response deleteUser(){
        return givenConfig().when().delete(DELETE_USER);
    }

    public static Response registerWithoutPswd(String email, String value){
        return givenConfig().formParam(email, value).post(REGISTER_USER);
    }
}
