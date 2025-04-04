package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.CampaignPropertiesApi;
import com.statflo.client.model.CampaignProperty;
import com.statflo.client.model.CampaignPropertyPaginationResponse;

import java.util.HashMap;

public class CampaignPropertyExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignPropertiesApi campaignPropertiesApi = new CampaignPropertiesApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        CampaignPropertyPaginationResponse campaignPropertyPaginationResponse = campaignPropertiesApi.campaignPropertySearch(filter, "", 1, 1, "");
        for (CampaignProperty item : campaignPropertyPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
