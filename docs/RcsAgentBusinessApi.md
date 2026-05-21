# RcsAgentBusinessApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rcsAgentBusinessCreate**](RcsAgentBusinessApi.md#rcsAgentBusinessCreate) | **POST** /v4/api/rcs-agent-business | 
[**rcsAgentBusinessDelete**](RcsAgentBusinessApi.md#rcsAgentBusinessDelete) | **DELETE** /v4/api/rcs-agent-business/{id} | 
[**rcsAgentBusinessGet**](RcsAgentBusinessApi.md#rcsAgentBusinessGet) | **GET** /v4/api/rcs-agent-business/{id} | 
[**rcsAgentBusinessSearch**](RcsAgentBusinessApi.md#rcsAgentBusinessSearch) | **GET** /v4/api/rcs-agent-business | 
[**rcsAgentBusinessUpdate**](RcsAgentBusinessApi.md#rcsAgentBusinessUpdate) | **PUT** /v4/api/rcs-agent-business/{id} | 

<a name="rcsAgentBusinessCreate"></a>
# **rcsAgentBusinessCreate**
> RcsAgentBusiness rcsAgentBusinessCreate(body)



Create an rcs agent business.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentBusinessApi apiInstance = new RcsAgentBusinessApi();
RcsAgentBusinessCreate body = new RcsAgentBusinessCreate(); // RcsAgentBusinessCreate | 
try {
    RcsAgentBusiness result = apiInstance.rcsAgentBusinessCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentBusinessApi#rcsAgentBusinessCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RcsAgentBusinessCreate**](RcsAgentBusinessCreate.md)|  | [optional]

### Return type

[**RcsAgentBusiness**](RcsAgentBusiness.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rcsAgentBusinessDelete"></a>
# **rcsAgentBusinessDelete**
> rcsAgentBusinessDelete(id)



Remove an rcs agent business.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentBusinessApi apiInstance = new RcsAgentBusinessApi();
String id = "id_example"; // String | 
try {
    apiInstance.rcsAgentBusinessDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentBusinessApi#rcsAgentBusinessDelete");
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

<a name="rcsAgentBusinessGet"></a>
# **rcsAgentBusinessGet**
> RcsAgentBusiness rcsAgentBusinessGet(id)



Retrieve an rcs agent business.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentBusinessApi apiInstance = new RcsAgentBusinessApi();
String id = "id_example"; // String | 
try {
    RcsAgentBusiness result = apiInstance.rcsAgentBusinessGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentBusinessApi#rcsAgentBusinessGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**RcsAgentBusiness**](RcsAgentBusiness.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rcsAgentBusinessSearch"></a>
# **rcsAgentBusinessSearch**
> RcsAgentBusinessPaginationResponse rcsAgentBusinessSearch(filter, query, page, perPage, sort)



Search rcs agent businesses.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentBusinessApi apiInstance = new RcsAgentBusinessApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    RcsAgentBusinessPaginationResponse result = apiInstance.rcsAgentBusinessSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentBusinessApi#rcsAgentBusinessSearch");
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

[**RcsAgentBusinessPaginationResponse**](RcsAgentBusinessPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rcsAgentBusinessUpdate"></a>
# **rcsAgentBusinessUpdate**
> RcsAgentBusiness rcsAgentBusinessUpdate(id, body)



Update an rcs agent business.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentBusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentBusinessApi apiInstance = new RcsAgentBusinessApi();
String id = "id_example"; // String | 
RcsAgentBusinessUpdate body = new RcsAgentBusinessUpdate(); // RcsAgentBusinessUpdate | 
try {
    RcsAgentBusiness result = apiInstance.rcsAgentBusinessUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentBusinessApi#rcsAgentBusinessUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**RcsAgentBusinessUpdate**](RcsAgentBusinessUpdate.md)|  | [optional]

### Return type

[**RcsAgentBusiness**](RcsAgentBusiness.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

