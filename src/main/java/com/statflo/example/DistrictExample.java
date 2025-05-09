package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.DistrictsApi;
import com.statflo.client.model.District;
import com.statflo.client.model.DistrictPaginationResponse;

import java.util.HashMap;

public class DistrictExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        DistrictsApi districtsApi = new DistrictsApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        DistrictPaginationResponse districtPaginationResponse = districtsApi.districtSearch(filter, "", 1, 10, "");
        for (District item : districtPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
