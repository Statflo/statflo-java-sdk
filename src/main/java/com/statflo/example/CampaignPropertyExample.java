package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.CampaignPropertiesApi;
import com.statflo.client.model.CampaignPropertyPaginationResponse;
import com.statflo.client.model.CampaignPropertySummary;

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
