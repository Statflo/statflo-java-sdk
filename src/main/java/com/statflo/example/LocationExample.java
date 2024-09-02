package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.LocationsApi;
import com.statflo.client.model.LocationPaginationResponse;
import com.statflo.client.model.LocationSummary;

public class LocationExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        LocationsApi locationsApi = new LocationsApi(apiClient);

        LocationPaginationResponse locationPaginationResponse = locationsApi.locationSearch("", "", 1, 10, "");
        for (LocationSummary item : locationPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
