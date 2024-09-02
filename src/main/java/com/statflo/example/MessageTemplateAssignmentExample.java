package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.MessageTemplateAssignmentsApi;
import com.statflo.client.model.MessageTemplateAssignmentPaginationResponse;
import com.statflo.client.model.MessageTemplateAssignmentSummary;

public class MessageTemplateAssignmentExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        MessageTemplateAssignmentsApi messageTemplateAssignmentsApi = new MessageTemplateAssignmentsApi(apiClient);

        MessageTemplateAssignmentPaginationResponse messageTemplateAssignmentPaginationResponse = messageTemplateAssignmentsApi.messageTemplateAssignmentSearch("", "", 1, 10, "");
        for (MessageTemplateAssignmentSummary item : messageTemplateAssignmentPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}