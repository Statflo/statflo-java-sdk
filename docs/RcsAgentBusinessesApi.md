# RcsAgentBusinessesApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rCSAgentBusinessCreate**](RcsAgentBusinessesApi.md#rCSAgentBusinessCreate) | **POST** /v4/api/rcs-agent-business | 
[**rCSAgentBusinessDelete**](RcsAgentBusinessesApi.md#rCSAgentBusinessDelete) | **DELETE** /v4/api/rcs-agent-business/{id} | 
[**rCSAgentBusinessGet**](RcsAgentBusinessesApi.md#rCSAgentBusinessGet) | **GET** /v4/api/rcs-agent-business/{id} | 
[**rCSAgentBusinessSearch**](RcsAgentBusinessesApi.md#rCSAgentBusinessSearch) | **GET** /v4/api/rcs-agent-business | 
[**rCSAgentBusinessUpdate**](RcsAgentBusinessesApi.md#rCSAgentBusinessUpdate) | **PUT** /v4/api/rcs-agent-business/{id} | 

<a name="rCSAgentBusinessCreate"></a>
# **rCSAgentBusinessCreate**
> RCSAgentBusiness rCSAgentBusinessCreate(body)



Create an rcs agent business.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentBusinessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentBusinessesApi apiInstance = new RcsAgentBusinessesApi();
RCSAgentBusinessCreate body = new RCSAgentBusinessCreate(); // RCSAgentBusinessCreate | 
try {
    RCSAgentBusiness result = apiInstance.rCSAgentBusinessCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentBusinessesApi#rCSAgentBusinessCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RCSAgentBusinessCreate**](RCSAgentBusinessCreate.md)|  | [optional]

### Return type

[**RCSAgentBusiness**](RCSAgentBusiness.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rCSAgentBusinessDelete"></a>
# **rCSAgentBusinessDelete**
> rCSAgentBusinessDelete(id)



Remove an rcs agent business.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentBusinessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentBusinessesApi apiInstance = new RcsAgentBusinessesApi();
String id = "id_example"; // String | 
try {
    apiInstance.rCSAgentBusinessDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentBusinessesApi#rCSAgentBusinessDelete");
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

<a name="rCSAgentBusinessGet"></a>
# **rCSAgentBusinessGet**
> RCSAgentBusiness rCSAgentBusinessGet(id)



Retrieve an rcs agent business.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentBusinessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentBusinessesApi apiInstance = new RcsAgentBusinessesApi();
String id = "id_example"; // String | 
try {
    RCSAgentBusiness result = apiInstance.rCSAgentBusinessGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentBusinessesApi#rCSAgentBusinessGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**RCSAgentBusiness**](RCSAgentBusiness.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rCSAgentBusinessSearch"></a>
# **rCSAgentBusinessSearch**
> RCSAgentBusinessPaginationResponse rCSAgentBusinessSearch(filter, query, page, perPage, sort)



Search rcs agent businesses.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentBusinessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentBusinessesApi apiInstance = new RcsAgentBusinessesApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    RCSAgentBusinessPaginationResponse result = apiInstance.rCSAgentBusinessSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentBusinessesApi#rCSAgentBusinessSearch");
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

[**RCSAgentBusinessPaginationResponse**](RCSAgentBusinessPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rCSAgentBusinessUpdate"></a>
# **rCSAgentBusinessUpdate**
> RCSAgentBusiness rCSAgentBusinessUpdate(id, body)



Update an rcs agent business.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentBusinessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentBusinessesApi apiInstance = new RcsAgentBusinessesApi();
String id = "id_example"; // String | 
RCSAgentBusinessUpdate body = new RCSAgentBusinessUpdate(); // RCSAgentBusinessUpdate | 
try {
    RCSAgentBusiness result = apiInstance.rCSAgentBusinessUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentBusinessesApi#rCSAgentBusinessUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**RCSAgentBusinessUpdate**](RCSAgentBusinessUpdate.md)|  | [optional]

### Return type

[**RCSAgentBusiness**](RCSAgentBusiness.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

