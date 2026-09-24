# ContactActionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactActionCreate**](ContactActionApi.md#contactActionCreate) | **POST** /v4/api/contact-action | 
[**contactActionDelete**](ContactActionApi.md#contactActionDelete) | **DELETE** /v4/api/contact-action/{id} | 
[**contactActionGet**](ContactActionApi.md#contactActionGet) | **GET** /v4/api/contact-action/{id} | 
[**contactActionSearch**](ContactActionApi.md#contactActionSearch) | **GET** /v4/api/contact-action | 
[**contactActionUpdate**](ContactActionApi.md#contactActionUpdate) | **PUT** /v4/api/contact-action/{id} | 

<a name="contactActionCreate"></a>
# **contactActionCreate**
> ContactAction contactActionCreate(body)



Create a contact action.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactActionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactActionApi apiInstance = new ContactActionApi();
ContactActionCreate body = new ContactActionCreate(); // ContactActionCreate | 
try {
    ContactAction result = apiInstance.contactActionCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactActionApi#contactActionCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactActionCreate**](ContactActionCreate.md)|  | [optional]

### Return type

[**ContactAction**](ContactAction.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactActionDelete"></a>
# **contactActionDelete**
> contactActionDelete(id)



Remove a contact action.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactActionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactActionApi apiInstance = new ContactActionApi();
String id = "id_example"; // String | 
try {
    apiInstance.contactActionDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactActionApi#contactActionDelete");
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

<a name="contactActionGet"></a>
# **contactActionGet**
> ContactAction contactActionGet(id)



Retrieve a contact action.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactActionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactActionApi apiInstance = new ContactActionApi();
String id = "id_example"; // String | 
try {
    ContactAction result = apiInstance.contactActionGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactActionApi#contactActionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ContactAction**](ContactAction.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contactActionSearch"></a>
# **contactActionSearch**
> ContactActionPaginationResponse contactActionSearch(filter, query, page, perPage, sort)



Search contact actions.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactActionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactActionApi apiInstance = new ContactActionApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ContactActionPaginationResponse result = apiInstance.contactActionSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactActionApi#contactActionSearch");
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

[**ContactActionPaginationResponse**](ContactActionPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contactActionUpdate"></a>
# **contactActionUpdate**
> ContactAction contactActionUpdate(id, body)



Update a contact action.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactActionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactActionApi apiInstance = new ContactActionApi();
String id = "id_example"; // String | 
ContactActionUpdate body = new ContactActionUpdate(); // ContactActionUpdate | 
try {
    ContactAction result = apiInstance.contactActionUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactActionApi#contactActionUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**ContactActionUpdate**](ContactActionUpdate.md)|  | [optional]

### Return type

[**ContactAction**](ContactAction.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

