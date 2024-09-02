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

import com.statflo.client.model.User;
import com.statflo.client.model.UserPaginationResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * 
     *
     * Retrieve an user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetTest() throws Exception {
        String id = null;
        User response = api.userGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search users.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSearchTest() throws Exception {
        String filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        UserPaginationResponse response = api.userSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
}