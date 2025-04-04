package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.CampaignMemberApi;
import com.statflo.client.model.CampaignMember;
import com.statflo.client.model.CampaignMemberPaginationResponse;

import java.util.HashMap;

public class CampaignMemberExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignMemberApi campaignMemberApi = new CampaignMemberApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        CampaignMemberPaginationResponse campaignMemberPaginationResponse = campaignMemberApi.campaignMemberSearch(filter, "", 1, 10, "");
        for (CampaignMember campaignMember : campaignMemberPaginationResponse.getItems()) {
            System.out.println(campaignMember);
        }
    }
}
