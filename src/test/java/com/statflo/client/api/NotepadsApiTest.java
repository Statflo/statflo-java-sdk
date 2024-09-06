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

import com.statflo.client.model.Notepad;
import com.statflo.client.model.NotepadCreate;
import com.statflo.client.model.NotepadPaginationResponse;
import com.statflo.client.model.NotepadUpdate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for NotepadsApi
 */
@Ignore
public class NotepadsApiTest {

    private final NotepadsApi api = new NotepadsApi();

    /**
     * 
     *
     * Retrieve a notepad.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void notepadGetTest() throws Exception {
        String id = null;
        Notepad response = api.notepadGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve the latest notepad for an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void notepadGetLatestTest() throws Exception {
        String accountId = null;
        Notepad response = api.notepadGetLatest(accountId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve the latest notepad for an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void notepadGetLatest_0Test() throws Exception {
        String accountId = null;
        Notepad response = api.notepadGetLatest_0(accountId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search notepads.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void notepadSearchTest() throws Exception {
        java.util.HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        NotepadPaginationResponse response = api.notepadSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create a notepad.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void notepadSearch_0Test() throws Exception {
        NotepadCreate body = null;
        Notepad response = api.notepadSearch_0(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create a notepad.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void notepadSearch_1Test() throws Exception {
        NotepadCreate body = null;
        Notepad response = api.notepadSearch_1(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a notepad.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void notepadUpdateTest() throws Exception {
        String id = null;
        NotepadUpdate body = null;
        Notepad response = api.notepadUpdate(id, body);

        // TODO: test validations
    }
}
