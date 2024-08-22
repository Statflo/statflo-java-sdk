package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaignsApi;
import io.swagger.client.model.CampaignPaginationResponse;
import io.swagger.client.model.CampaignSummary;

import java.util.ArrayList;
import java.util.List;

public class CampaignExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignsApi campaignsApi = new CampaignsApi(apiClient);

        List<String> filters = new ArrayList<>();
        CampaignPaginationResponse campaignPaginationResponse = campaignsApi.campaignSearch(filters, "", 1, 10, "");
        for (CampaignSummary campaignSummary : campaignPaginationResponse.getItems()) {
            System.out.println(campaignSummary);
        }
    }
}
