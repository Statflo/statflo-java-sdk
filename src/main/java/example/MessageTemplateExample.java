package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.MessageTemplatesApi;
import io.swagger.client.model.MessageTemplatePaginationResponse;
import io.swagger.client.model.MessageTemplateSummary;

import java.util.ArrayList;

public class MessageTemplateExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        MessageTemplatesApi messageTemplatesApi = new MessageTemplatesApi(apiClient);

        MessageTemplatePaginationResponse messageTemplatePaginationResponse = messageTemplatesApi.messageTemplateSearch(new ArrayList<>(), "", 1, 10, "");
        for (MessageTemplateSummary item : messageTemplatePaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}