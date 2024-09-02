package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.MessageTemplateAssignmentsApi;
import io.swagger.client.model.MessageTemplateAssignmentPaginationResponse;
import io.swagger.client.model.MessageTemplateAssignmentSummary;

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
