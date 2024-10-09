package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.TeamsApi;
import com.statflo.client.model.TeamPaginationResponse;
import com.statflo.client.model.TeamSummary;

import java.util.HashMap;

public class TeamExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        TeamsApi teamsApi = new TeamsApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        TeamPaginationResponse teamPaginationResponse = teamsApi.teamSearch(filter, "", 1, 10, "");
        for (TeamSummary item : teamPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
