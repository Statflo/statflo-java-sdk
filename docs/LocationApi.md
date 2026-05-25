# LocationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationCreate**](LocationApi.md#locationCreate) | **POST** /v4/api/location | 
[**locationDelete**](LocationApi.md#locationDelete) | **DELETE** /v4/api/location/{id} | 
[**locationGet**](LocationApi.md#locationGet) | **GET** /v4/api/location/{id} | 
[**locationSearch**](LocationApi.md#locationSearch) | **GET** /v4/api/location | 
[**locationUpdate**](LocationApi.md#locationUpdate) | **PUT** /v4/api/location/{id} | 

<a name="locationCreate"></a>
# **locationCreate**
> Location locationCreate(body)



Create a location.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationApi apiInstance = new LocationApi();
LocationCreate body = new LocationCreate(); // LocationCreate | 
try {
    Location result = apiInstance.locationCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationCreate**](LocationCreate.md)|  | [optional]

### Return type

[**Location**](Location.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="locationDelete"></a>
# **locationDelete**
> locationDelete(id)



Remove a location.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationApi apiInstance = new LocationApi();
String id = "id_example"; // String | 
try {
    apiInstance.locationDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationDelete");
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

<a name="locationGet"></a>
# **locationGet**
> Location locationGet(id)



Retrieve a location.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationApi apiInstance = new LocationApi();
String id = "id_example"; // String | 
try {
    Location result = apiInstance.locationGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Location**](Location.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationSearch"></a>
# **locationSearch**
> LocationPaginationResponse locationSearch(filter, query, page, perPage, sort)



Search locations.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationApi apiInstance = new LocationApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    LocationPaginationResponse result = apiInstance.locationSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationSearch");
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

[**LocationPaginationResponse**](LocationPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationUpdate"></a>
# **locationUpdate**
> Location locationUpdate(id, body)



Update a location.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationApi apiInstance = new LocationApi();
String id = "id_example"; // String | 
LocationUpdate body = new LocationUpdate(); // LocationUpdate | 
try {
    Location result = apiInstance.locationUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**LocationUpdate**](LocationUpdate.md)|  | [optional]

### Return type

[**Location**](Location.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

