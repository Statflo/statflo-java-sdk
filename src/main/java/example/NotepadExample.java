package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.NotepadsApi;
import io.swagger.client.model.NotepadPaginationResponse;
import io.swagger.client.model.NotepadSummary;

import java.util.ArrayList;

public class NotepadExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        NotepadsApi notepadsApi = new NotepadsApi(apiClient);

        NotepadPaginationResponse notepadPaginationResponse = notepadsApi.notepadSearch(new ArrayList<>(), "", 1, 10, "");
        for (NotepadSummary item : notepadPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}