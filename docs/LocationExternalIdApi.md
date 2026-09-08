# LocationExternalIdApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationExternalIdCreate**](LocationExternalIdApi.md#locationExternalIdCreate) | **POST** /v4/api/location-external-id | 
[**locationExternalIdDelete**](LocationExternalIdApi.md#locationExternalIdDelete) | **DELETE** /v4/api/location-external-id/{id} | 
[**locationExternalIdGet**](LocationExternalIdApi.md#locationExternalIdGet) | **GET** /v4/api/location-external-id/{id} | 
[**locationExternalIdSearch**](LocationExternalIdApi.md#locationExternalIdSearch) | **GET** /v4/api/location-external-id | 
[**locationExternalIdUpdate**](LocationExternalIdApi.md#locationExternalIdUpdate) | **PUT** /v4/api/location-external-id/{id} | 

<a name="locationExternalIdCreate"></a>
# **locationExternalIdCreate**
> LocationExternalId locationExternalIdCreate(body)



Create a location external id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationExternalIdApi apiInstance = new LocationExternalIdApi();
LocationExternalIdCreate body = new LocationExternalIdCreate(); // LocationExternalIdCreate | 
try {
    LocationExternalId result = apiInstance.locationExternalIdCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationExternalIdApi#locationExternalIdCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationExternalIdCreate**](LocationExternalIdCreate.md)|  | [optional]

### Return type

[**LocationExternalId**](LocationExternalId.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="locationExternalIdDelete"></a>
# **locationExternalIdDelete**
> locationExternalIdDelete(id)



Remove a location external id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationExternalIdApi apiInstance = new LocationExternalIdApi();
String id = "id_example"; // String | 
try {
    apiInstance.locationExternalIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationExternalIdApi#locationExternalIdDelete");
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

<a name="locationExternalIdGet"></a>
# **locationExternalIdGet**
> LocationExternalId locationExternalIdGet(id)



Retrieve a location external id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationExternalIdApi apiInstance = new LocationExternalIdApi();
String id = "id_example"; // String | 
try {
    LocationExternalId result = apiInstance.locationExternalIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationExternalIdApi#locationExternalIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**LocationExternalId**](LocationExternalId.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationExternalIdSearch"></a>
# **locationExternalIdSearch**
> LocationExternalIdPaginationResponse locationExternalIdSearch(filter, query, page, perPage, sort)



Search location external ids.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationExternalIdApi apiInstance = new LocationExternalIdApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    LocationExternalIdPaginationResponse result = apiInstance.locationExternalIdSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationExternalIdApi#locationExternalIdSearch");
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

[**LocationExternalIdPaginationResponse**](LocationExternalIdPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationExternalIdUpdate"></a>
# **locationExternalIdUpdate**
> LocationExternalId locationExternalIdUpdate(id, body)



Update a location external id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationExternalIdApi apiInstance = new LocationExternalIdApi();
String id = "id_example"; // String | 
LocationExternalIdUpdate body = new LocationExternalIdUpdate(); // LocationExternalIdUpdate | 
try {
    LocationExternalId result = apiInstance.locationExternalIdUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationExternalIdApi#locationExternalIdUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**LocationExternalIdUpdate**](LocationExternalIdUpdate.md)|  | [optional]

### Return type

[**LocationExternalId**](LocationExternalId.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

