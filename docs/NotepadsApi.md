# NotepadsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notepadGet**](NotepadsApi.md#notepadGet) | **GET** /v4/api/notepad/{id} | 
[**notepadGetLatest**](NotepadsApi.md#notepadGetLatest) | **GET** /v4/api/notepad/latest/{accountId} | 
[**notepadGetLatest_0**](NotepadsApi.md#notepadGetLatest_0) | **GET** /v4/api/crm/message/notepad/latest/{accountId} | 
[**notepadSearch**](NotepadsApi.md#notepadSearch) | **GET** /v4/api/notepad | 
[**notepadSearch_0**](NotepadsApi.md#notepadSearch_0) | **POST** /v4/api/notepad | 
[**notepadSearch_1**](NotepadsApi.md#notepadSearch_1) | **POST** /v4/api/crm/message | 
[**notepadUpdate**](NotepadsApi.md#notepadUpdate) | **PUT** /v4/api/notepad/{id} | 

<a name="notepadGet"></a>
# **notepadGet**
> Notepad notepadGet(id)



Retrieve a notepad.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
String id = "id_example"; // String | 
try {
    Notepad result = apiInstance.notepadGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Notepad**](Notepad.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notepadGetLatest"></a>
# **notepadGetLatest**
> Notepad notepadGetLatest(accountId)



Retrieve the latest notepad for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
String accountId = "accountId_example"; // String | 
try {
    Notepad result = apiInstance.notepadGetLatest(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadGetLatest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |

### Return type

[**Notepad**](Notepad.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notepadGetLatest_0"></a>
# **notepadGetLatest_0**
> Notepad notepadGetLatest_0(accountId)



Retrieve the latest notepad for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
String accountId = "accountId_example"; // String | 
try {
    Notepad result = apiInstance.notepadGetLatest_0(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadGetLatest_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |

### Return type

[**Notepad**](Notepad.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notepadSearch"></a>
# **notepadSearch**
> NotepadPaginationResponse notepadSearch(filter, query, page, perPage, sort)



Search notepads.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
List<String> filter = Arrays.asList("filter_example"); // List<String> | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    NotepadPaginationResponse result = apiInstance.notepadSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadSearch");
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

[**NotepadPaginationResponse**](NotepadPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notepadSearch_0"></a>
# **notepadSearch_0**
> Notepad notepadSearch_0(body)



Create a notepad.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
NotepadCreate body = new NotepadCreate(); // NotepadCreate | 
try {
    Notepad result = apiInstance.notepadSearch_0(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadSearch_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NotepadCreate**](NotepadCreate.md)|  | [optional]

### Return type

[**Notepad**](Notepad.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notepadSearch_1"></a>
# **notepadSearch_1**
> Notepad notepadSearch_1(body)



Create a notepad.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
NotepadCreate body = new NotepadCreate(); // NotepadCreate | 
try {
    Notepad result = apiInstance.notepadSearch_1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadSearch_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NotepadCreate**](NotepadCreate.md)|  | [optional]

### Return type

[**Notepad**](Notepad.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notepadUpdate"></a>
# **notepadUpdate**
> Notepad notepadUpdate(id, body)



Update a notepad.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
String id = "id_example"; // String | 
NotepadUpdate body = new NotepadUpdate(); // NotepadUpdate | 
try {
    Notepad result = apiInstance.notepadUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**NotepadUpdate**](NotepadUpdate.md)|  | [optional]

### Return type

[**Notepad**](Notepad.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
