# ExternalDncApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**externalDncCreate**](ExternalDncApi.md#externalDncCreate) | **POST** /v4/api/external-dnc | 
[**externalDncDelete**](ExternalDncApi.md#externalDncDelete) | **DELETE** /v4/api/external-dnc/{id} | 
[**externalDncGet**](ExternalDncApi.md#externalDncGet) | **GET** /v4/api/external-dnc/{id} | 
[**externalDncSearch**](ExternalDncApi.md#externalDncSearch) | **GET** /v4/api/external-dnc | 
[**externalDncUpdate**](ExternalDncApi.md#externalDncUpdate) | **PUT** /v4/api/external-dnc/{id} | 

<a name="externalDncCreate"></a>
# **externalDncCreate**
> ExternalDnc externalDncCreate(body)



Create an external DNC.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ExternalDncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExternalDncApi apiInstance = new ExternalDncApi();
ExternalDncCreate body = new ExternalDncCreate(); // ExternalDncCreate | 
try {
    ExternalDnc result = apiInstance.externalDncCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalDncApi#externalDncCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalDncCreate**](ExternalDncCreate.md)|  | [optional]

### Return type

[**ExternalDnc**](ExternalDnc.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="externalDncDelete"></a>
# **externalDncDelete**
> externalDncDelete(id)



Remove an external DNC entry.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ExternalDncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExternalDncApi apiInstance = new ExternalDncApi();
String id = "id_example"; // String | 
try {
    apiInstance.externalDncDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalDncApi#externalDncDelete");
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

<a name="externalDncGet"></a>
# **externalDncGet**
> ExternalDnc externalDncGet(id)



Retrieve an external DNC.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ExternalDncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExternalDncApi apiInstance = new ExternalDncApi();
String id = "id_example"; // String | 
try {
    ExternalDnc result = apiInstance.externalDncGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalDncApi#externalDncGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ExternalDnc**](ExternalDnc.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="externalDncSearch"></a>
# **externalDncSearch**
> ExternalDncPaginationResponse externalDncSearch(filter, query, page, perPage, sort)



Search external DNC.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ExternalDncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExternalDncApi apiInstance = new ExternalDncApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ExternalDncPaginationResponse result = apiInstance.externalDncSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalDncApi#externalDncSearch");
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

[**ExternalDncPaginationResponse**](ExternalDncPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="externalDncUpdate"></a>
# **externalDncUpdate**
> ExternalDnc externalDncUpdate(id, body)



Update an external DNC.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ExternalDncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExternalDncApi apiInstance = new ExternalDncApi();
String id = "id_example"; // String | 
ExternalDncUpdate body = new ExternalDncUpdate(); // ExternalDncUpdate | 
try {
    ExternalDnc result = apiInstance.externalDncUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalDncApi#externalDncUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**ExternalDncUpdate**](ExternalDncUpdate.md)|  | [optional]

### Return type

[**ExternalDnc**](ExternalDnc.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

