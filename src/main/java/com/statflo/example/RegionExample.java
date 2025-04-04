package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.RegionsApi;
import com.statflo.client.model.Region;
import com.statflo.client.model.RegionPaginationResponse;

import java.util.HashMap;

public class RegionExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        RegionsApi regionsApi = new RegionsApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        RegionPaginationResponse regionPaginationResponse = regionsApi.regionSearch(filter, "", 1, 10, "");
        for (Region item : regionPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
