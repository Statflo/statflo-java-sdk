package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.DealersApi;
import io.swagger.client.model.DealerPaginationResponse;
import io.swagger.client.model.DealerSummary;

public class DealerExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        DealersApi dealersApi = new DealersApi(apiClient);

        DealerPaginationResponse dealerPaginationResponse = dealersApi.dealerSearch("", "", 1, 10, "");
        for (DealerSummary item : dealerPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
