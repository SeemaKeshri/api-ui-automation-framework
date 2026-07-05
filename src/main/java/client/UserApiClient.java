package client;

import constants.Endpoints;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.UserRequest;

public class UserApiClient {

    private final RequestSpecification request;

    public UserApiClient(RequestSpecification request) {
        this.request = request;
    }

    /**
     * Create User
     */
    public Response createUser(UserRequest userRequest) {

        return request
                .body(userRequest)
                .post(Endpoints.USERS);
    }

    /**
     * Get User
     */
    public Response getUser(int id) {

        return request
                .pathParam("id", id)
                .get(Endpoints.SINGLE_USER);
    }

    /**
     * Update User
     */
    public Response updateUser(int id, UserRequest userRequest) {

        return request
                .pathParam("id", id)
                .body(userRequest)
                .put(Endpoints.SINGLE_USER);
    }

    /**
     * Delete User
     */
    public Response deleteUser(int id) {

        return request
                .pathParam("id", id)
                .delete(Endpoints.SINGLE_USER);
    }
}