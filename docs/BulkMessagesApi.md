# BulkMessagesApi

All URIs are relative to *https://app.test.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkMessageCreate**](BulkMessagesApi.md#bulkMessageCreate) | **POST** /v4/api/bulk-message | 
[**bulkMessageGet**](BulkMessagesApi.md#bulkMessageGet) | **GET** /v4/api/bulk-message/{id} | 
[**bulkMessageSearch**](BulkMessagesApi.md#bulkMessageSearch) | **GET** /v4/api/bulk-message | 
[**bulkMessageUpdate**](BulkMessagesApi.md#bulkMessageUpdate) | **PUT** /v4/api/bulk-message/{id} | 

<a name="bulkMessageCreate"></a>
# **bulkMessageCreate**
> BulkMessage bulkMessageCreate(body)



Create a Bulk Message.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.BulkMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


BulkMessagesApi apiInstance = new BulkMessagesApi();
BulkMessageCreate body = new BulkMessageCreate(); // BulkMessageCreate | 
try {
    BulkMessage result = apiInstance.bulkMessageCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkMessagesApi#bulkMessageCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkMessageCreate**](BulkMessageCreate.md)|  | [optional]

### Return type

[**BulkMessage**](BulkMessage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bulkMessageGet"></a>
# **bulkMessageGet**
> BulkMessage bulkMessageGet(id)



Retrieve a Bulk Message.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.BulkMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


BulkMessagesApi apiInstance = new BulkMessagesApi();
String id = "id_example"; // String | 
try {
    BulkMessage result = apiInstance.bulkMessageGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkMessagesApi#bulkMessageGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**BulkMessage**](BulkMessage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bulkMessageSearch"></a>
# **bulkMessageSearch**
> BulkMessagePaginationResponse bulkMessageSearch(filter, query, page, perPage, sort)



Search bulkMessages.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.BulkMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


BulkMessagesApi apiInstance = new BulkMessagesApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    BulkMessagePaginationResponse result = apiInstance.bulkMessageSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkMessagesApi#bulkMessageSearch");
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

[**BulkMessagePaginationResponse**](BulkMessagePaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bulkMessageUpdate"></a>
# **bulkMessageUpdate**
> BulkMessage bulkMessageUpdate(id, body)



Update a Bulk Message.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.BulkMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


BulkMessagesApi apiInstance = new BulkMessagesApi();
String id = "id_example"; // String | 
BulkMessageUpdate body = new BulkMessageUpdate(); // BulkMessageUpdate | 
try {
    BulkMessage result = apiInstance.bulkMessageUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkMessagesApi#bulkMessageUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**BulkMessageUpdate**](BulkMessageUpdate.md)|  | [optional]

### Return type

[**BulkMessage**](BulkMessage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

