# AccountApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountCreate**](AccountApi.md#accountCreate) | **POST** /v4/api/account | 
[**accountDelete**](AccountApi.md#accountDelete) | **DELETE** /v4/api/account/{id} | 
[**accountGet**](AccountApi.md#accountGet) | **GET** /v4/api/account/{id} | 
[**accountSearch**](AccountApi.md#accountSearch) | **GET** /v4/api/account | 
[**accountUpdate**](AccountApi.md#accountUpdate) | **PUT** /v4/api/account/{id} | 

<a name="accountCreate"></a>
# **accountCreate**
> Account accountCreate(body)



Create an account.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountApi apiInstance = new AccountApi();
AccountCreate body = new AccountCreate(); // AccountCreate | 
try {
    Account result = apiInstance.accountCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountCreate**](AccountCreate.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountDelete"></a>
# **accountDelete**
> accountDelete(id)



Remove an account.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | 
try {
    apiInstance.accountDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountDelete");
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

<a name="accountGet"></a>
# **accountGet**
> Account accountGet(id)



Retrieve an account.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | 
try {
    Account result = apiInstance.accountGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Account**](Account.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountSearch"></a>
# **accountSearch**
> AccountPaginationResponse accountSearch(filter, query, page, perPage, sort)



Search accounts.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountApi apiInstance = new AccountApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    AccountPaginationResponse result = apiInstance.accountSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountSearch");
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

[**AccountPaginationResponse**](AccountPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountUpdate"></a>
# **accountUpdate**
> Account accountUpdate(id, body)



Update an account.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | 
AccountUpdate body = new AccountUpdate(); // AccountUpdate | 
try {
    Account result = apiInstance.accountUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**AccountUpdate**](AccountUpdate.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

