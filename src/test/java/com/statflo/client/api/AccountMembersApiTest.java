/*
 * Statflo API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.statflo.client.api;

import com.statflo.client.model.AccountMember;
import com.statflo.client.model.AccountMemberCreate;
import com.statflo.client.model.AccountMemberPaginationResponse;
import com.statflo.client.model.AccountMemberUpdate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountMembersApi
 */
@Ignore
public class AccountMembersApiTest {

    private final AccountMembersApi api = new AccountMembersApi();

    /**
     * 
     *
     * Create an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountMemberCreateTest() throws Exception {
        AccountMemberCreate body = null;
        AccountMember response = api.accountMemberCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove an account member.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountMemberDeleteTest() throws Exception {
        String id = null;
        api.accountMemberDelete(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve an account member.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountMemberGetTest() throws Exception {
        String id = null;
        AccountMember response = api.accountMemberGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search account members.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountMemberSearchTest() throws Exception {
        java.util.HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        AccountMemberPaginationResponse response = api.accountMemberSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update an account member.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountMemberUpdateTest() throws Exception {
        String id = null;
        AccountMemberUpdate body = null;
        AccountMember response = api.accountMemberUpdate(id, body);

        // TODO: test validations
    }
}
