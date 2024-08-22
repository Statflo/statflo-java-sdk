package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CampaignMemberApi;
import io.swagger.client.model.CampaignMemberPaginationResponse;
import io.swagger.client.model.CampaignMemberSummary;

import java.util.ArrayList;
import java.util.List;

public class CampaignMemberExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignMemberApi campaignMemberApi = new CampaignMemberApi(apiClient);

        List<String> filters = new ArrayList<>();
        CampaignMemberPaginationResponse campaignMemberPaginationResponse = campaignMemberApi.campaignMemberSearch(filters, "", 1, 10, "");
        for (CampaignMemberSummary campaignMember : campaignMemberPaginationResponse.getItems()) {
            System.out.println(campaignMember);
        }
    }
}
