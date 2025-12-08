# DealerMetadataApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealerMetadataCreate**](DealerMetadataApi.md#dealerMetadataCreate) | **POST** /v4/api/dealer-metadata | 
[**dealerMetadataDelete**](DealerMetadataApi.md#dealerMetadataDelete) | **DELETE** /v4/api/dealer-metadata/{id} | 
[**dealerMetadataGet**](DealerMetadataApi.md#dealerMetadataGet) | **GET** /v4/api/dealer-metadata/{id} | 
[**dealerMetadataSearch**](DealerMetadataApi.md#dealerMetadataSearch) | **GET** /v4/api/dealer-metadata | 
[**dealerMetadataUpdate**](DealerMetadataApi.md#dealerMetadataUpdate) | **PUT** /v4/api/dealer-metadata/{id} | 

<a name="dealerMetadataCreate"></a>
# **dealerMetadataCreate**
> DealerMetadata dealerMetadataCreate(body)



Create a dealer metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerMetadataApi apiInstance = new DealerMetadataApi();
DealerMetadataCreate body = new DealerMetadataCreate(); // DealerMetadataCreate | 
try {
    DealerMetadata result = apiInstance.dealerMetadataCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerMetadataApi#dealerMetadataCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DealerMetadataCreate**](DealerMetadataCreate.md)|  | [optional]

### Return type

[**DealerMetadata**](DealerMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dealerMetadataDelete"></a>
# **dealerMetadataDelete**
> dealerMetadataDelete(id)



Remove a dealer metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerMetadataApi apiInstance = new DealerMetadataApi();
String id = "id_example"; // String | 
try {
    apiInstance.dealerMetadataDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerMetadataApi#dealerMetadataDelete");
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

<a name="dealerMetadataGet"></a>
# **dealerMetadataGet**
> DealerMetadata dealerMetadataGet(id)



Retrieve a dealer metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerMetadataApi apiInstance = new DealerMetadataApi();
String id = "id_example"; // String | 
try {
    DealerMetadata result = apiInstance.dealerMetadataGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerMetadataApi#dealerMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DealerMetadata**](DealerMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealerMetadataSearch"></a>
# **dealerMetadataSearch**
> DealerMetadataPaginationResponse dealerMetadataSearch(filter, query, page, perPage, sort)



Search dealer metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerMetadataApi apiInstance = new DealerMetadataApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    DealerMetadataPaginationResponse result = apiInstance.dealerMetadataSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerMetadataApi#dealerMetadataSearch");
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

[**DealerMetadataPaginationResponse**](DealerMetadataPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealerMetadataUpdate"></a>
# **dealerMetadataUpdate**
> DealerMetadata dealerMetadataUpdate(id, body)



Update a dealer metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerMetadataApi apiInstance = new DealerMetadataApi();
String id = "id_example"; // String | 
DealerMetadataUpdate body = new DealerMetadataUpdate(); // DealerMetadataUpdate | 
try {
    DealerMetadata result = apiInstance.dealerMetadataUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerMetadataApi#dealerMetadataUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**DealerMetadataUpdate**](DealerMetadataUpdate.md)|  | [optional]

### Return type

[**DealerMetadata**](DealerMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

