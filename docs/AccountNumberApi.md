# AccountNumberApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountNumberGet**](AccountNumberApi.md#accountNumberGet) | **GET** /v4/api/account-number/{id} | 
[**accountNumberSearch**](AccountNumberApi.md#accountNumberSearch) | **GET** /v4/api/account-number | 

<a name="accountNumberGet"></a>
# **accountNumberGet**
> AccountNumber accountNumberGet(id)



Retrieve a message template.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountNumberApi apiInstance = new AccountNumberApi();
String id = "id_example"; // String | 
try {
    AccountNumber result = apiInstance.accountNumberGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountNumberApi#accountNumberGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**AccountNumber**](AccountNumber.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountNumberSearch"></a>
# **accountNumberSearch**
> AccountNumberPaginationResponse accountNumberSearch(filter, query, page, perPage, sort)



Search Account Number.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountNumberApi apiInstance = new AccountNumberApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    AccountNumberPaginationResponse result = apiInstance.accountNumberSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountNumberApi#accountNumberSearch");
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

[**AccountNumberPaginationResponse**](AccountNumberPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

