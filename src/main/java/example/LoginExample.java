package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.AuthenticationApi;
import io.swagger.client.model.AuthLoginBody;
import io.swagger.client.model.InlineResponse200;

public class LoginExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        AuthenticationApi authenticationApi = new AuthenticationApi(apiClient);
        AuthLoginBody authLoginBody = new AuthLoginBody();
        authLoginBody.setUsername("test@test.com");
        authLoginBody.setPassword("test");

        InlineResponse200 login = authenticationApi.login(authLoginBody);
        System.out.println(login.getToken());
    }
}
