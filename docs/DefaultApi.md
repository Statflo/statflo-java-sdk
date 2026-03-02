# DefaultApi

All URIs are relative to *https://app.test.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v4ApiConsentGet**](DefaultApi.md#v4ApiConsentGet) | **GET** /v4/api/consent | 
[**v4ApiConsentIdDelete**](DefaultApi.md#v4ApiConsentIdDelete) | **DELETE** /v4/api/consent/{id} | 
[**v4ApiConsentIdGet**](DefaultApi.md#v4ApiConsentIdGet) | **GET** /v4/api/consent/{id} | 
[**v4ApiConsentIdPut**](DefaultApi.md#v4ApiConsentIdPut) | **PUT** /v4/api/consent/{id} | 
[**v4ApiConsentPost**](DefaultApi.md#v4ApiConsentPost) | **POST** /v4/api/consent | 

<a name="v4ApiConsentGet"></a>
# **v4ApiConsentGet**
> v4ApiConsentGet()



### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.v4ApiConsentGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v4ApiConsentGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="v4ApiConsentIdDelete"></a>
# **v4ApiConsentIdDelete**
> v4ApiConsentIdDelete(id)



### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.v4ApiConsentIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v4ApiConsentIdDelete");
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
 - **Accept**: Not defined

<a name="v4ApiConsentIdGet"></a>
# **v4ApiConsentIdGet**
> v4ApiConsentIdGet(id)



### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.v4ApiConsentIdGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v4ApiConsentIdGet");
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
 - **Accept**: Not defined

<a name="v4ApiConsentIdPut"></a>
# **v4ApiConsentIdPut**
> v4ApiConsentIdPut(id)



### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.v4ApiConsentIdPut(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v4ApiConsentIdPut");
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
 - **Accept**: Not defined

<a name="v4ApiConsentPost"></a>
# **v4ApiConsentPost**
> v4ApiConsentPost()



### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.v4ApiConsentPost();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#v4ApiConsentPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

