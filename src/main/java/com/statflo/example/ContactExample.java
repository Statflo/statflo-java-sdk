package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.ContactsApi;
import com.statflo.client.model.Contact;
import com.statflo.client.model.ContactPaginationResponse;

import java.util.HashMap;

public class ContactExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        ContactsApi contactsApi = new ContactsApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        ContactPaginationResponse contactPaginationResponse = contactsApi.contactSearch(filter, "", 1, 1, "");
        for (Contact contact : contactPaginationResponse.getItems()) {
            System.out.println(contact);
        }


    }
}
