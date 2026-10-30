# RcsAgentMetadataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rcsAgentMetadataCreate**](RcsAgentMetadataApi.md#rcsAgentMetadataCreate) | **POST** /v4/api/rcs-agent-metadata | 
[**rcsAgentMetadataDelete**](RcsAgentMetadataApi.md#rcsAgentMetadataDelete) | **DELETE** /v4/api/rcs-agent-metadata/{id} | 
[**rcsAgentMetadataGet**](RcsAgentMetadataApi.md#rcsAgentMetadataGet) | **GET** /v4/api/rcs-agent-metadata/{id} | 
[**rcsAgentMetadataSearch**](RcsAgentMetadataApi.md#rcsAgentMetadataSearch) | **GET** /v4/api/rcs-agent-metadata | 
[**rcsAgentMetadataUpdate**](RcsAgentMetadataApi.md#rcsAgentMetadataUpdate) | **PUT** /v4/api/rcs-agent-metadata/{id} | 

<a name="rcsAgentMetadataCreate"></a>
# **rcsAgentMetadataCreate**
> RcsAgentMetadata rcsAgentMetadataCreate(body)



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
RcsAgentMetadataCreate body = new RcsAgentMetadataCreate(); // RcsAgentMetadataCreate | 
try {
    RcsAgentMetadata result = apiInstance.rcsAgentMetadataCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentMetadataApi#rcsAgentMetadataCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RcsAgentMetadataCreate**](RcsAgentMetadataCreate.md)|  | [optional]

### Return type

[**RcsAgentMetadata**](RcsAgentMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rcsAgentMetadataDelete"></a>
# **rcsAgentMetadataDelete**
> rcsAgentMetadataDelete(id)



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
    apiInstance.rcsAgentMetadataDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentMetadataApi#rcsAgentMetadataDelete");
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

<a name="rcsAgentMetadataGet"></a>
# **rcsAgentMetadataGet**
> RcsAgentMetadata rcsAgentMetadataGet(id)



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
    RcsAgentMetadata result = apiInstance.rcsAgentMetadataGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentMetadataApi#rcsAgentMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**RcsAgentMetadata**](RcsAgentMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rcsAgentMetadataSearch"></a>
# **rcsAgentMetadataSearch**
> RcsAgentMetadataPaginationResponse rcsAgentMetadataSearch(filter, query, page, perPage, sort)



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
    RcsAgentMetadataPaginationResponse result = apiInstance.rcsAgentMetadataSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentMetadataApi#rcsAgentMetadataSearch");
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

[**RcsAgentMetadataPaginationResponse**](RcsAgentMetadataPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rcsAgentMetadataUpdate"></a>
# **rcsAgentMetadataUpdate**
> RcsAgentMetadata rcsAgentMetadataUpdate(id, body)



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
RcsAgentMetadataUpdate body = new RcsAgentMetadataUpdate(); // RcsAgentMetadataUpdate | 
try {
    RcsAgentMetadata result = apiInstance.rcsAgentMetadataUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentMetadataApi#rcsAgentMetadataUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**RcsAgentMetadataUpdate**](RcsAgentMetadataUpdate.md)|  | [optional]

### Return type

[**RcsAgentMetadata**](RcsAgentMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

