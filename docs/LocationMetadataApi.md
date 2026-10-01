# LocationMetadataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationMetadataCreate**](LocationMetadataApi.md#locationMetadataCreate) | **POST** /v4/api/location-metadata | 
[**locationMetadataDelete**](LocationMetadataApi.md#locationMetadataDelete) | **DELETE** /v4/api/location-metadata/{id} | 
[**locationMetadataGet**](LocationMetadataApi.md#locationMetadataGet) | **GET** /v4/api/location-metadata/{id} | 
[**locationMetadataSearch**](LocationMetadataApi.md#locationMetadataSearch) | **GET** /v4/api/location-metadata | 
[**locationMetadataUpdate**](LocationMetadataApi.md#locationMetadataUpdate) | **PUT** /v4/api/location-metadata/{id} | 

<a name="locationMetadataCreate"></a>
# **locationMetadataCreate**
> LocationMetadata locationMetadataCreate(body)



Create location metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationMetadataApi apiInstance = new LocationMetadataApi();
LocationMetadataCreate body = new LocationMetadataCreate(); // LocationMetadataCreate | 
try {
    LocationMetadata result = apiInstance.locationMetadataCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationMetadataApi#locationMetadataCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationMetadataCreate**](LocationMetadataCreate.md)|  | [optional]

### Return type

[**LocationMetadata**](LocationMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="locationMetadataDelete"></a>
# **locationMetadataDelete**
> locationMetadataDelete(id)



Remove location metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationMetadataApi apiInstance = new LocationMetadataApi();
String id = "id_example"; // String | 
try {
    apiInstance.locationMetadataDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationMetadataApi#locationMetadataDelete");
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

<a name="locationMetadataGet"></a>
# **locationMetadataGet**
> LocationMetadata locationMetadataGet(id)



Retrieve location metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationMetadataApi apiInstance = new LocationMetadataApi();
String id = "id_example"; // String | 
try {
    LocationMetadata result = apiInstance.locationMetadataGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationMetadataApi#locationMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**LocationMetadata**](LocationMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationMetadataSearch"></a>
# **locationMetadataSearch**
> LocationMetadataPaginationResponse locationMetadataSearch(filter, query, page, perPage, sort)



Search location metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationMetadataApi apiInstance = new LocationMetadataApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    LocationMetadataPaginationResponse result = apiInstance.locationMetadataSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationMetadataApi#locationMetadataSearch");
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

[**LocationMetadataPaginationResponse**](LocationMetadataPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationMetadataUpdate"></a>
# **locationMetadataUpdate**
> LocationMetadata locationMetadataUpdate(id, body)



Update location metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationMetadataApi apiInstance = new LocationMetadataApi();
String id = "id_example"; // String | 
LocationMetadataUpdate body = new LocationMetadataUpdate(); // LocationMetadataUpdate | 
try {
    LocationMetadata result = apiInstance.locationMetadataUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationMetadataApi#locationMetadataUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**LocationMetadataUpdate**](LocationMetadataUpdate.md)|  | [optional]

### Return type

[**LocationMetadata**](LocationMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

