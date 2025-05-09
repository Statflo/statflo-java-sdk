package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.LocationsApi;
import com.statflo.client.model.Location;
import com.statflo.client.model.LocationPaginationResponse;

import java.util.HashMap;

public class LocationExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        LocationsApi locationsApi = new LocationsApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        LocationPaginationResponse locationPaginationResponse = locationsApi.locationSearch(filter, "", 1, 10, "");
        for (Location item : locationPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
