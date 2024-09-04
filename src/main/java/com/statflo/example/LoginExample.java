package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.AuthenticationApi;
import com.statflo.client.model.AuthLoginBody;
import com.statflo.client.model.InlineResponse200;

public class LoginExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        AuthenticationApi authenticationApi = new AuthenticationApi(apiClient);
        AuthLoginBody authLoginBody = new AuthLoginBody();
        authLoginBody.setUsername("yadi.tang@statflo.com");
        authLoginBody.setPassword("T830412t!");

        InlineResponse200 login = authenticationApi.login(authLoginBody);
        System.out.println(login.getToken());
    }
}
