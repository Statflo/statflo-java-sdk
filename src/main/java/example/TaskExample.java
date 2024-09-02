package example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.TasksApi;
import io.swagger.client.model.TaskPaginationResponse;
import io.swagger.client.model.TaskSummary;

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
