package com.statflo.example;


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.TasksApi;
import com.statflo.client.model.TaskPaginationResponse;
import com.statflo.client.model.TaskSummary;

public class TaskExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        TasksApi tasksApi = new TasksApi(apiClient);

        TaskPaginationResponse taskPaginationResponse = tasksApi.taskSearch("", "", 1, 10, "");
        for (TaskSummary item : taskPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}