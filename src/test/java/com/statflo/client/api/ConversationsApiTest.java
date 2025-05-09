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

import com.statflo.client.model.Conversation;
import com.statflo.client.model.ConversationCreate;
import com.statflo.client.model.ConversationPaginationResponse;
import com.statflo.client.model.ConversationUpdate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ConversationsApi
 */
@Ignore
public class ConversationsApiTest {

    private final ConversationsApi api = new ConversationsApi();

    /**
     * 
     *
     * Create a conversation.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void conversationCreateTest() throws Exception {
        ConversationCreate body = null;
        Conversation response = api.conversationCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve a conversation.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void conversationGetTest() throws Exception {
        String id = null;
        Conversation response = api.conversationGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search conversations.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void conversationSearchTest() throws Exception {
        java.util.HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        ConversationPaginationResponse response = api.conversationSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a conversation.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void conversationUpdateTest() throws Exception {
        String id = null;
        ConversationUpdate body = null;
        Conversation response = api.conversationUpdate(id, body);

        // TODO: test validations
    }
}
