package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.ContactsApi;
import com.statflo.client.model.ContactPaginationResponse;
import com.statflo.client.model.ContactSummary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ContactExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        ContactsApi contactsApi = new ContactsApi(apiClient);
        HashMap<String, List<String>> filter = new HashMap<>();
        filter.put("accountId", Arrays.asList("7025536262779127", "5318665992402079"));

        ContactPaginationResponse contactPaginationResponse = contactsApi.contactSearch(filter, null, 1, 1, null);
        for (ContactSummary contact : contactPaginationResponse.getItems()) {
            System.out.println(contact);
        }


    }
}
