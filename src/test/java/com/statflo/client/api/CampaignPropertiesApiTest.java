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

import com.statflo.client.model.CampaignProperty;
import com.statflo.client.model.CampaignPropertyPaginationResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CampaignPropertiesApi
 */
@Ignore
public class CampaignPropertiesApiTest {

    private final CampaignPropertiesApi api = new CampaignPropertiesApi();

    /**
     * 
     *
     * Create a campaign property.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void campaignPropertyCreateTest() throws Exception {
        CampaignProperty body = null;
        CampaignProperty response = api.campaignPropertyCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove a campaign property.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void campaignPropertyDeleteTest() throws Exception {
        String id = null;
        api.campaignPropertyDelete(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve a campaign property.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void campaignPropertyGetTest() throws Exception {
        String id = null;
        CampaignProperty response = api.campaignPropertyGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search campaign properties.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void campaignPropertySearchTest() throws Exception {
        String filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        CampaignPropertyPaginationResponse response = api.campaignPropertySearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a campaign property.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void campaignPropertyUpdateTest() throws Exception {
        String id = null;
        CampaignProperty body = null;
        CampaignProperty response = api.campaignPropertyUpdate(id, body);

        // TODO: test validations
    }
}
