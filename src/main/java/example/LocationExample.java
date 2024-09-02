package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.LocationsApi;
import io.swagger.client.model.LocationPaginationResponse;
import io.swagger.client.model.LocationSummary;

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
