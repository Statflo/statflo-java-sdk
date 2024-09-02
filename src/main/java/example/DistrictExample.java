package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.DistrictsApi;
import io.swagger.client.model.DistrictPaginationResponse;
import io.swagger.client.model.DistrictSummary;

import java.util.ArrayList;
import java.util.List;

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
