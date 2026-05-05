# MessageDeliveryStatusApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messageDeliveryStatusCreate**](MessageDeliveryStatusApi.md#messageDeliveryStatusCreate) | **POST** /v4/api/message-delivery-status | 
[**messageDeliveryStatusDelete**](MessageDeliveryStatusApi.md#messageDeliveryStatusDelete) | **DELETE** /v4/api/message-delivery-status/{id} | 
[**messageDeliveryStatusGet**](MessageDeliveryStatusApi.md#messageDeliveryStatusGet) | **GET** /v4/api/message-delivery-status/{id} | 
[**messageDeliveryStatusSearch**](MessageDeliveryStatusApi.md#messageDeliveryStatusSearch) | **GET** /v4/api/message-delivery-status | 
[**messageDeliveryStatusUpdate**](MessageDeliveryStatusApi.md#messageDeliveryStatusUpdate) | **PUT** /v4/api/message-delivery-status/{id} | 

<a name="messageDeliveryStatusCreate"></a>
# **messageDeliveryStatusCreate**
> MessageDeliveryStatus messageDeliveryStatusCreate(body)



Create a message delivery status.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageDeliveryStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageDeliveryStatusApi apiInstance = new MessageDeliveryStatusApi();
MessageDeliveryStatusCreate body = new MessageDeliveryStatusCreate(); // MessageDeliveryStatusCreate | 
try {
    MessageDeliveryStatus result = apiInstance.messageDeliveryStatusCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageDeliveryStatusApi#messageDeliveryStatusCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MessageDeliveryStatusCreate**](MessageDeliveryStatusCreate.md)|  | [optional]

### Return type

[**MessageDeliveryStatus**](MessageDeliveryStatus.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageDeliveryStatusDelete"></a>
# **messageDeliveryStatusDelete**
> messageDeliveryStatusDelete(id)



Remove a Message Delivery Status.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageDeliveryStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageDeliveryStatusApi apiInstance = new MessageDeliveryStatusApi();
String id = "id_example"; // String | 
try {
    apiInstance.messageDeliveryStatusDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageDeliveryStatusApi#messageDeliveryStatusDelete");
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

<a name="messageDeliveryStatusGet"></a>
# **messageDeliveryStatusGet**
> MessageDeliveryStatus messageDeliveryStatusGet(id)



Retrieve message delivery status.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageDeliveryStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageDeliveryStatusApi apiInstance = new MessageDeliveryStatusApi();
String id = "id_example"; // String | 
try {
    MessageDeliveryStatus result = apiInstance.messageDeliveryStatusGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageDeliveryStatusApi#messageDeliveryStatusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**MessageDeliveryStatus**](MessageDeliveryStatus.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageDeliveryStatusSearch"></a>
# **messageDeliveryStatusSearch**
> MessageDeliveryStatusPaginationResponse messageDeliveryStatusSearch(filter, query, page, perPage, sort)



Search message delivery status.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageDeliveryStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageDeliveryStatusApi apiInstance = new MessageDeliveryStatusApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    MessageDeliveryStatusPaginationResponse result = apiInstance.messageDeliveryStatusSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageDeliveryStatusApi#messageDeliveryStatusSearch");
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

[**MessageDeliveryStatusPaginationResponse**](MessageDeliveryStatusPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageDeliveryStatusUpdate"></a>
# **messageDeliveryStatusUpdate**
> MessageDeliveryStatus messageDeliveryStatusUpdate(id, body)



Update a message delivery status.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageDeliveryStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageDeliveryStatusApi apiInstance = new MessageDeliveryStatusApi();
String id = "id_example"; // String | 
MessageDeliveryStatusUpdate body = new MessageDeliveryStatusUpdate(); // MessageDeliveryStatusUpdate | 
try {
    MessageDeliveryStatus result = apiInstance.messageDeliveryStatusUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageDeliveryStatusApi#messageDeliveryStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**MessageDeliveryStatusUpdate**](MessageDeliveryStatusUpdate.md)|  | [optional]

### Return type

[**MessageDeliveryStatus**](MessageDeliveryStatus.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

