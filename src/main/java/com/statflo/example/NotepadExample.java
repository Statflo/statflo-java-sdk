package com.statflo.example;

import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.NotepadsApi;
import com.statflo.client.model.NotepadPaginationResponse;
import com.statflo.client.model.NotepadSummary;

public class NotepadExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        NotepadsApi notepadsApi = new NotepadsApi(apiClient);

        NotepadPaginationResponse notepadPaginationResponse = notepadsApi.notepadSearch("", "", 1, 10, "");
        for (NotepadSummary item : notepadPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
