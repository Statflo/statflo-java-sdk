# LocationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationGet**](LocationsApi.md#locationGet) | **GET** /v4/api/outlet/{id} | 
[**locationGet_0**](LocationsApi.md#locationGet_0) | **GET** /v4/api/location/{id} | 
[**locationSearch**](LocationsApi.md#locationSearch) | **GET** /v4/api/outlet | 
[**locationSearch_0**](LocationsApi.md#locationSearch_0) | **GET** /v4/api/location | 

<a name="locationGet"></a>
# **locationGet**
> Location locationGet(id)



Retrieve a location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationsApi apiInstance = new LocationsApi();
String id = "id_example"; // String | 
try {
    Location result = apiInstance.locationGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#locationGet");
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

<a name="locationGet_0"></a>
# **locationGet_0**
> Location locationGet_0(id)



Retrieve a location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationsApi apiInstance = new LocationsApi();
String id = "id_example"; // String | 
try {
    Location result = apiInstance.locationGet_0(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#locationGet_0");
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
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationsApi apiInstance = new LocationsApi();
List<String> filter = Arrays.asList("filter_example"); // List<String> | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    LocationPaginationResponse result = apiInstance.locationSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#locationSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**List&lt;String&gt;**](String.md)|  | [optional]
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

<a name="locationSearch_0"></a>
# **locationSearch_0**
> LocationPaginationResponse locationSearch_0(filter, query, page, perPage, sort)



Search locations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationsApi apiInstance = new LocationsApi();
List<String> filter = Arrays.asList("filter_example"); // List<String> | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    LocationPaginationResponse result = apiInstance.locationSearch_0(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#locationSearch_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**List&lt;String&gt;**](String.md)|  | [optional]
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
