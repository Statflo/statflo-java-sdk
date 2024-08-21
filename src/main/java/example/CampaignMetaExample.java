package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaignMetadataApi;
import io.swagger.client.model.CampaignMetadata;
import io.swagger.client.model.CampaignMetadataPaginationResponse;
import io.swagger.client.model.CampaignMetadataSummary;

import java.util.ArrayList;

public class CampaignMetaExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignMetadataApi campaignMetadataApi = new CampaignMetadataApi(apiClient);

        CampaignMetadataPaginationResponse campaignMetadataPaginationResponse = campaignMetadataApi.campaignMetadataSearch(new ArrayList<>(), "", 1, 1, "");
        for (CampaignMetadataSummary item : campaignMetadataPaginationResponse.getItems()) {
            System.out.println(item);
        }

        CampaignMetadata campaignMetadata = campaignMetadataApi.campaignMetadataGet("19892");
        System.out.println(campaignMetadata);
    }
}