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

import com.statflo.client.model.Account;
import com.statflo.client.model.AccountCreate;
import com.statflo.client.model.AccountPaginationResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountsApi
 */
@Ignore
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    /**
     * 
     *
     * Create an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountCreateTest() throws Exception {
        AccountCreate body = null;
        Account response = api.accountCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountDeleteTest() throws Exception {
        String id = null;
        api.accountDelete(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountGetTest() throws Exception {
        String id = null;
        Account response = api.accountGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search accounts.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountSearchTest() throws Exception {
        java.util.HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        AccountPaginationResponse response = api.accountSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountUpdateTest() throws Exception {
        String id = null;
        Account body = null;
        Account response = api.accountUpdate(id, body);

        // TODO: test validations
    }
}
