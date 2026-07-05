package api;

import base.ApiBase;
import client.UserApiClient;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends ApiBase {

    protected UserApiClient userApiClient;

    @BeforeMethod
    public void setUp() {

        setup();

        userApiClient = new UserApiClient(request);
    }
}