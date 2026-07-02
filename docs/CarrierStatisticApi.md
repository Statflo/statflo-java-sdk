# CarrierStatisticApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**carrierStatisticDelete**](CarrierStatisticApi.md#carrierStatisticDelete) | **DELETE** /v4/api/carrier-statistic/{id} | 
[**carrierStatisticGet**](CarrierStatisticApi.md#carrierStatisticGet) | **GET** /v4/api/carrier-statistic/{id} | 
[**carrierStatisticSearch**](CarrierStatisticApi.md#carrierStatisticSearch) | **GET** /v4/api/carrier-statistic | 
[**carrierStatisticUpdate**](CarrierStatisticApi.md#carrierStatisticUpdate) | **PUT** /v4/api/carrier-statistic/{id} | 
[**postV4ApiCarrierStatisticSearch**](CarrierStatisticApi.md#postV4ApiCarrierStatisticSearch) | **POST** /v4/api/carrier-statistic | 

<a name="carrierStatisticDelete"></a>
# **carrierStatisticDelete**
> carrierStatisticDelete(id)



Remove carrier statistic.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CarrierStatisticApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CarrierStatisticApi apiInstance = new CarrierStatisticApi();
String id = "id_example"; // String | 
try {
    apiInstance.carrierStatisticDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierStatisticApi#carrierStatisticDelete");
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

<a name="carrierStatisticGet"></a>
# **carrierStatisticGet**
> CarrierStatistic carrierStatisticGet(id)



Retrieve carrier statistic.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CarrierStatisticApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CarrierStatisticApi apiInstance = new CarrierStatisticApi();
String id = "id_example"; // String | 
try {
    CarrierStatistic result = apiInstance.carrierStatisticGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierStatisticApi#carrierStatisticGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CarrierStatistic**](CarrierStatistic.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="carrierStatisticSearch"></a>
# **carrierStatisticSearch**
> CarrierStatisticPaginationResponse carrierStatisticSearch(filter, query, page, perPage, sort)



Search carrier statistic.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CarrierStatisticApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CarrierStatisticApi apiInstance = new CarrierStatisticApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    CarrierStatisticPaginationResponse result = apiInstance.carrierStatisticSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierStatisticApi#carrierStatisticSearch");
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

[**CarrierStatisticPaginationResponse**](CarrierStatisticPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="carrierStatisticUpdate"></a>
# **carrierStatisticUpdate**
> CarrierStatistic carrierStatisticUpdate(id, body)



Update carrier statistic.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CarrierStatisticApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CarrierStatisticApi apiInstance = new CarrierStatisticApi();
String id = "id_example"; // String | 
CarrierStatisticUpdate body = new CarrierStatisticUpdate(); // CarrierStatisticUpdate | 
try {
    CarrierStatistic result = apiInstance.carrierStatisticUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierStatisticApi#carrierStatisticUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**CarrierStatisticUpdate**](CarrierStatisticUpdate.md)|  | [optional]

### Return type

[**CarrierStatistic**](CarrierStatistic.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postV4ApiCarrierStatisticSearch"></a>
# **postV4ApiCarrierStatisticSearch**
> CarrierStatistic postV4ApiCarrierStatisticSearch(body)



Create carrier statistic.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CarrierStatisticApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CarrierStatisticApi apiInstance = new CarrierStatisticApi();
CarrierStatisticCreate body = new CarrierStatisticCreate(); // CarrierStatisticCreate | 
try {
    CarrierStatistic result = apiInstance.postV4ApiCarrierStatisticSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierStatisticApi#postV4ApiCarrierStatisticSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CarrierStatisticCreate**](CarrierStatisticCreate.md)|  | [optional]

### Return type

[**CarrierStatistic**](CarrierStatistic.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

