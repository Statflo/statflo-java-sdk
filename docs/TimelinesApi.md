# TimelinesApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timelineCreate**](TimelinesApi.md#timelineCreate) | **POST** /v4/api/timeline | 
[**timelineDelete**](TimelinesApi.md#timelineDelete) | **DELETE** /v4/api/timeline/{id} | 
[**timelineGet**](TimelinesApi.md#timelineGet) | **GET** /v4/api/timeline/{id} | 
[**timelineSearch**](TimelinesApi.md#timelineSearch) | **GET** /v4/api/timeline | 
[**timelineUpdate**](TimelinesApi.md#timelineUpdate) | **PUT** /v4/api/timeline/{id} | 

<a name="timelineCreate"></a>
# **timelineCreate**
> Timeline timelineCreate(body)



Create an timeline.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TimelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TimelinesApi apiInstance = new TimelinesApi();
TimelineCreate body = new TimelineCreate(); // TimelineCreate | 
try {
    Timeline result = apiInstance.timelineCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimelinesApi#timelineCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimelineCreate**](TimelineCreate.md)|  | [optional]

### Return type

[**Timeline**](Timeline.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="timelineDelete"></a>
# **timelineDelete**
> timelineDelete(id)



Remove an timeline.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TimelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TimelinesApi apiInstance = new TimelinesApi();
String id = "id_example"; // String | 
try {
    apiInstance.timelineDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TimelinesApi#timelineDelete");
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

<a name="timelineGet"></a>
# **timelineGet**
> Timeline timelineGet(id)



Retrieve an timeline.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TimelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TimelinesApi apiInstance = new TimelinesApi();
String id = "id_example"; // String | 
try {
    Timeline result = apiInstance.timelineGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimelinesApi#timelineGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Timeline**](Timeline.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="timelineSearch"></a>
# **timelineSearch**
> TimelinePaginationResponse timelineSearch(filter, query, page, perPage, sort)



Search timelines.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TimelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TimelinesApi apiInstance = new TimelinesApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    TimelinePaginationResponse result = apiInstance.timelineSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimelinesApi#timelineSearch");
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

[**TimelinePaginationResponse**](TimelinePaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="timelineUpdate"></a>
# **timelineUpdate**
> Timeline timelineUpdate(id, body)



Update an timeline.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TimelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TimelinesApi apiInstance = new TimelinesApi();
String id = "id_example"; // String | 
TimelineUpdate body = new TimelineUpdate(); // TimelineUpdate | 
try {
    Timeline result = apiInstance.timelineUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimelinesApi#timelineUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**TimelineUpdate**](TimelineUpdate.md)|  | [optional]

### Return type

[**Timeline**](Timeline.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

