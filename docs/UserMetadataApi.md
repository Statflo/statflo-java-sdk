# UserMetadataApi

All URIs are relative to *https://app.test.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userMetadataCreate**](UserMetadataApi.md#userMetadataCreate) | **POST** /v4/api/user-metadata | 
[**userMetadataDelete**](UserMetadataApi.md#userMetadataDelete) | **DELETE** /v4/api/user-metadata/{id} | 
[**userMetadataGet**](UserMetadataApi.md#userMetadataGet) | **GET** /v4/api/user-metadata/{id} | 
[**userMetadataSearch**](UserMetadataApi.md#userMetadataSearch) | **GET** /v4/api/user-metadata | 
[**userMetadataUpdate**](UserMetadataApi.md#userMetadataUpdate) | **PUT** /v4/api/user-metadata/{id} | 

<a name="userMetadataCreate"></a>
# **userMetadataCreate**
> UserMetadata userMetadataCreate(body)



Create a user metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserMetadataApi apiInstance = new UserMetadataApi();
UserMetadataCreate body = new UserMetadataCreate(); // UserMetadataCreate | 
try {
    UserMetadata result = apiInstance.userMetadataCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMetadataApi#userMetadataCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserMetadataCreate**](UserMetadataCreate.md)|  | [optional]

### Return type

[**UserMetadata**](UserMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userMetadataDelete"></a>
# **userMetadataDelete**
> userMetadataDelete(id)



Remove a user metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserMetadataApi apiInstance = new UserMetadataApi();
String id = "id_example"; // String | 
try {
    apiInstance.userMetadataDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMetadataApi#userMetadataDelete");
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

<a name="userMetadataGet"></a>
# **userMetadataGet**
> UserMetadata userMetadataGet(id)



Retrieve a user metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserMetadataApi apiInstance = new UserMetadataApi();
String id = "id_example"; // String | 
try {
    UserMetadata result = apiInstance.userMetadataGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMetadataApi#userMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**UserMetadata**](UserMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userMetadataSearch"></a>
# **userMetadataSearch**
> UserMetadataPaginationResponse userMetadataSearch(filter, query, page, perPage, sort)



Search user metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserMetadataApi apiInstance = new UserMetadataApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    UserMetadataPaginationResponse result = apiInstance.userMetadataSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMetadataApi#userMetadataSearch");
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

[**UserMetadataPaginationResponse**](UserMetadataPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userMetadataUpdate"></a>
# **userMetadataUpdate**
> UserMetadata userMetadataUpdate(id, body)



Update a user metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserMetadataApi apiInstance = new UserMetadataApi();
String id = "id_example"; // String | 
UserMetadataUpdate body = new UserMetadataUpdate(); // UserMetadataUpdate | 
try {
    UserMetadata result = apiInstance.userMetadataUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMetadataApi#userMetadataUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**UserMetadataUpdate**](UserMetadataUpdate.md)|  | [optional]

### Return type

[**UserMetadata**](UserMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

