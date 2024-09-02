package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.DealersApi;
import com.statflo.client.model.DealerPaginationResponse;
import com.statflo.client.model.DealerSummary;

public class DealerExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        DealersApi dealersApi = new DealersApi(apiClient);

        DealerPaginationResponse dealerPaginationResponse = dealersApi.dealerSearch("", "", 1, 10, "");
        for (DealerSummary item : dealerPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
