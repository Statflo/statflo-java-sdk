package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.DistrictsApi;
import com.statflo.client.model.DistrictPaginationResponse;
import com.statflo.client.model.DistrictSummary;

public class DistrictExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        DistrictsApi districtsApi = new DistrictsApi(apiClient);

        DistrictPaginationResponse districtPaginationResponse = districtsApi.districtSearch("", "", 1, 10, "");
        for (DistrictSummary item : districtPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
