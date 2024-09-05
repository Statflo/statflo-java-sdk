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

import com.statflo.client.model.Location;
import com.statflo.client.model.LocationPaginationResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LocationsApi
 */
@Ignore
public class LocationsApiTest {

    private final LocationsApi api = new LocationsApi();

    /**
     * 
     *
     * Retrieve a location.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void locationGetTest() throws Exception {
        String id = null;
        Location response = api.locationGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve a location.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void locationGet_0Test() throws Exception {
        String id = null;
        Location response = api.locationGet_0(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search locations.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void locationSearchTest() throws Exception {
        String filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        LocationPaginationResponse response = api.locationSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search locations.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void locationSearch_0Test() throws Exception {
        String filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        LocationPaginationResponse response = api.locationSearch_0(filter, query, page, perPage, sort);

        // TODO: test validations
    }
}
