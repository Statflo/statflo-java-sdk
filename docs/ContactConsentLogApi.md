# ContactConsentLogApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactConsentLogCreate**](ContactConsentLogApi.md#contactConsentLogCreate) | **POST** /v4/api/contact-consent-log | 
[**contactConsentLogDelete**](ContactConsentLogApi.md#contactConsentLogDelete) | **DELETE** /v4/api/contact-consent-log/{id} | 
[**contactConsentLogGet**](ContactConsentLogApi.md#contactConsentLogGet) | **GET** /v4/api/contact-consent-log/{id} | 
[**contactConsentLogSearch**](ContactConsentLogApi.md#contactConsentLogSearch) | **GET** /v4/api/contact-consent-log | 
[**contactConsentLogUpdate**](ContactConsentLogApi.md#contactConsentLogUpdate) | **PUT** /v4/api/contact-consent-log/{id} | 

<a name="contactConsentLogCreate"></a>
# **contactConsentLogCreate**
> ContactConsentLog contactConsentLogCreate(body)



Create contact consent log.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactConsentLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactConsentLogApi apiInstance = new ContactConsentLogApi();
ContactConsentLogCreate body = new ContactConsentLogCreate(); // ContactConsentLogCreate | 
try {
    ContactConsentLog result = apiInstance.contactConsentLogCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactConsentLogApi#contactConsentLogCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactConsentLogCreate**](ContactConsentLogCreate.md)|  | [optional]

### Return type

[**ContactConsentLog**](ContactConsentLog.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactConsentLogDelete"></a>
# **contactConsentLogDelete**
> contactConsentLogDelete(id)



Remove contact consent log.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactConsentLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactConsentLogApi apiInstance = new ContactConsentLogApi();
String id = "id_example"; // String | 
try {
    apiInstance.contactConsentLogDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactConsentLogApi#contactConsentLogDelete");
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

<a name="contactConsentLogGet"></a>
# **contactConsentLogGet**
> ContactConsentLog contactConsentLogGet(id)



Retrieve contact consent log.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactConsentLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactConsentLogApi apiInstance = new ContactConsentLogApi();
String id = "id_example"; // String | 
try {
    ContactConsentLog result = apiInstance.contactConsentLogGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactConsentLogApi#contactConsentLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ContactConsentLog**](ContactConsentLog.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contactConsentLogSearch"></a>
# **contactConsentLogSearch**
> ContactConsentLogPaginationResponse contactConsentLogSearch(filter, query, page, perPage, sort)



Search contact consent logs.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactConsentLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactConsentLogApi apiInstance = new ContactConsentLogApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ContactConsentLogPaginationResponse result = apiInstance.contactConsentLogSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactConsentLogApi#contactConsentLogSearch");
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

[**ContactConsentLogPaginationResponse**](ContactConsentLogPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contactConsentLogUpdate"></a>
# **contactConsentLogUpdate**
> ContactConsentLog contactConsentLogUpdate(id, body)



Update contact consent log.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactConsentLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactConsentLogApi apiInstance = new ContactConsentLogApi();
String id = "id_example"; // String | 
ContactConsentLogUpdate body = new ContactConsentLogUpdate(); // ContactConsentLogUpdate | 
try {
    ContactConsentLog result = apiInstance.contactConsentLogUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactConsentLogApi#contactConsentLogUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**ContactConsentLogUpdate**](ContactConsentLogUpdate.md)|  | [optional]

### Return type

[**ContactConsentLog**](ContactConsentLog.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

