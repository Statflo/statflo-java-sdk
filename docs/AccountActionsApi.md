# AccountActionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountActionCreate**](AccountActionsApi.md#accountActionCreate) | **POST** /v4/api/account-action | 
[**accountActionGet**](AccountActionsApi.md#accountActionGet) | **GET** /v4/api/account-action/{id} | 
[**accountActionSearch**](AccountActionsApi.md#accountActionSearch) | **GET** /v4/api/account-action | 
[**accountActionUpdate**](AccountActionsApi.md#accountActionUpdate) | **PUT** /v4/api/account-action/{id} | 

<a name="accountActionCreate"></a>
# **accountActionCreate**
> AccountAction accountActionCreate(body)



Create account action

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountActionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountActionsApi apiInstance = new AccountActionsApi();
AccountActionCreate body = new AccountActionCreate(); // AccountActionCreate | 
try {
    AccountAction result = apiInstance.accountActionCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#accountActionCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountActionCreate**](AccountActionCreate.md)|  | [optional]

### Return type

[**AccountAction**](AccountAction.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountActionGet"></a>
# **accountActionGet**
> AccountAction accountActionGet(id)



Retrieve an account action

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountActionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountActionsApi apiInstance = new AccountActionsApi();
String id = "id_example"; // String | 
try {
    AccountAction result = apiInstance.accountActionGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#accountActionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**AccountAction**](AccountAction.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountActionSearch"></a>
# **accountActionSearch**
> AccountActionPaginationResponse accountActionSearch(filter, query, page, perPage, sort)



Search account actions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountActionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountActionsApi apiInstance = new AccountActionsApi();
List<String> filter = Arrays.asList("filter_example"); // List<String> | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    AccountActionPaginationResponse result = apiInstance.accountActionSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#accountActionSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **query** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**AccountActionPaginationResponse**](AccountActionPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountActionUpdate"></a>
# **accountActionUpdate**
> AccountAction accountActionUpdate(id, body)



Update an account action.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountActionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountActionsApi apiInstance = new AccountActionsApi();
String id = "id_example"; // String | 
AccountActionUpdate body = new AccountActionUpdate(); // AccountActionUpdate | 
try {
    AccountAction result = apiInstance.accountActionUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#accountActionUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**AccountActionUpdate**](AccountActionUpdate.md)|  | [optional]

### Return type

[**AccountAction**](AccountAction.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
