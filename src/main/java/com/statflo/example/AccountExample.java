package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.AccountsApi;
import com.statflo.client.model.AccountPaginationResponse;

import java.util.HashMap;

public class AccountExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        try {
            HashMap<String, String> filter = new HashMap<>();
            filter.put("accountId", "6075");

            AccountsApi accountsApi = new AccountsApi(apiClient);
            AccountPaginationResponse response = accountsApi.accountSearch(filter, "", 1, 1, "");
//            System.out.println(response.getItems());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
