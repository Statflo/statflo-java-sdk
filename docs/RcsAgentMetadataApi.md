# RcsAgentMetadataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rCSAgentMetadataCreate**](RcsAgentMetadataApi.md#rCSAgentMetadataCreate) | **POST** /v4/api/rcs-agent-metadata | 
[**rCSAgentMetadataDelete**](RcsAgentMetadataApi.md#rCSAgentMetadataDelete) | **DELETE** /v4/api/rcs-agent-metadata/{id} | 
[**rCSAgentMetadataGet**](RcsAgentMetadataApi.md#rCSAgentMetadataGet) | **GET** /v4/api/rcs-agent-metadata/{id} | 
[**rCSAgentMetadataSearch**](RcsAgentMetadataApi.md#rCSAgentMetadataSearch) | **GET** /v4/api/rcs-agent-metadata | 
[**rCSAgentMetadataUpdate**](RcsAgentMetadataApi.md#rCSAgentMetadataUpdate) | **PUT** /v4/api/rcs-agent-metadata/{id} | 

<a name="rCSAgentMetadataCreate"></a>
# **rCSAgentMetadataCreate**
> RCSAgentMetadata rCSAgentMetadataCreate(body)



Create an rcs agent metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentMetadataApi apiInstance = new RcsAgentMetadataApi();
RCSAgentMetadataCreate body = new RCSAgentMetadataCreate(); // RCSAgentMetadataCreate | 
try {
    RCSAgentMetadata result = apiInstance.rCSAgentMetadataCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentMetadataApi#rCSAgentMetadataCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RCSAgentMetadataCreate**](RCSAgentMetadataCreate.md)|  | [optional]

### Return type

[**RCSAgentMetadata**](RCSAgentMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rCSAgentMetadataDelete"></a>
# **rCSAgentMetadataDelete**
> rCSAgentMetadataDelete(id)



Remove an rcs agent metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentMetadataApi apiInstance = new RcsAgentMetadataApi();
String id = "id_example"; // String | 
try {
    apiInstance.rCSAgentMetadataDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentMetadataApi#rCSAgentMetadataDelete");
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

<a name="rCSAgentMetadataGet"></a>
# **rCSAgentMetadataGet**
> RCSAgentMetadata rCSAgentMetadataGet(id)



Retrieve an rcs agent metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentMetadataApi apiInstance = new RcsAgentMetadataApi();
String id = "id_example"; // String | 
try {
    RCSAgentMetadata result = apiInstance.rCSAgentMetadataGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentMetadataApi#rCSAgentMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**RCSAgentMetadata**](RCSAgentMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rCSAgentMetadataSearch"></a>
# **rCSAgentMetadataSearch**
> RCSAgentMetadataPaginationResponse rCSAgentMetadataSearch(filter, query, page, perPage, sort)



Search rcs agent metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentMetadataApi apiInstance = new RcsAgentMetadataApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    RCSAgentMetadataPaginationResponse result = apiInstance.rCSAgentMetadataSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentMetadataApi#rCSAgentMetadataSearch");
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

[**RCSAgentMetadataPaginationResponse**](RCSAgentMetadataPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rCSAgentMetadataUpdate"></a>
# **rCSAgentMetadataUpdate**
> RCSAgentMetadata rCSAgentMetadataUpdate(id, body)



Update an rcs agent metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentMetadataApi apiInstance = new RcsAgentMetadataApi();
String id = "id_example"; // String | 
RCSAgentMetadataUpdate body = new RCSAgentMetadataUpdate(); // RCSAgentMetadataUpdate | 
try {
    RCSAgentMetadata result = apiInstance.rCSAgentMetadataUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentMetadataApi#rCSAgentMetadataUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**RCSAgentMetadataUpdate**](RCSAgentMetadataUpdate.md)|  | [optional]

### Return type

[**RCSAgentMetadata**](RCSAgentMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

