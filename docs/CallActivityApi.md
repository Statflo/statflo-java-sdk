# CallActivityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callActivityCreate**](CallActivityApi.md#callActivityCreate) | **POST** /v4/api/call-activity | 
[**callActivityDelete**](CallActivityApi.md#callActivityDelete) | **DELETE** /v4/api/call-activity/{id} | 
[**callActivityGet**](CallActivityApi.md#callActivityGet) | **GET** /v4/api/call-activity/{id} | 
[**callActivitySearch**](CallActivityApi.md#callActivitySearch) | **GET** /v4/api/call-activity | 
[**callActivityUpdate**](CallActivityApi.md#callActivityUpdate) | **PUT** /v4/api/call-activity/{id} | 

<a name="callActivityCreate"></a>
# **callActivityCreate**
> CallActivity callActivityCreate(body)



Create a call activity.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CallActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallActivityApi apiInstance = new CallActivityApi();
CallActivityCreate body = new CallActivityCreate(); // CallActivityCreate | 
try {
    CallActivity result = apiInstance.callActivityCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallActivityApi#callActivityCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CallActivityCreate**](CallActivityCreate.md)|  | [optional]

### Return type

[**CallActivity**](CallActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callActivityDelete"></a>
# **callActivityDelete**
> callActivityDelete(id)



Remove a call activity.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CallActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallActivityApi apiInstance = new CallActivityApi();
String id = "id_example"; // String | 
try {
    apiInstance.callActivityDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CallActivityApi#callActivityDelete");
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

<a name="callActivityGet"></a>
# **callActivityGet**
> CallActivity callActivityGet(id)



Retrieve a call activity.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CallActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallActivityApi apiInstance = new CallActivityApi();
String id = "id_example"; // String | 
try {
    CallActivity result = apiInstance.callActivityGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallActivityApi#callActivityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CallActivity**](CallActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="callActivitySearch"></a>
# **callActivitySearch**
> CallActivityPaginationResponse callActivitySearch(filter, query, page, perPage, sort)



Search call activities.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CallActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallActivityApi apiInstance = new CallActivityApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    CallActivityPaginationResponse result = apiInstance.callActivitySearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallActivityApi#callActivitySearch");
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

[**CallActivityPaginationResponse**](CallActivityPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="callActivityUpdate"></a>
# **callActivityUpdate**
> CallActivity callActivityUpdate(id, body)



Update a call activity.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CallActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallActivityApi apiInstance = new CallActivityApi();
String id = "id_example"; // String | 
CallActivityUpdate body = new CallActivityUpdate(); // CallActivityUpdate | 
try {
    CallActivity result = apiInstance.callActivityUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallActivityApi#callActivityUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**CallActivityUpdate**](CallActivityUpdate.md)|  | [optional]

### Return type

[**CallActivity**](CallActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

