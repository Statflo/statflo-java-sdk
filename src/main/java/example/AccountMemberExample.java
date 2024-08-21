package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.AccountMembersApi;
import io.swagger.client.model.AccountMember;
import io.swagger.client.model.AccountMemberPaginationResponse;
import io.swagger.client.model.AccountMemberSummary;

import java.util.ArrayList;

public class AccountMemberExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        AccountMembersApi accountMembersApi = new AccountMembersApi(apiClient);

        AccountMemberPaginationResponse accountMemberPaginationResponse = accountMembersApi.accountMemberSearch(new ArrayList<>(), "", 1, 10, "");
        for (AccountMemberSummary item : accountMemberPaginationResponse.getItems()) {
            System.out.println(item);

            AccountMember accountMember = accountMembersApi.accountMemberGet(String.valueOf(item.getId()));
            System.out.println(accountMember);
        }


    }
}
