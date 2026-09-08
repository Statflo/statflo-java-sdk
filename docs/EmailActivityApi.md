# EmailActivityApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailActivityCreate**](EmailActivityApi.md#emailActivityCreate) | **POST** /v4/api/email-activity | 
[**emailActivityDelete**](EmailActivityApi.md#emailActivityDelete) | **DELETE** /v4/api/email-activity/{id} | 
[**emailActivityGet**](EmailActivityApi.md#emailActivityGet) | **GET** /v4/api/email-activity/{id} | 
[**emailActivitySearch**](EmailActivityApi.md#emailActivitySearch) | **GET** /v4/api/email-activity | 
[**emailActivityUpdate**](EmailActivityApi.md#emailActivityUpdate) | **PUT** /v4/api/email-activity/{id} | 

<a name="emailActivityCreate"></a>
# **emailActivityCreate**
> EmailActivity emailActivityCreate(body)



Create email activity

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EmailActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EmailActivityApi apiInstance = new EmailActivityApi();
EmailActivityCreate body = new EmailActivityCreate(); // EmailActivityCreate | 
try {
    EmailActivity result = apiInstance.emailActivityCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailActivityApi#emailActivityCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailActivityCreate**](EmailActivityCreate.md)|  | [optional]

### Return type

[**EmailActivity**](EmailActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailActivityDelete"></a>
# **emailActivityDelete**
> emailActivityDelete(id)



Remove an email activity

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EmailActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EmailActivityApi apiInstance = new EmailActivityApi();
String id = "id_example"; // String | 
try {
    apiInstance.emailActivityDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailActivityApi#emailActivityDelete");
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

<a name="emailActivityGet"></a>
# **emailActivityGet**
> EmailActivity emailActivityGet(id)



Retrieve an email activity

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EmailActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EmailActivityApi apiInstance = new EmailActivityApi();
String id = "id_example"; // String | 
try {
    EmailActivity result = apiInstance.emailActivityGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailActivityApi#emailActivityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**EmailActivity**](EmailActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="emailActivitySearch"></a>
# **emailActivitySearch**
> EmailActivityPaginationResponse emailActivitySearch(filter, query, page, perPage, sort)



Search email activity

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EmailActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EmailActivityApi apiInstance = new EmailActivityApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    EmailActivityPaginationResponse result = apiInstance.emailActivitySearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailActivityApi#emailActivitySearch");
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

[**EmailActivityPaginationResponse**](EmailActivityPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="emailActivityUpdate"></a>
# **emailActivityUpdate**
> EmailActivity emailActivityUpdate(id, body)



Update an email activity

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EmailActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EmailActivityApi apiInstance = new EmailActivityApi();
String id = "id_example"; // String | 
EmailActivityUpdate body = new EmailActivityUpdate(); // EmailActivityUpdate | 
try {
    EmailActivity result = apiInstance.emailActivityUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailActivityApi#emailActivityUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**EmailActivityUpdate**](EmailActivityUpdate.md)|  | [optional]

### Return type

[**EmailActivity**](EmailActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

