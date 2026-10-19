# InStoreActivityApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inStoreActivityCreate**](InStoreActivityApi.md#inStoreActivityCreate) | **POST** /v4/api/in-store-activity | 
[**inStoreActivityDelete**](InStoreActivityApi.md#inStoreActivityDelete) | **DELETE** /v4/api/in-store-activity/{id} | 
[**inStoreActivityGet**](InStoreActivityApi.md#inStoreActivityGet) | **GET** /v4/api/in-store-activity/{id} | 
[**inStoreActivitySearch**](InStoreActivityApi.md#inStoreActivitySearch) | **GET** /v4/api/in-store-activity | 
[**inStoreActivityUpdate**](InStoreActivityApi.md#inStoreActivityUpdate) | **PUT** /v4/api/in-store-activity/{id} | 

<a name="inStoreActivityCreate"></a>
# **inStoreActivityCreate**
> InStoreActivity inStoreActivityCreate(body)



Create an in-store activity.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.InStoreActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InStoreActivityApi apiInstance = new InStoreActivityApi();
InStoreActivityCreate body = new InStoreActivityCreate(); // InStoreActivityCreate | 
try {
    InStoreActivity result = apiInstance.inStoreActivityCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InStoreActivityApi#inStoreActivityCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InStoreActivityCreate**](InStoreActivityCreate.md)|  | [optional]

### Return type

[**InStoreActivity**](InStoreActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inStoreActivityDelete"></a>
# **inStoreActivityDelete**
> inStoreActivityDelete(id)



Remove an in-store activity.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.InStoreActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InStoreActivityApi apiInstance = new InStoreActivityApi();
String id = "id_example"; // String | 
try {
    apiInstance.inStoreActivityDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InStoreActivityApi#inStoreActivityDelete");
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

<a name="inStoreActivityGet"></a>
# **inStoreActivityGet**
> InStoreActivity inStoreActivityGet(id)



Retrieve an in-store activity.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.InStoreActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InStoreActivityApi apiInstance = new InStoreActivityApi();
String id = "id_example"; // String | 
try {
    InStoreActivity result = apiInstance.inStoreActivityGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InStoreActivityApi#inStoreActivityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**InStoreActivity**](InStoreActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="inStoreActivitySearch"></a>
# **inStoreActivitySearch**
> InStoreActivityPaginationResponse inStoreActivitySearch(filter, query, page, perPage, sort)



Search in-store activities.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.InStoreActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InStoreActivityApi apiInstance = new InStoreActivityApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    InStoreActivityPaginationResponse result = apiInstance.inStoreActivitySearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InStoreActivityApi#inStoreActivitySearch");
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

[**InStoreActivityPaginationResponse**](InStoreActivityPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="inStoreActivityUpdate"></a>
# **inStoreActivityUpdate**
> InStoreActivity inStoreActivityUpdate(id, body)



Update an in-store activity.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.InStoreActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InStoreActivityApi apiInstance = new InStoreActivityApi();
String id = "id_example"; // String | 
InStoreActivityUpdate body = new InStoreActivityUpdate(); // InStoreActivityUpdate | 
try {
    InStoreActivity result = apiInstance.inStoreActivityUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InStoreActivityApi#inStoreActivityUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**InStoreActivityUpdate**](InStoreActivityUpdate.md)|  | [optional]

### Return type

[**InStoreActivity**](InStoreActivity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

