package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.AccountsApi;
import io.swagger.client.model.AccountPaginationResponse;

public class AccountExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        String filter = "{\"accountId\": \"59298\"}";

        AccountsApi accountsApi = new AccountsApi(apiClient);
        AccountPaginationResponse accountPaginationResponse =
                accountsApi.accountSearch(filter, "", 1, 1, "");
        System.out.println(accountPaginationResponse.getItems());
    }
}
