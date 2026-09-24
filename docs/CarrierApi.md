# CarrierApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**carrierGet**](CarrierApi.md#carrierGet) | **GET** /v4/api/carrier/{id} | 
[**carrierSearch**](CarrierApi.md#carrierSearch) | **GET** /v4/api/carrier | 

<a name="carrierGet"></a>
# **carrierGet**
> Carrier carrierGet(id)



Retrieve a carrier.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CarrierApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CarrierApi apiInstance = new CarrierApi();
String id = "id_example"; // String | 
try {
    Carrier result = apiInstance.carrierGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierApi#carrierGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Carrier**](Carrier.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="carrierSearch"></a>
# **carrierSearch**
> CarrierPaginationResponse carrierSearch(filter, query, page, perPage, sort)



Search carriers.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CarrierApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CarrierApi apiInstance = new CarrierApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    CarrierPaginationResponse result = apiInstance.carrierSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarrierApi#carrierSearch");
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

[**CarrierPaginationResponse**](CarrierPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

