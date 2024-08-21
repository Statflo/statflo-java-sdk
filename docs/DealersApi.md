# DealersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealerGet**](DealersApi.md#dealerGet) | **GET** /v4/api/dealer/{id} | 
[**dealerSearch**](DealersApi.md#dealerSearch) | **GET** /v4/api/dealer | 

<a name="dealerGet"></a>
# **dealerGet**
> Dealer dealerGet(id)



Retrieve a dealer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DealersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealersApi apiInstance = new DealersApi();
String id = "id_example"; // String | 
try {
    Dealer result = apiInstance.dealerGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealersApi#dealerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Dealer**](Dealer.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealerSearch"></a>
# **dealerSearch**
> DealerPaginationResponse dealerSearch(filter, query, page, perPage, sort)



Search dealers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DealersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealersApi apiInstance = new DealersApi();
List<String> filter = Arrays.asList("filter_example"); // List<String> | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    DealerPaginationResponse result = apiInstance.dealerSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealersApi#dealerSearch");
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

[**DealerPaginationResponse**](DealerPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

