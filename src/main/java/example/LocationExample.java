package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.LocationsApi;
import io.swagger.client.model.LocationPaginationResponse;
import io.swagger.client.model.LocationSummary;

import java.util.ArrayList;
import java.util.List;

public class LocationExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        LocationsApi locationsApi = new LocationsApi(apiClient);
        List<String> filters = new ArrayList<>();

        LocationPaginationResponse locationPaginationResponse = locationsApi.locationSearch(filters, "", 1, 10, "");
        for (LocationSummary item : locationPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
