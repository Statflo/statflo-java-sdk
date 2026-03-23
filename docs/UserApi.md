# UserApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userDelete**](UserApi.md#userDelete) | **DELETE** /v4/api/user/{id} | 

<a name="userDelete"></a>
# **userDelete**
> userDelete(id)



Remove a user.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApi apiInstance = new UserApi();
String id = "id_example"; // String | 
try {
    apiInstance.userDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userDelete");
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

