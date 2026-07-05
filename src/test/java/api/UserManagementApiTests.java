package api;

import io.restassured.response.Response;
import models.UserRequest;
import models.UserResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserManagementApiTests extends BaseTest {

    @Test(priority = 1)
    public void testCreateUser() {

        UserRequest request = new UserRequest("Seema", "SDET");

        Response response = userApiClient.createUser(request);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 201);

        UserResponse userResponse = response.as(UserResponse.class);

        Assert.assertEquals(userResponse.getName(), "Seema");
        Assert.assertEquals(userResponse.getJob(), "SDET");

        Assert.assertNotNull(userResponse.getId());
        Assert.assertNotNull(userResponse.getCreatedAt());

    }

    @Test(priority = 2)
    public void testGetUser() {

        Response response = userApiClient.getUser(2);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 200);

        Assert.assertEquals(
                response.jsonPath().getString("data.first_name"),
                "Janet");

        Assert.assertEquals(
                response.jsonPath().getString("data.last_name"),
                "Weaver");

    }

    @Test(priority = 3)
    public void testUpdateUser() {

        UserRequest request = new UserRequest("Seema", "Senior SDET");

        Response response = userApiClient.updateUser(2, request);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 200);

        UserResponse userResponse = response.as(UserResponse.class);

        Assert.assertEquals(userResponse.getName(), "Seema");
        Assert.assertEquals(userResponse.getJob(), "Senior SDET");

        Assert.assertNotNull(userResponse.getUpdatedAt());

    }

    @Test(priority = 4)
    public void testDeleteUser() {

        Response response = userApiClient.deleteUser(2);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 204);

    }

}