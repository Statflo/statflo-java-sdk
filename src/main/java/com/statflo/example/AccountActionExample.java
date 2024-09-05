package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.AccountActionsApi;
import com.statflo.client.model.AccountActionPaginationResponse;
import com.statflo.client.model.AccountActionSummary;

import java.util.HashMap;

public class AccountActionExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        AccountActionsApi accountActionsApi = new AccountActionsApi(apiClient);

        HashMap<String, String> filter = new HashMap<>();
        AccountActionPaginationResponse accountActionPaginationResponse = accountActionsApi.accountActionSearch(filter, "", 1, 10, "");
        for (AccountActionSummary item : accountActionPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
