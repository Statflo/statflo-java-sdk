package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ContactsApi;
import io.swagger.client.model.ContactPaginationResponse;
import io.swagger.client.model.ContactSummary;

import java.util.ArrayList;
import java.util.List;

public class ContactExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        ContactsApi contactsApi = new ContactsApi(apiClient);
        List<String> filters = new ArrayList<>();

        ContactPaginationResponse contactPaginationResponse = contactsApi.contactSearch(filters, "", 1, 1, "");
        for (ContactSummary contact : contactPaginationResponse.getItems()) {
            System.out.println(contact);
        }
    }
}
