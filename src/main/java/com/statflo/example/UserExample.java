package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.UsersApi;
import com.statflo.client.model.User;
import com.statflo.client.model.UserPaginationResponse;

import java.util.HashMap;

public class UserExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        UsersApi usersApi = new UsersApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        UserPaginationResponse userPaginationResponse = usersApi.userSearch(filter, "", 1, 10, "");
        for (User item : userPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
