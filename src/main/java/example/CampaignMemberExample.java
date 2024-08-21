package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaignMemberApi;
import io.swagger.client.model.CampaignMemberPaginationResponse;
import io.swagger.client.model.CampaignMemberSummary;

import java.util.ArrayList;

public class CampaignMemberExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignMemberApi campaignMemberApi = new CampaignMemberApi(apiClient);
        CampaignMemberPaginationResponse campaignMemberPaginationResponse = campaignMemberApi.campaignMemberSearch(new ArrayList<>(), "", 1, 10, "");
        for (CampaignMemberSummary campaignMember : campaignMemberPaginationResponse.getItems()) {
            System.out.println(campaignMember);
        }
    }
}
