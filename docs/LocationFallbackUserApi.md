# LocationFallbackUserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationFallbackUserCreate**](LocationFallbackUserApi.md#locationFallbackUserCreate) | **POST** /v4/api/location-fallback-user | 
[**locationFallbackUserDelete**](LocationFallbackUserApi.md#locationFallbackUserDelete) | **DELETE** /v4/api/location-fallback-user/{id} | 
[**locationFallbackUserGet**](LocationFallbackUserApi.md#locationFallbackUserGet) | **GET** /v4/api/location-fallback-user/{id} | 
[**locationFallbackUserSearch**](LocationFallbackUserApi.md#locationFallbackUserSearch) | **GET** /v4/api/location-fallback-user | 
[**locationFallbackUserUpdate**](LocationFallbackUserApi.md#locationFallbackUserUpdate) | **PUT** /v4/api/location-fallback-user/{id} | 

<a name="locationFallbackUserCreate"></a>
# **locationFallbackUserCreate**
> LocationFallbackUser locationFallbackUserCreate(body)



Create a location fallback user.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationFallbackUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationFallbackUserApi apiInstance = new LocationFallbackUserApi();
LocationFallbackUserCreate body = new LocationFallbackUserCreate(); // LocationFallbackUserCreate | 
try {
    LocationFallbackUser result = apiInstance.locationFallbackUserCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFallbackUserApi#locationFallbackUserCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationFallbackUserCreate**](LocationFallbackUserCreate.md)|  | [optional]

### Return type

[**LocationFallbackUser**](LocationFallbackUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="locationFallbackUserDelete"></a>
# **locationFallbackUserDelete**
> locationFallbackUserDelete(id)



Remove a location fallback user.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationFallbackUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationFallbackUserApi apiInstance = new LocationFallbackUserApi();
String id = "id_example"; // String | 
try {
    apiInstance.locationFallbackUserDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFallbackUserApi#locationFallbackUserDelete");
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

<a name="locationFallbackUserGet"></a>
# **locationFallbackUserGet**
> LocationFallbackUser locationFallbackUserGet(id)



Retrieve a location fallback user.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationFallbackUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationFallbackUserApi apiInstance = new LocationFallbackUserApi();
String id = "id_example"; // String | 
try {
    LocationFallbackUser result = apiInstance.locationFallbackUserGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFallbackUserApi#locationFallbackUserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**LocationFallbackUser**](LocationFallbackUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationFallbackUserSearch"></a>
# **locationFallbackUserSearch**
> LocationFallbackUserPaginationResponse locationFallbackUserSearch(filter, query, page, perPage, sort)



Search location fallback users.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationFallbackUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationFallbackUserApi apiInstance = new LocationFallbackUserApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    LocationFallbackUserPaginationResponse result = apiInstance.locationFallbackUserSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFallbackUserApi#locationFallbackUserSearch");
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

[**LocationFallbackUserPaginationResponse**](LocationFallbackUserPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationFallbackUserUpdate"></a>
# **locationFallbackUserUpdate**
> LocationFallbackUser locationFallbackUserUpdate(id, body)



Update a location fallback user.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationFallbackUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationFallbackUserApi apiInstance = new LocationFallbackUserApi();
String id = "id_example"; // String | 
LocationFallbackUserUpdate body = new LocationFallbackUserUpdate(); // LocationFallbackUserUpdate | 
try {
    LocationFallbackUser result = apiInstance.locationFallbackUserUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationFallbackUserApi#locationFallbackUserUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**LocationFallbackUserUpdate**](LocationFallbackUserUpdate.md)|  | [optional]

### Return type

[**LocationFallbackUser**](LocationFallbackUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

