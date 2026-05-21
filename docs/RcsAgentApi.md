# RcsAgentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rcsAgentCreate**](RcsAgentApi.md#rcsAgentCreate) | **POST** /v4/api/rcs-agent | 
[**rcsAgentDelete**](RcsAgentApi.md#rcsAgentDelete) | **DELETE** /v4/api/rcs-agent/{id} | 
[**rcsAgentGet**](RcsAgentApi.md#rcsAgentGet) | **GET** /v4/api/rcs-agent/{id} | 
[**rcsAgentSearch**](RcsAgentApi.md#rcsAgentSearch) | **GET** /v4/api/rcs-agent | 
[**rcsAgentUpdate**](RcsAgentApi.md#rcsAgentUpdate) | **PUT** /v4/api/rcs-agent/{id} | 

<a name="rcsAgentCreate"></a>
# **rcsAgentCreate**
> RcsAgent rcsAgentCreate(body)



Create an rcs agent.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentApi apiInstance = new RcsAgentApi();
RcsAgentCreate body = new RcsAgentCreate(); // RcsAgentCreate | 
try {
    RcsAgent result = apiInstance.rcsAgentCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentApi#rcsAgentCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RcsAgentCreate**](RcsAgentCreate.md)|  | [optional]

### Return type

[**RcsAgent**](RcsAgent.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rcsAgentDelete"></a>
# **rcsAgentDelete**
> rcsAgentDelete(id)



Remove an rcs agent.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentApi apiInstance = new RcsAgentApi();
String id = "id_example"; // String | 
try {
    apiInstance.rcsAgentDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentApi#rcsAgentDelete");
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

<a name="rcsAgentGet"></a>
# **rcsAgentGet**
> RcsAgent rcsAgentGet(id)



Retrieve an rcs agent.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentApi apiInstance = new RcsAgentApi();
String id = "id_example"; // String | 
try {
    RcsAgent result = apiInstance.rcsAgentGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentApi#rcsAgentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**RcsAgent**](RcsAgent.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rcsAgentSearch"></a>
# **rcsAgentSearch**
> RcsAgentPaginationResponse rcsAgentSearch(filter, query, page, perPage, sort)



Search rcs agents.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentApi apiInstance = new RcsAgentApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    RcsAgentPaginationResponse result = apiInstance.rcsAgentSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentApi#rcsAgentSearch");
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

[**RcsAgentPaginationResponse**](RcsAgentPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rcsAgentUpdate"></a>
# **rcsAgentUpdate**
> RcsAgent rcsAgentUpdate(id, body)



Update an rcs agent.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentApi apiInstance = new RcsAgentApi();
String id = "id_example"; // String | 
RcsAgentUpdate body = new RcsAgentUpdate(); // RcsAgentUpdate | 
try {
    RcsAgent result = apiInstance.rcsAgentUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentApi#rcsAgentUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**RcsAgentUpdate**](RcsAgentUpdate.md)|  | [optional]

### Return type

[**RcsAgent**](RcsAgent.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

