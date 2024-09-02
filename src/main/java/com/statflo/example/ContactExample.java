package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.ContactsApi;
import com.statflo.client.model.ContactPaginationResponse;
import com.statflo.client.model.ContactSummary;

public class ContactExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        ContactsApi contactsApi = new ContactsApi(apiClient);

        ContactPaginationResponse contactPaginationResponse = contactsApi.contactSearch("", "", 1, 1, "");
        for (ContactSummary contact : contactPaginationResponse.getItems()) {
            System.out.println(contact);
        }
    }
}
