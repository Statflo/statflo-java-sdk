package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.AccountMembersApi;
import com.statflo.client.model.AccountMember;
import com.statflo.client.model.AccountMemberPaginationResponse;
import com.statflo.client.model.AccountMemberSummary;

public class AccountMemberExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        AccountMembersApi accountMembersApi = new AccountMembersApi(apiClient);

        AccountMemberPaginationResponse accountMemberPaginationResponse = accountMembersApi.accountMemberSearch("", "", 1, 10, "");
        for (AccountMemberSummary item : accountMemberPaginationResponse.getItems()) {
            System.out.println(item);

            AccountMember accountMember = accountMembersApi.accountMemberGet(String.valueOf(item.getId()));
            System.out.println(accountMember);
        }


    }
}
