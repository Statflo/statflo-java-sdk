# RcsAgentUseCasesApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rCSAgentUseCaseCreate**](RcsAgentUseCasesApi.md#rCSAgentUseCaseCreate) | **POST** /v4/api/rcs-agent-use-case | 
[**rCSAgentUseCaseDelete**](RcsAgentUseCasesApi.md#rCSAgentUseCaseDelete) | **DELETE** /v4/api/rcs-agent-use-case/{id} | 
[**rCSAgentUseCaseGet**](RcsAgentUseCasesApi.md#rCSAgentUseCaseGet) | **GET** /v4/api/rcs-agent-use-case/{id} | 
[**rCSAgentUseCaseSearch**](RcsAgentUseCasesApi.md#rCSAgentUseCaseSearch) | **GET** /v4/api/rcs-agent-use-case | 
[**rCSAgentUseCaseUpdate**](RcsAgentUseCasesApi.md#rCSAgentUseCaseUpdate) | **PUT** /v4/api/rcs-agent-use-case/{id} | 

<a name="rCSAgentUseCaseCreate"></a>
# **rCSAgentUseCaseCreate**
> RCSAgentUseCase rCSAgentUseCaseCreate(body)



Create an rcs agent use case.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentUseCasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentUseCasesApi apiInstance = new RcsAgentUseCasesApi();
RCSAgentUseCaseCreate body = new RCSAgentUseCaseCreate(); // RCSAgentUseCaseCreate | 
try {
    RCSAgentUseCase result = apiInstance.rCSAgentUseCaseCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentUseCasesApi#rCSAgentUseCaseCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RCSAgentUseCaseCreate**](RCSAgentUseCaseCreate.md)|  | [optional]

### Return type

[**RCSAgentUseCase**](RCSAgentUseCase.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rCSAgentUseCaseDelete"></a>
# **rCSAgentUseCaseDelete**
> rCSAgentUseCaseDelete(id)



Remove an rcs agent use case.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentUseCasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentUseCasesApi apiInstance = new RcsAgentUseCasesApi();
String id = "id_example"; // String | 
try {
    apiInstance.rCSAgentUseCaseDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentUseCasesApi#rCSAgentUseCaseDelete");
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

<a name="rCSAgentUseCaseGet"></a>
# **rCSAgentUseCaseGet**
> RCSAgentUseCase rCSAgentUseCaseGet(id)



Retrieve an rcs agent use case.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentUseCasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentUseCasesApi apiInstance = new RcsAgentUseCasesApi();
String id = "id_example"; // String | 
try {
    RCSAgentUseCase result = apiInstance.rCSAgentUseCaseGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentUseCasesApi#rCSAgentUseCaseGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**RCSAgentUseCase**](RCSAgentUseCase.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rCSAgentUseCaseSearch"></a>
# **rCSAgentUseCaseSearch**
> RCSAgentUseCasePaginationResponse rCSAgentUseCaseSearch(filter, query, page, perPage, sort)



Search rcs agent use cases.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentUseCasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentUseCasesApi apiInstance = new RcsAgentUseCasesApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    RCSAgentUseCasePaginationResponse result = apiInstance.rCSAgentUseCaseSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentUseCasesApi#rCSAgentUseCaseSearch");
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

[**RCSAgentUseCasePaginationResponse**](RCSAgentUseCasePaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rCSAgentUseCaseUpdate"></a>
# **rCSAgentUseCaseUpdate**
> RCSAgentUseCase rCSAgentUseCaseUpdate(id, body)



Update an rcs agent use case.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RcsAgentUseCasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RcsAgentUseCasesApi apiInstance = new RcsAgentUseCasesApi();
String id = "id_example"; // String | 
RCSAgentUseCaseUpdate body = new RCSAgentUseCaseUpdate(); // RCSAgentUseCaseUpdate | 
try {
    RCSAgentUseCase result = apiInstance.rCSAgentUseCaseUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RcsAgentUseCasesApi#rCSAgentUseCaseUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**RCSAgentUseCaseUpdate**](RCSAgentUseCaseUpdate.md)|  | [optional]

### Return type

[**RCSAgentUseCase**](RCSAgentUseCase.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

