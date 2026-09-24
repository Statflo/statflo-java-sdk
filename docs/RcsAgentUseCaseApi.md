# RcsAgentUseCaseApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rcsAgentUseCaseCreate**](RcsAgentUseCaseApi.md#rcsAgentUseCaseCreate) | **POST** /v4/api/rcs-agent-use-case | 
[**rcsAgentUseCaseDelete**](RcsAgentUseCaseApi.md#rcsAgentUseCaseDelete) | **DELETE** /v4/api/rcs-agent-use-case/{id} | 
[**rcsAgentUseCaseGet**](RcsAgentUseCaseApi.md#rcsAgentUseCaseGet) | **GET** /v4/api/rcs-agent-use-case/{id} | 
[**rcsAgentUseCaseSearch**](RcsAgentUseCaseApi.md#rcsAgentUseCaseSearch) | **GET** /v4/api/rcs-agent-use-case | 
[**rcsAgentUseCaseUpdate**](RcsAgentUseCaseApi.md#rcsAgentUseCaseUpdate) | **PUT** /v4/api/rcs-agent-use-case/{id} | 

<a name="rcsAgentUseCaseCreate"></a>
# **rcsAgentUseCaseCreate**
> RcsAgentUseCase rcsAgentUseCaseCreate(body)



Create an rcs agent use case.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentUseCaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentUseCaseApi apiInstance = new RcsAgentUseCaseApi();
RcsAgentUseCaseCreate body = new RcsAgentUseCaseCreate(); // RcsAgentUseCaseCreate | 
try {
    RcsAgentUseCase result = apiInstance.rcsAgentUseCaseCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentUseCaseApi#rcsAgentUseCaseCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RcsAgentUseCaseCreate**](RcsAgentUseCaseCreate.md)|  | [optional]

### Return type

[**RcsAgentUseCase**](RcsAgentUseCase.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rcsAgentUseCaseDelete"></a>
# **rcsAgentUseCaseDelete**
> rcsAgentUseCaseDelete(id)



Remove an rcs agent use case.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentUseCaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentUseCaseApi apiInstance = new RcsAgentUseCaseApi();
String id = "id_example"; // String | 
try {
    apiInstance.rcsAgentUseCaseDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentUseCaseApi#rcsAgentUseCaseDelete");
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

<a name="rcsAgentUseCaseGet"></a>
# **rcsAgentUseCaseGet**
> RcsAgentUseCase rcsAgentUseCaseGet(id)



Retrieve an rcs agent use case.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentUseCaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentUseCaseApi apiInstance = new RcsAgentUseCaseApi();
String id = "id_example"; // String | 
try {
    RcsAgentUseCase result = apiInstance.rcsAgentUseCaseGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentUseCaseApi#rcsAgentUseCaseGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**RcsAgentUseCase**](RcsAgentUseCase.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rcsAgentUseCaseSearch"></a>
# **rcsAgentUseCaseSearch**
> RcsAgentUseCasePaginationResponse rcsAgentUseCaseSearch(filter, query, page, perPage, sort)



Search rcs agent use cases.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentUseCaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentUseCaseApi apiInstance = new RcsAgentUseCaseApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    RcsAgentUseCasePaginationResponse result = apiInstance.rcsAgentUseCaseSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentUseCaseApi#rcsAgentUseCaseSearch");
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

[**RcsAgentUseCasePaginationResponse**](RcsAgentUseCasePaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rcsAgentUseCaseUpdate"></a>
# **rcsAgentUseCaseUpdate**
> RcsAgentUseCase rcsAgentUseCaseUpdate(id, body)



Update an rcs agent use case.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentUseCaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentUseCaseApi apiInstance = new RcsAgentUseCaseApi();
String id = "id_example"; // String | 
RcsAgentUseCaseUpdate body = new RcsAgentUseCaseUpdate(); // RcsAgentUseCaseUpdate | 
try {
    RcsAgentUseCase result = apiInstance.rcsAgentUseCaseUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentUseCaseApi#rcsAgentUseCaseUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**RcsAgentUseCaseUpdate**](RcsAgentUseCaseUpdate.md)|  | [optional]

### Return type

[**RcsAgentUseCase**](RcsAgentUseCase.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

