package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.TasksApi;
import com.statflo.client.model.Task;
import com.statflo.client.model.TaskPaginationResponse;

import java.util.HashMap;

public class TaskExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        TasksApi tasksApi = new TasksApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        TaskPaginationResponse taskPaginationResponse = tasksApi.taskSearch(filter, "", 1, 10, "");
        for (Task item : taskPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}
