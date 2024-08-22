package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.DealersApi;
import io.swagger.client.model.DealerPaginationResponse;
import io.swagger.client.model.DealerSummary;

import java.util.ArrayList;
import java.util.List;

public class DealerExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        DealersApi dealersApi = new DealersApi(apiClient);
        List<String> filters = new ArrayList<>();

        DealerPaginationResponse dealerPaginationResponse = dealersApi.dealerSearch(filters, "", 1, 10, "");
        for (DealerSummary item : dealerPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
