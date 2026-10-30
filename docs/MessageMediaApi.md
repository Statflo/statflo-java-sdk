# MessageMediaApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messageMediaCreate**](MessageMediaApi.md#messageMediaCreate) | **POST** /v4/api/message-media | 
[**messageMediaDelete**](MessageMediaApi.md#messageMediaDelete) | **DELETE** /v4/api/message-media/{id} | 
[**messageMediaGet**](MessageMediaApi.md#messageMediaGet) | **GET** /v4/api/message-media/{id} | 
[**messageMediaSearch**](MessageMediaApi.md#messageMediaSearch) | **GET** /v4/api/message-media | 
[**messageMediaUpdate**](MessageMediaApi.md#messageMediaUpdate) | **PUT** /v4/api/message-media/{id} | 

<a name="messageMediaCreate"></a>
# **messageMediaCreate**
> MessageMedia messageMediaCreate(body)



Create a message media.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageMediaApi apiInstance = new MessageMediaApi();
MessageMediaCreate body = new MessageMediaCreate(); // MessageMediaCreate | 
try {
    MessageMedia result = apiInstance.messageMediaCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageMediaApi#messageMediaCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MessageMediaCreate**](MessageMediaCreate.md)|  | [optional]

### Return type

[**MessageMedia**](MessageMedia.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageMediaDelete"></a>
# **messageMediaDelete**
> messageMediaDelete(id)



Remove a Message Media.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageMediaApi apiInstance = new MessageMediaApi();
String id = "id_example"; // String | 
try {
    apiInstance.messageMediaDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageMediaApi#messageMediaDelete");
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

<a name="messageMediaGet"></a>
# **messageMediaGet**
> MessageMedia messageMediaGet(id)



Retrieve message media.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageMediaApi apiInstance = new MessageMediaApi();
String id = "id_example"; // String | 
try {
    MessageMedia result = apiInstance.messageMediaGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageMediaApi#messageMediaGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**MessageMedia**](MessageMedia.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageMediaSearch"></a>
# **messageMediaSearch**
> MessageMediaPaginationResponse messageMediaSearch(filter, query, page, perPage, sort)



Search message media.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageMediaApi apiInstance = new MessageMediaApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    MessageMediaPaginationResponse result = apiInstance.messageMediaSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageMediaApi#messageMediaSearch");
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

[**MessageMediaPaginationResponse**](MessageMediaPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageMediaUpdate"></a>
# **messageMediaUpdate**
> MessageMedia messageMediaUpdate(id, body)



Update a message media.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageMediaApi apiInstance = new MessageMediaApi();
String id = "id_example"; // String | 
MessageMediaUpdate body = new MessageMediaUpdate(); // MessageMediaUpdate | 
try {
    MessageMedia result = apiInstance.messageMediaUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageMediaApi#messageMediaUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**MessageMediaUpdate**](MessageMediaUpdate.md)|  | [optional]

### Return type

[**MessageMedia**](MessageMedia.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

