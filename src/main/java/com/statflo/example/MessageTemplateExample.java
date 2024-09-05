package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.MessageTemplatesApi;
import com.statflo.client.model.MessageTemplatePaginationResponse;
import com.statflo.client.model.MessageTemplateSummary;

import java.util.HashMap;

public class MessageTemplateExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        MessageTemplatesApi messageTemplatesApi = new MessageTemplatesApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        MessageTemplatePaginationResponse messageTemplatePaginationResponse = messageTemplatesApi.messageTemplateSearch(filter, "", 1, 10, "");
        for (MessageTemplateSummary item : messageTemplatePaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
