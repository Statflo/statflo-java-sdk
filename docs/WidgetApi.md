# WidgetApi

All URIs are relative to *https://app.test.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**widgetCreate**](WidgetApi.md#widgetCreate) | **POST** /v4/api/widget | 
[**widgetDelete**](WidgetApi.md#widgetDelete) | **DELETE** /v4/api/widget/{id} | 
[**widgetGet**](WidgetApi.md#widgetGet) | **GET** /v4/api/widget/{id} | 
[**widgetSearch**](WidgetApi.md#widgetSearch) | **GET** /v4/api/widget | 
[**widgetUpdate**](WidgetApi.md#widgetUpdate) | **PUT** /v4/api/widget/{id} | 

<a name="widgetCreate"></a>
# **widgetCreate**
> Widget widgetCreate(body)



Create a widget.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetApi apiInstance = new WidgetApi();
WidgetCreate body = new WidgetCreate(); // WidgetCreate | 
try {
    Widget result = apiInstance.widgetCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetApi#widgetCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WidgetCreate**](WidgetCreate.md)|  | [optional]

### Return type

[**Widget**](Widget.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="widgetDelete"></a>
# **widgetDelete**
> widgetDelete(id)



Remove a widget.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetApi apiInstance = new WidgetApi();
String id = "id_example"; // String | 
try {
    apiInstance.widgetDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetApi#widgetDelete");
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

<a name="widgetGet"></a>
# **widgetGet**
> Widget widgetGet(id)



Retrieve a widget.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetApi apiInstance = new WidgetApi();
String id = "id_example"; // String | 
try {
    Widget result = apiInstance.widgetGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetApi#widgetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Widget**](Widget.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="widgetSearch"></a>
# **widgetSearch**
> WidgetPaginationResponse widgetSearch(filter, query, page, perPage, sort)



Search widgets.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetApi apiInstance = new WidgetApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    WidgetPaginationResponse result = apiInstance.widgetSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetApi#widgetSearch");
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

[**WidgetPaginationResponse**](WidgetPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="widgetUpdate"></a>
# **widgetUpdate**
> Widget widgetUpdate(id, body)



Update a widget.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetApi apiInstance = new WidgetApi();
String id = "id_example"; // String | 
WidgetUpdate body = new WidgetUpdate(); // WidgetUpdate | 
try {
    Widget result = apiInstance.widgetUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetApi#widgetUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**WidgetUpdate**](WidgetUpdate.md)|  | [optional]

### Return type

[**Widget**](Widget.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

