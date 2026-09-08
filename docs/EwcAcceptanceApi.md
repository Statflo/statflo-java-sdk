# EwcAcceptanceApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ewcAcceptanceCreate**](EwcAcceptanceApi.md#ewcAcceptanceCreate) | **POST** /v4/api/ewc-acceptance | 
[**ewcAcceptanceDelete**](EwcAcceptanceApi.md#ewcAcceptanceDelete) | **DELETE** /v4/api/ewc-acceptance/{id} | 
[**ewcAcceptanceGet**](EwcAcceptanceApi.md#ewcAcceptanceGet) | **GET** /v4/api/ewc-acceptance/{id} | 
[**ewcAcceptanceSearch**](EwcAcceptanceApi.md#ewcAcceptanceSearch) | **GET** /v4/api/ewc-acceptance | 
[**ewcAcceptanceUpdate**](EwcAcceptanceApi.md#ewcAcceptanceUpdate) | **PUT** /v4/api/ewc-acceptance/{id} | 

<a name="ewcAcceptanceCreate"></a>
# **ewcAcceptanceCreate**
> EwcAcceptance ewcAcceptanceCreate(body)



Create EWC acceptance

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EwcAcceptanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EwcAcceptanceApi apiInstance = new EwcAcceptanceApi();
EwcAcceptanceCreate body = new EwcAcceptanceCreate(); // EwcAcceptanceCreate | 
try {
    EwcAcceptance result = apiInstance.ewcAcceptanceCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EwcAcceptanceApi#ewcAcceptanceCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EwcAcceptanceCreate**](EwcAcceptanceCreate.md)|  | [optional]

### Return type

[**EwcAcceptance**](EwcAcceptance.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ewcAcceptanceDelete"></a>
# **ewcAcceptanceDelete**
> ewcAcceptanceDelete(id)



Remove an EWC acceptance

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EwcAcceptanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EwcAcceptanceApi apiInstance = new EwcAcceptanceApi();
String id = "id_example"; // String | 
try {
    apiInstance.ewcAcceptanceDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling EwcAcceptanceApi#ewcAcceptanceDelete");
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

<a name="ewcAcceptanceGet"></a>
# **ewcAcceptanceGet**
> EwcAcceptance ewcAcceptanceGet(id)



Retrieve an EWC acceptance

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EwcAcceptanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EwcAcceptanceApi apiInstance = new EwcAcceptanceApi();
String id = "id_example"; // String | 
try {
    EwcAcceptance result = apiInstance.ewcAcceptanceGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EwcAcceptanceApi#ewcAcceptanceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**EwcAcceptance**](EwcAcceptance.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ewcAcceptanceSearch"></a>
# **ewcAcceptanceSearch**
> EwcAcceptancePaginationResponse ewcAcceptanceSearch(filter, query, page, perPage, sort)



Search EWC acceptance

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EwcAcceptanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EwcAcceptanceApi apiInstance = new EwcAcceptanceApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    EwcAcceptancePaginationResponse result = apiInstance.ewcAcceptanceSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EwcAcceptanceApi#ewcAcceptanceSearch");
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

[**EwcAcceptancePaginationResponse**](EwcAcceptancePaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ewcAcceptanceUpdate"></a>
# **ewcAcceptanceUpdate**
> EwcAcceptance ewcAcceptanceUpdate(id, body)



Update an EWC acceptance

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EwcAcceptanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EwcAcceptanceApi apiInstance = new EwcAcceptanceApi();
String id = "id_example"; // String | 
EwcAcceptanceUpdate body = new EwcAcceptanceUpdate(); // EwcAcceptanceUpdate | 
try {
    EwcAcceptance result = apiInstance.ewcAcceptanceUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EwcAcceptanceApi#ewcAcceptanceUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**EwcAcceptanceUpdate**](EwcAcceptanceUpdate.md)|  | [optional]

### Return type

[**EwcAcceptance**](EwcAcceptance.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

