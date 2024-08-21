package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.RegionsApi;
import io.swagger.client.model.RegionPaginationResponse;
import io.swagger.client.model.RegionSummary;

import java.util.ArrayList;

public class RegionExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        RegionsApi regionsApi = new RegionsApi(apiClient);

        RegionPaginationResponse regionPaginationResponse = regionsApi.regionSearch(new ArrayList<>(), "", 1, 10, "");
        for (RegionSummary item : regionPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
