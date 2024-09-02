package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.CampaignMemberApi;
import com.statflo.client.model.CampaignMemberPaginationResponse;
import com.statflo.client.model.CampaignMemberSummary;

public class CampaignMemberExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignMemberApi campaignMemberApi = new CampaignMemberApi(apiClient);

        CampaignMemberPaginationResponse campaignMemberPaginationResponse = campaignMemberApi.campaignMemberSearch("", "", 1, 10, "");
        for (CampaignMemberSummary campaignMember : campaignMemberPaginationResponse.getItems()) {
            System.out.println(campaignMember);
        }
    }
}
