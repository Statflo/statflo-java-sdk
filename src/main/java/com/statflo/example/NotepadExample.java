package com.statflo.example;

import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.NotepadsApi;
import com.statflo.client.model.NotepadPaginationResponse;
import com.statflo.client.model.NotepadSummary;

import java.util.HashMap;

public class NotepadExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        NotepadsApi notepadsApi = new NotepadsApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        NotepadPaginationResponse notepadPaginationResponse = notepadsApi.notepadSearch(filter, "", 1, 10, "");
        for (NotepadSummary item : notepadPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
