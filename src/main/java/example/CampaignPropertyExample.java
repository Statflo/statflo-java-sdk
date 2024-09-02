package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaignPropertiesApi;
import io.swagger.client.model.CampaignPropertyPaginationResponse;
import io.swagger.client.model.CampaignPropertySummary;

import java.util.ArrayList;
import java.util.List;

public class CampaignPropertyExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignPropertiesApi campaignPropertiesApi = new CampaignPropertiesApi(apiClient);

        CampaignPropertyPaginationResponse campaignPropertyPaginationResponse = campaignPropertiesApi.campaignPropertySearch("", "", 1, 1, "");
        for (CampaignPropertySummary item : campaignPropertyPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
