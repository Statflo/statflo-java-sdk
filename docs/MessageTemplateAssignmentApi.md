# MessageTemplateAssignmentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messageTemplateAssignmentCreate**](MessageTemplateAssignmentApi.md#messageTemplateAssignmentCreate) | **POST** /v4/api/message-template-assignment | 
[**messageTemplateAssignmentDelete**](MessageTemplateAssignmentApi.md#messageTemplateAssignmentDelete) | **DELETE** /v4/api/message-template-assignment/{id} | 
[**messageTemplateAssignmentGet**](MessageTemplateAssignmentApi.md#messageTemplateAssignmentGet) | **GET** /v4/api/message-template-assignment/{id} | 
[**messageTemplateAssignmentSearch**](MessageTemplateAssignmentApi.md#messageTemplateAssignmentSearch) | **GET** /v4/api/message-template-assignment | 
[**messageTemplateAssignmentUpdate**](MessageTemplateAssignmentApi.md#messageTemplateAssignmentUpdate) | **PUT** /v4/api/message-template-assignment/{id} | 

<a name="messageTemplateAssignmentCreate"></a>
# **messageTemplateAssignmentCreate**
> MessageTemplateAssignment messageTemplateAssignmentCreate(body)



Create a message template assignment.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageTemplateAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageTemplateAssignmentApi apiInstance = new MessageTemplateAssignmentApi();
MessageTemplateAssignmentCreate body = new MessageTemplateAssignmentCreate(); // MessageTemplateAssignmentCreate | 
try {
    MessageTemplateAssignment result = apiInstance.messageTemplateAssignmentCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateAssignmentApi#messageTemplateAssignmentCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MessageTemplateAssignmentCreate**](MessageTemplateAssignmentCreate.md)|  | [optional]

### Return type

[**MessageTemplateAssignment**](MessageTemplateAssignment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageTemplateAssignmentDelete"></a>
# **messageTemplateAssignmentDelete**
> messageTemplateAssignmentDelete(id)



Remove a message template assignment.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageTemplateAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageTemplateAssignmentApi apiInstance = new MessageTemplateAssignmentApi();
String id = "id_example"; // String | 
try {
    apiInstance.messageTemplateAssignmentDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateAssignmentApi#messageTemplateAssignmentDelete");
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

<a name="messageTemplateAssignmentGet"></a>
# **messageTemplateAssignmentGet**
> MessageTemplateAssignment messageTemplateAssignmentGet(id)



Retrieve a message template assignment.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageTemplateAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageTemplateAssignmentApi apiInstance = new MessageTemplateAssignmentApi();
String id = "id_example"; // String | 
try {
    MessageTemplateAssignment result = apiInstance.messageTemplateAssignmentGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateAssignmentApi#messageTemplateAssignmentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**MessageTemplateAssignment**](MessageTemplateAssignment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageTemplateAssignmentSearch"></a>
# **messageTemplateAssignmentSearch**
> MessageTemplateAssignmentPaginationResponse messageTemplateAssignmentSearch(filter, query, page, perPage, sort)



Search message template assignments.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageTemplateAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageTemplateAssignmentApi apiInstance = new MessageTemplateAssignmentApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    MessageTemplateAssignmentPaginationResponse result = apiInstance.messageTemplateAssignmentSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateAssignmentApi#messageTemplateAssignmentSearch");
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

[**MessageTemplateAssignmentPaginationResponse**](MessageTemplateAssignmentPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageTemplateAssignmentUpdate"></a>
# **messageTemplateAssignmentUpdate**
> MessageTemplateAssignment messageTemplateAssignmentUpdate(id, body)



Update a message template Assignment.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageTemplateAssignmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageTemplateAssignmentApi apiInstance = new MessageTemplateAssignmentApi();
String id = "id_example"; // String | 
MessageTemplateAssignmentUpdate body = new MessageTemplateAssignmentUpdate(); // MessageTemplateAssignmentUpdate | 
try {
    MessageTemplateAssignment result = apiInstance.messageTemplateAssignmentUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateAssignmentApi#messageTemplateAssignmentUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**MessageTemplateAssignmentUpdate**](MessageTemplateAssignmentUpdate.md)|  | [optional]

### Return type

[**MessageTemplateAssignment**](MessageTemplateAssignment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

