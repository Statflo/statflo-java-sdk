# RcsAgentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rCSAgentCreate**](RcsAgentsApi.md#rCSAgentCreate) | **POST** /v4/api/rcs-agent | 
[**rCSAgentDelete**](RcsAgentsApi.md#rCSAgentDelete) | **DELETE** /v4/api/rcs-agent/{id} | 
[**rCSAgentGet**](RcsAgentsApi.md#rCSAgentGet) | **GET** /v4/api/rcs-agent/{id} | 
[**rCSAgentSearch**](RcsAgentsApi.md#rCSAgentSearch) | **GET** /v4/api/rcs-agent | 
[**rCSAgentUpdate**](RcsAgentsApi.md#rCSAgentUpdate) | **PUT** /v4/api/rcs-agent/{id} | 

<a name="rCSAgentCreate"></a>
# **rCSAgentCreate**
> RCSAgent rCSAgentCreate(body)



Create an rcs agent.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentsApi apiInstance = new RcsAgentsApi();
RCSAgentCreate body = new RCSAgentCreate(); // RCSAgentCreate | 
try {
    RCSAgent result = apiInstance.rCSAgentCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentsApi#rCSAgentCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RCSAgentCreate**](RCSAgentCreate.md)|  | [optional]

### Return type

[**RCSAgent**](RCSAgent.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rCSAgentDelete"></a>
# **rCSAgentDelete**
> rCSAgentDelete(id)



Remove an rcs agent.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentsApi apiInstance = new RcsAgentsApi();
String id = "id_example"; // String | 
try {
    apiInstance.rCSAgentDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentsApi#rCSAgentDelete");
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

<a name="rCSAgentGet"></a>
# **rCSAgentGet**
> RCSAgent rCSAgentGet(id)



Retrieve an rcs agent.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentsApi apiInstance = new RcsAgentsApi();
String id = "id_example"; // String | 
try {
    RCSAgent result = apiInstance.rCSAgentGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentsApi#rCSAgentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**RCSAgent**](RCSAgent.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rCSAgentSearch"></a>
# **rCSAgentSearch**
> RCSAgentPaginationResponse rCSAgentSearch(filter, query, page, perPage, sort)



Search rcs agents.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentsApi apiInstance = new RcsAgentsApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    RCSAgentPaginationResponse result = apiInstance.rCSAgentSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentsApi#rCSAgentSearch");
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

[**RCSAgentPaginationResponse**](RCSAgentPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rCSAgentUpdate"></a>
# **rCSAgentUpdate**
> RCSAgent rCSAgentUpdate(id, body)



Update an rcs agent.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentsApi apiInstance = new RcsAgentsApi();
String id = "id_example"; // String | 
RCSAgentUpdate body = new RCSAgentUpdate(); // RCSAgentUpdate | 
try {
    RCSAgent result = apiInstance.rCSAgentUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentsApi#rCSAgentUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**RCSAgentUpdate**](RCSAgentUpdate.md)|  | [optional]

### Return type

[**RCSAgent**](RCSAgent.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

