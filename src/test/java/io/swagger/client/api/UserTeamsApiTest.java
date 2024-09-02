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

import io.swagger.client.model.UserTeam;
import io.swagger.client.model.UserTeamCreate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserTeamsApi
 */
@Ignore
public class UserTeamsApiTest {

    private final UserTeamsApi api = new UserTeamsApi();

    /**
     * 
     *
     * Assign user to a team.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userTeamCreateTest() throws Exception {
        UserTeamCreate body = null;
        UserTeam response = api.userTeamCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove user from team.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userTeamDeleteTest() throws Exception {
        String team = null;
        String user = null;
        api.userTeamDelete(team, user);

        // TODO: test validations
    }
}
