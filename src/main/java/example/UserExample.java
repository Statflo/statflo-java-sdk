package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.UsersApi;
import io.swagger.client.model.UserPaginationResponse;
import io.swagger.client.model.UserSummary;

import java.util.ArrayList;

public class UserExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        UsersApi usersApi = new UsersApi(apiClient);

        UserPaginationResponse userPaginationResponse = usersApi.userSearch(new ArrayList<>(), "", 1, 10, "");
        for (UserSummary item : userPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
