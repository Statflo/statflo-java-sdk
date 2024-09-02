package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.TeamsApi;
import com.statflo.client.model.Team;
import com.statflo.client.model.TeamPaginationResponse;
import com.statflo.client.model.TeamSummary;

public class TeamExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        TeamsApi teamsApi = new TeamsApi(apiClient);

        TeamPaginationResponse teamPaginationResponse = teamsApi.teamSearch("", "", 1, 10, "");
        for (TeamSummary item : teamPaginationResponse.getItems()) {
            System.out.println(item);
        }

        Team team = teamsApi.teamGet("808728");
        System.out.println(team);
    }
}
