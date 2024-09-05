package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.CampaignsApi;
import com.statflo.client.model.CampaignPaginationResponse;
import com.statflo.client.model.CampaignSummary;

import java.util.HashMap;

public class CampaignExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignsApi campaignsApi = new CampaignsApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        CampaignPaginationResponse campaignPaginationResponse = campaignsApi.campaignSearch(filter, "", 1, 10, "");
        for (CampaignSummary campaignSummary : campaignPaginationResponse.getItems()) {
            System.out.println(campaignSummary);
        }
    }
}
