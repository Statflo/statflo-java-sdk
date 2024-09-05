package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.DealersApi;
import com.statflo.client.model.DealerPaginationResponse;
import com.statflo.client.model.DealerSummary;

import java.util.HashMap;

public class DealerExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        DealersApi dealersApi = new DealersApi(apiClient);

        HashMap<String, String> filter = new HashMap<>();

        DealerPaginationResponse dealerPaginationResponse = dealersApi.dealerSearch(filter, "", 1, 10, "");
        for (DealerSummary item : dealerPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
