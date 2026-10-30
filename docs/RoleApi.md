# RoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**roleCreate**](RoleApi.md#roleCreate) | **POST** /v4/api/role | 
[**roleDelete**](RoleApi.md#roleDelete) | **DELETE** /v4/api/role/{id} | 
[**roleGet**](RoleApi.md#roleGet) | **GET** /v4/api/role/{id} | 
[**roleSearch**](RoleApi.md#roleSearch) | **GET** /v4/api/role | 
[**roleUpdate**](RoleApi.md#roleUpdate) | **PUT** /v4/api/role/{id} | 

<a name="roleCreate"></a>
# **roleCreate**
> Role roleCreate(body)



Create a role.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleApi apiInstance = new RoleApi();
RoleCreate body = new RoleCreate(); // RoleCreate | 
try {
    Role result = apiInstance.roleCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleCreate**](RoleCreate.md)|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="roleDelete"></a>
# **roleDelete**
> roleDelete(id)



Remove a role.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | 
try {
    apiInstance.roleDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleDelete");
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

<a name="roleGet"></a>
# **roleGet**
> Role roleGet(id)



Retrieve a role.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | 
try {
    Role result = apiInstance.roleGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Role**](Role.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="roleSearch"></a>
# **roleSearch**
> RolePaginationResponse roleSearch(filter, query, page, perPage, sort)



Search roles.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleApi apiInstance = new RoleApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    RolePaginationResponse result = apiInstance.roleSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleSearch");
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

[**RolePaginationResponse**](RolePaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="roleUpdate"></a>
# **roleUpdate**
> Role roleUpdate(id, body)



Update a role.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | 
RoleUpdate body = new RoleUpdate(); // RoleUpdate | 
try {
    Role result = apiInstance.roleUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**RoleUpdate**](RoleUpdate.md)|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

