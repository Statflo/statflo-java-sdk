package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.CampaignMetadataApi;
import com.statflo.client.model.CampaignMetadata;
import com.statflo.client.model.CampaignMetadataPaginationResponse;
import com.statflo.client.model.CampaignMetadataSummary;

public class CampaignMetaExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignMetadataApi campaignMetadataApi = new CampaignMetadataApi(apiClient);

        CampaignMetadataPaginationResponse campaignMetadataPaginationResponse = campaignMetadataApi.campaignMetadataSearch("", "", 1, 1, "");
        for (CampaignMetadataSummary item : campaignMetadataPaginationResponse.getItems()) {
            System.out.println(item);
        }

        CampaignMetadata campaignMetadata = campaignMetadataApi.campaignMetadataGet("19892");
        System.out.println(campaignMetadata);
    }
}
