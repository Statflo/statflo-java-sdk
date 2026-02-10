# NotificationLogsApi

All URIs are relative to *https://app.test.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationLogCreate**](NotificationLogsApi.md#notificationLogCreate) | **POST** /v4/api/notification-log | 
[**notificationLogDelete**](NotificationLogsApi.md#notificationLogDelete) | **DELETE** /v4/api/notification-log/{id} | 
[**notificationLogGet**](NotificationLogsApi.md#notificationLogGet) | **GET** /v4/api/notification-log/{id} | 
[**notificationLogSearch**](NotificationLogsApi.md#notificationLogSearch) | **GET** /v4/api/notification-log | 

<a name="notificationLogCreate"></a>
# **notificationLogCreate**
> NotificationLog notificationLogCreate(body)



Create notification log.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotificationLogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationLogsApi apiInstance = new NotificationLogsApi();
NotificationLogCreate body = new NotificationLogCreate(); // NotificationLogCreate | 
try {
    NotificationLog result = apiInstance.notificationLogCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationLogsApi#notificationLogCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NotificationLogCreate**](NotificationLogCreate.md)|  | [optional]

### Return type

[**NotificationLog**](NotificationLog.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notificationLogDelete"></a>
# **notificationLogDelete**
> notificationLogDelete(id)



Remove notification log.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotificationLogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationLogsApi apiInstance = new NotificationLogsApi();
String id = "id_example"; // String | 
try {
    apiInstance.notificationLogDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationLogsApi#notificationLogDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationLogGet"></a>
# **notificationLogGet**
> NotificationLog notificationLogGet(id)



Retrieve notification log.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotificationLogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationLogsApi apiInstance = new NotificationLogsApi();
String id = "id_example"; // String | 
try {
    NotificationLog result = apiInstance.notificationLogGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationLogsApi#notificationLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**NotificationLog**](NotificationLog.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationLogSearch"></a>
# **notificationLogSearch**
> NotificationLogPaginationResponse notificationLogSearch(filter, query, page, perPage, sort)



Search notificationLogs.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotificationLogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationLogsApi apiInstance = new NotificationLogsApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    NotificationLogPaginationResponse result = apiInstance.notificationLogSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationLogsApi#notificationLogSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**java.util.HashMap**](.md)|  | [optional]
 **query** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**NotificationLogPaginationResponse**](NotificationLogPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

