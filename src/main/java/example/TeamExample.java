package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.TeamsApi;
import io.swagger.client.model.Team;
import io.swagger.client.model.TeamPaginationResponse;
import io.swagger.client.model.TeamSummary;

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
