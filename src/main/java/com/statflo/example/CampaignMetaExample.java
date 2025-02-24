package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.AccountsApi;
import com.statflo.client.api.CampaignMetadataApi;
import com.statflo.client.api.VendorMessagesApi;
import com.statflo.client.model.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CampaignMetaExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        VendorMessagesApi accountsApi = new VendorMessagesApi(apiClient);
        VendorMessageCreate vendorMessageCreate = new VendorMessageCreate();
        vendorMessageCreate.setAction("accepted/relay.ok");

        List<String> dataList = Arrays.asList("2222", "333", "444");

//        TextMessagePayload arrayPayload = new TextMessagePayload(dataList);
        vendorMessageCreate.setPayload("dasdasdd");
        accountsApi.vendorMessageCreate(vendorMessageCreate);
    }
}
