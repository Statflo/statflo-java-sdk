/*
 * Statflo API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4.1.138
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.statflo.client.api;

import com.statflo.client.model.BulkSubRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BulkRequestsApi
 */
@Ignore
public class BulkRequestsApiTest {

    private final BulkRequestsApi api = new BulkRequestsApi();

    /**
     * 
     *
     * Submit multiple requests in bulk.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void bulkRequestTest() throws Exception {
        List<BulkSubRequest> body = null;
        List<Object> response = api.bulkRequest(body);

        // TODO: test validations
    }
}
