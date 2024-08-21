package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.AccountActionsApi;
import io.swagger.client.model.AccountActionPaginationResponse;
import io.swagger.client.model.AccountActionSummary;

import java.util.ArrayList;

public class AccountActionExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        AccountActionsApi accountActionsApi = new AccountActionsApi(apiClient);

        AccountActionPaginationResponse accountActionPaginationResponse = accountActionsApi.accountActionSearch(new ArrayList<>(), "", 1, 10, "");
        for (AccountActionSummary item : accountActionPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
