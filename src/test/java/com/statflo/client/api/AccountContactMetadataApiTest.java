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

import com.statflo.client.model.AccountContactMetadata;
import com.statflo.client.model.AccountContactMetadataCreate;
import com.statflo.client.model.AccountContactMetadataPaginationResponse;
import com.statflo.client.model.AccountContactMetadataUpdate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountContactMetadataApi
 */
@Ignore
public class AccountContactMetadataApiTest {

    private final AccountContactMetadataApi api = new AccountContactMetadataApi();

    /**
     * 
     *
     * Search account contact metadata.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountContactMetadataTest() throws Exception {
        java.util.HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        AccountContactMetadataPaginationResponse response = api.accountContactMetadata(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create a account contact metadata.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountContactMetadataCreateTest() throws Exception {
        AccountContactMetadataCreate body = null;
        AccountContactMetadata response = api.accountContactMetadataCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove a account contact metadata.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountContactMetadataDeleteTest() throws Exception {
        String id = null;
        api.accountContactMetadataDelete(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve a account contact metadata.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountContactMetadataGetTest() throws Exception {
        String id = null;
        AccountContactMetadata response = api.accountContactMetadataGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a account contact metadata.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountContactMetadataUpdateTest() throws Exception {
        String id = null;
        AccountContactMetadataUpdate body = null;
        AccountContactMetadata response = api.accountContactMetadataUpdate(id, body);

        // TODO: test validations
    }
}
