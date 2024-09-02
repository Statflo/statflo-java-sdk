package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.UsersApi;
import com.statflo.client.model.UserPaginationResponse;
import com.statflo.client.model.UserSummary;

public class UserExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        UsersApi usersApi = new UsersApi(apiClient);

        UserPaginationResponse userPaginationResponse = usersApi.userSearch("", "", 1, 10, "");
        for (UserSummary item : userPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
