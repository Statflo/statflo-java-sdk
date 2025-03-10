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

import com.statflo.client.model.UserExternalId;
import com.statflo.client.model.UserExternalIdCreate;
import com.statflo.client.model.UserExternalIdPaginationResponse;
import com.statflo.client.model.UserExternalIdUpdate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserExternalIdApi
 */
@Ignore
public class UserExternalIdApiTest {

    private final UserExternalIdApi api = new UserExternalIdApi();

    /**
     * 
     *
     * Search user external ids.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userExternalIdTest() throws Exception {
        java.util.HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        UserExternalIdPaginationResponse response = api.userExternalId(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create a user external id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userExternalIdCreateTest() throws Exception {
        UserExternalIdCreate body = null;
        UserExternalId response = api.userExternalIdCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove a user external id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userExternalIdDeleteTest() throws Exception {
        String id = null;
        api.userExternalIdDelete(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve a user external id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userExternalIdGetTest() throws Exception {
        String id = null;
        UserExternalId response = api.userExternalIdGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a user external id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userExternalIdUpdateTest() throws Exception {
        String id = null;
        UserExternalIdUpdate body = null;
        UserExternalId response = api.userExternalIdUpdate(id, body);

        // TODO: test validations
    }
}
