# AdminAccountsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAccountUpdate**](AdminAccountsApi.md#adminAccountUpdate) | **PUT** /v4/api/admin/account/{id} | 

<a name="adminAccountUpdate"></a>
# **adminAccountUpdate**
> Account adminAccountUpdate(id, body)



Update an account as Admin.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AdminAccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AdminAccountsApi apiInstance = new AdminAccountsApi();
String id = "id_example"; // String | 
Account body = new Account(); // Account | 
try {
    Account result = apiInstance.adminAccountUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminAccountsApi#adminAccountUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**Account**](Account.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

