# MessageTemplateApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messageTemplateCreate**](MessageTemplateApi.md#messageTemplateCreate) | **POST** /v4/api/message-template | 
[**messageTemplateDelete**](MessageTemplateApi.md#messageTemplateDelete) | **DELETE** /v4/api/message-template/{id} | 
[**messageTemplateGet**](MessageTemplateApi.md#messageTemplateGet) | **GET** /v4/api/message-template/{id} | 
[**messageTemplateSearch**](MessageTemplateApi.md#messageTemplateSearch) | **GET** /v4/api/message-template | 
[**messageTemplateUpdate**](MessageTemplateApi.md#messageTemplateUpdate) | **PUT** /v4/api/message-template/{id} | 

<a name="messageTemplateCreate"></a>
# **messageTemplateCreate**
> MessageTemplate messageTemplateCreate(body)



Create an message template.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageTemplateApi apiInstance = new MessageTemplateApi();
MessageTemplateCreate body = new MessageTemplateCreate(); // MessageTemplateCreate | 
try {
    MessageTemplate result = apiInstance.messageTemplateCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateApi#messageTemplateCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MessageTemplateCreate**](MessageTemplateCreate.md)|  | [optional]

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageTemplateDelete"></a>
# **messageTemplateDelete**
> messageTemplateDelete(id)



Remove an message template.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageTemplateApi apiInstance = new MessageTemplateApi();
String id = "id_example"; // String | 
try {
    apiInstance.messageTemplateDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateApi#messageTemplateDelete");
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

<a name="messageTemplateGet"></a>
# **messageTemplateGet**
> MessageTemplate messageTemplateGet(id)



Retrieve an message template.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageTemplateApi apiInstance = new MessageTemplateApi();
String id = "id_example"; // String | 
try {
    MessageTemplate result = apiInstance.messageTemplateGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateApi#messageTemplateGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageTemplateSearch"></a>
# **messageTemplateSearch**
> MessageTemplatePaginationResponse messageTemplateSearch(filter, query, page, perPage, sort)



Search message templates.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageTemplateApi apiInstance = new MessageTemplateApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    MessageTemplatePaginationResponse result = apiInstance.messageTemplateSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateApi#messageTemplateSearch");
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

[**MessageTemplatePaginationResponse**](MessageTemplatePaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageTemplateUpdate"></a>
# **messageTemplateUpdate**
> MessageTemplate messageTemplateUpdate(id, body)



Update an message template.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessageTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessageTemplateApi apiInstance = new MessageTemplateApi();
String id = "id_example"; // String | 
MessageTemplateUpdate body = new MessageTemplateUpdate(); // MessageTemplateUpdate | 
try {
    MessageTemplate result = apiInstance.messageTemplateUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateApi#messageTemplateUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**MessageTemplateUpdate**](MessageTemplateUpdate.md)|  | [optional]

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

