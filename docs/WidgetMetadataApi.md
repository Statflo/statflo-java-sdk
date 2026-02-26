# WidgetMetadataApi

All URIs are relative to *https://app.test.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**widgetMetadataCreate**](WidgetMetadataApi.md#widgetMetadataCreate) | **POST** /v4/api/widget-metadata | 
[**widgetMetadataDelete**](WidgetMetadataApi.md#widgetMetadataDelete) | **DELETE** /v4/api/widget-metadata/{id} | 
[**widgetMetadataGet**](WidgetMetadataApi.md#widgetMetadataGet) | **GET** /v4/api/widget-metadata/{id} | 
[**widgetMetadataSearch**](WidgetMetadataApi.md#widgetMetadataSearch) | **GET** /v4/api/widget-metadata | 
[**widgetMetadataUpdate**](WidgetMetadataApi.md#widgetMetadataUpdate) | **PUT** /v4/api/widget-metadata/{id} | 

<a name="widgetMetadataCreate"></a>
# **widgetMetadataCreate**
> WidgetMetadata widgetMetadataCreate(body)



Create a widget metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetMetadataApi apiInstance = new WidgetMetadataApi();
WidgetMetadataCreate body = new WidgetMetadataCreate(); // WidgetMetadataCreate | 
try {
    WidgetMetadata result = apiInstance.widgetMetadataCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetMetadataApi#widgetMetadataCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WidgetMetadataCreate**](WidgetMetadataCreate.md)|  | [optional]

### Return type

[**WidgetMetadata**](WidgetMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="widgetMetadataDelete"></a>
# **widgetMetadataDelete**
> widgetMetadataDelete(id)



Remove a widget metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetMetadataApi apiInstance = new WidgetMetadataApi();
String id = "id_example"; // String | 
try {
    apiInstance.widgetMetadataDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetMetadataApi#widgetMetadataDelete");
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

<a name="widgetMetadataGet"></a>
# **widgetMetadataGet**
> WidgetMetadata widgetMetadataGet(id)



Retrieve a widget metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetMetadataApi apiInstance = new WidgetMetadataApi();
String id = "id_example"; // String | 
try {
    WidgetMetadata result = apiInstance.widgetMetadataGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetMetadataApi#widgetMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**WidgetMetadata**](WidgetMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="widgetMetadataSearch"></a>
# **widgetMetadataSearch**
> WidgetMetadataPaginationResponse widgetMetadataSearch(filter, query, page, perPage, sort)



Search widget metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetMetadataApi apiInstance = new WidgetMetadataApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    WidgetMetadataPaginationResponse result = apiInstance.widgetMetadataSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetMetadataApi#widgetMetadataSearch");
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

[**WidgetMetadataPaginationResponse**](WidgetMetadataPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="widgetMetadataUpdate"></a>
# **widgetMetadataUpdate**
> WidgetMetadata widgetMetadataUpdate(id, body)



Update a widget metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetMetadataApi apiInstance = new WidgetMetadataApi();
String id = "id_example"; // String | 
WidgetMetadataUpdate body = new WidgetMetadataUpdate(); // WidgetMetadataUpdate | 
try {
    WidgetMetadata result = apiInstance.widgetMetadataUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetMetadataApi#widgetMetadataUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**WidgetMetadataUpdate**](WidgetMetadataUpdate.md)|  | [optional]

### Return type

[**WidgetMetadata**](WidgetMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

