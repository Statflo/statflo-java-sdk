# SmsActivityApi

All URIs are relative to *https://app.test.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smsActivityCreate**](SmsActivityApi.md#smsActivityCreate) | **POST** /v4/api/sms-activity | 
[**smsActivityDelete**](SmsActivityApi.md#smsActivityDelete) | **DELETE** /v4/api/sms-activity/{id} | 
[**smsActivityGet**](SmsActivityApi.md#smsActivityGet) | **GET** /v4/api/sms-activity/{id} | 
[**smsActivitySearch**](SmsActivityApi.md#smsActivitySearch) | **GET** /v4/api/sms-activity | 
[**smsActivityUpdate**](SmsActivityApi.md#smsActivityUpdate) | **PUT** /v4/api/sms-activity/{id} | 

<a name="smsActivityCreate"></a>
# **smsActivityCreate**
> SmsActivity smsActivityCreate(body)



Create sms activity

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.SmsActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SmsActivityApi apiInstance = new SmsActivityApi();
SmsActivityCreate body = new SmsActivityCreate(); // SmsActivityCreate | 
try {
    SmsActivity result = apiInstance.smsActivityCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsActivityApi#smsActivityCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmsActivityCreate**](SmsActivityCreate.md)|  | [optional]

### Return type

[**SmsActivity**](SmsActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsActivityDelete"></a>
# **smsActivityDelete**
> smsActivityDelete(id)



Remove an sms activity

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.SmsActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SmsActivityApi apiInstance = new SmsActivityApi();
String id = "id_example"; // String | 
try {
    apiInstance.smsActivityDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsActivityApi#smsActivityDelete");
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

<a name="smsActivityGet"></a>
# **smsActivityGet**
> SmsActivity smsActivityGet(id)



Retrieve an sms activity

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.SmsActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SmsActivityApi apiInstance = new SmsActivityApi();
String id = "id_example"; // String | 
try {
    SmsActivity result = apiInstance.smsActivityGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsActivityApi#smsActivityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SmsActivity**](SmsActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smsActivitySearch"></a>
# **smsActivitySearch**
> SmsActivityPaginationResponse smsActivitySearch(filter, query, page, perPage, sort)



Search sms activity

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.SmsActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SmsActivityApi apiInstance = new SmsActivityApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    SmsActivityPaginationResponse result = apiInstance.smsActivitySearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsActivityApi#smsActivitySearch");
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

[**SmsActivityPaginationResponse**](SmsActivityPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smsActivityUpdate"></a>
# **smsActivityUpdate**
> SmsActivity smsActivityUpdate(id, body)



Update an sms activity

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.SmsActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SmsActivityApi apiInstance = new SmsActivityApi();
String id = "id_example"; // String | 
SmsActivityUpdate body = new SmsActivityUpdate(); // SmsActivityUpdate | 
try {
    SmsActivity result = apiInstance.smsActivityUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsActivityApi#smsActivityUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**SmsActivityUpdate**](SmsActivityUpdate.md)|  | [optional]

### Return type

[**SmsActivity**](SmsActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

