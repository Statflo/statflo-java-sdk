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

package io.swagger.client.api;

import io.swagger.client.model.Campaign;
import io.swagger.client.model.CampaignCreate;
import io.swagger.client.model.CampaignPaginationResponse;
import io.swagger.client.model.CampaignUpdate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CampaignsApi
 */
@Ignore
public class CampaignsApiTest {

    private final CampaignsApi api = new CampaignsApi();

    /**
     * 
     *
     * Create a campaign.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void campaignCreateTest() throws Exception {
        CampaignCreate body = null;
        Campaign response = api.campaignCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove a campaign.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void campaignDeleteTest() throws Exception {
        String id = null;
        api.campaignDelete(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve a campaign
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void campaignGetTest() throws Exception {
        String id = null;
        Campaign response = api.campaignGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search campaigns.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void campaignSearchTest() throws Exception {
        List<String> filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        CampaignPaginationResponse response = api.campaignSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a campaign.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void campaignUpdateTest() throws Exception {
        String id = null;
        CampaignUpdate body = null;
        Campaign response = api.campaignUpdate(id, body);

        // TODO: test validations
    }
}
