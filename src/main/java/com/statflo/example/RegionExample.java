package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.RegionsApi;
import com.statflo.client.model.RegionPaginationResponse;
import com.statflo.client.model.RegionSummary;

public class RegionExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        RegionsApi regionsApi = new RegionsApi(apiClient);

        RegionPaginationResponse regionPaginationResponse = regionsApi.regionSearch("", "", 1, 10, "");
        for (RegionSummary item : regionPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
