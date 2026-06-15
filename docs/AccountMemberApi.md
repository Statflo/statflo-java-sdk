# AccountMemberApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountMemberDelete**](AccountMemberApi.md#accountMemberDelete) | **DELETE** /v4/api/account-member/{id} | 
[**accountMemberGet**](AccountMemberApi.md#accountMemberGet) | **GET** /v4/api/account-member/{id} | 
[**accountMemberSearch**](AccountMemberApi.md#accountMemberSearch) | **GET** /v4/api/account-member | 
[**accountMemberUpdate**](AccountMemberApi.md#accountMemberUpdate) | **PUT** /v4/api/account-member/{id} | 
[**postV4ApiAccountMemberSearch**](AccountMemberApi.md#postV4ApiAccountMemberSearch) | **POST** /v4/api/account-member | 

<a name="accountMemberDelete"></a>
# **accountMemberDelete**
> accountMemberDelete(id)



Remove an account member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountMemberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountMemberApi apiInstance = new AccountMemberApi();
String id = "id_example"; // String | 
try {
    apiInstance.accountMemberDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMemberApi#accountMemberDelete");
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

<a name="accountMemberGet"></a>
# **accountMemberGet**
> AccountMember accountMemberGet(id)



Retrieve an account member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountMemberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountMemberApi apiInstance = new AccountMemberApi();
String id = "id_example"; // String | 
try {
    AccountMember result = apiInstance.accountMemberGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMemberApi#accountMemberGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**AccountMember**](AccountMember.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountMemberSearch"></a>
# **accountMemberSearch**
> AccountMemberPaginationResponse accountMemberSearch(filter, query, page, perPage, sort)



Search account members.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountMemberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountMemberApi apiInstance = new AccountMemberApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    AccountMemberPaginationResponse result = apiInstance.accountMemberSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMemberApi#accountMemberSearch");
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

[**AccountMemberPaginationResponse**](AccountMemberPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountMemberUpdate"></a>
# **accountMemberUpdate**
> AccountMember accountMemberUpdate(id, body)



Update an account member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountMemberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountMemberApi apiInstance = new AccountMemberApi();
String id = "id_example"; // String | 
AccountMemberUpdate body = new AccountMemberUpdate(); // AccountMemberUpdate | 
try {
    AccountMember result = apiInstance.accountMemberUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMemberApi#accountMemberUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**AccountMemberUpdate**](AccountMemberUpdate.md)|  | [optional]

### Return type

[**AccountMember**](AccountMember.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postV4ApiAccountMemberSearch"></a>
# **postV4ApiAccountMemberSearch**
> AccountMember postV4ApiAccountMemberSearch(body)



Create an account.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountMemberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountMemberApi apiInstance = new AccountMemberApi();
AccountMemberCreate body = new AccountMemberCreate(); // AccountMemberCreate | 
try {
    AccountMember result = apiInstance.postV4ApiAccountMemberSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMemberApi#postV4ApiAccountMemberSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountMemberCreate**](AccountMemberCreate.md)|  | [optional]

### Return type

[**AccountMember**](AccountMember.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

