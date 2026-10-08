# DealerExternalIdApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealerExternalIdCreate**](DealerExternalIdApi.md#dealerExternalIdCreate) | **POST** /v4/api/dealer-external-id | 
[**dealerExternalIdDelete**](DealerExternalIdApi.md#dealerExternalIdDelete) | **DELETE** /v4/api/dealer-external-id/{id} | 
[**dealerExternalIdGet**](DealerExternalIdApi.md#dealerExternalIdGet) | **GET** /v4/api/dealer-external-id/{id} | 
[**dealerExternalIdSearch**](DealerExternalIdApi.md#dealerExternalIdSearch) | **GET** /v4/api/dealer-external-id | 
[**dealerExternalIdUpdate**](DealerExternalIdApi.md#dealerExternalIdUpdate) | **PUT** /v4/api/dealer-external-id/{id} | 

<a name="dealerExternalIdCreate"></a>
# **dealerExternalIdCreate**
> DealerExternalId dealerExternalIdCreate(body)



Create a Dealer External id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerExternalIdApi apiInstance = new DealerExternalIdApi();
DealerExternalIdCreate body = new DealerExternalIdCreate(); // DealerExternalIdCreate | 
try {
    DealerExternalId result = apiInstance.dealerExternalIdCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerExternalIdApi#dealerExternalIdCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DealerExternalIdCreate**](DealerExternalIdCreate.md)|  | [optional]

### Return type

[**DealerExternalId**](DealerExternalId.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dealerExternalIdDelete"></a>
# **dealerExternalIdDelete**
> dealerExternalIdDelete(id)



Remove a Dealer External id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerExternalIdApi apiInstance = new DealerExternalIdApi();
String id = "id_example"; // String | 
try {
    apiInstance.dealerExternalIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerExternalIdApi#dealerExternalIdDelete");
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

<a name="dealerExternalIdGet"></a>
# **dealerExternalIdGet**
> DealerExternalId dealerExternalIdGet(id)



Retrieve a Dealer External id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerExternalIdApi apiInstance = new DealerExternalIdApi();
String id = "id_example"; // String | 
try {
    DealerExternalId result = apiInstance.dealerExternalIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerExternalIdApi#dealerExternalIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DealerExternalId**](DealerExternalId.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealerExternalIdSearch"></a>
# **dealerExternalIdSearch**
> DealerExternalIdPaginationResponse dealerExternalIdSearch(filter, query, page, perPage, sort)



Search Dealer External ids.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerExternalIdApi apiInstance = new DealerExternalIdApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    DealerExternalIdPaginationResponse result = apiInstance.dealerExternalIdSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerExternalIdApi#dealerExternalIdSearch");
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

[**DealerExternalIdPaginationResponse**](DealerExternalIdPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealerExternalIdUpdate"></a>
# **dealerExternalIdUpdate**
> DealerExternalId dealerExternalIdUpdate(id, body)



Update a Dealer External id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerExternalIdApi apiInstance = new DealerExternalIdApi();
String id = "id_example"; // String | 
DealerExternalIdUpdate body = new DealerExternalIdUpdate(); // DealerExternalIdUpdate | 
try {
    DealerExternalId result = apiInstance.dealerExternalIdUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerExternalIdApi#dealerExternalIdUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**DealerExternalIdUpdate**](DealerExternalIdUpdate.md)|  | [optional]

### Return type

[**DealerExternalId**](DealerExternalId.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

