# NotepadApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notepadCreate**](NotepadApi.md#notepadCreate) | **POST** /v4/api/notepad | 
[**notepadGet**](NotepadApi.md#notepadGet) | **GET** /v4/api/notepad/{id} | 
[**notepadSearch**](NotepadApi.md#notepadSearch) | **GET** /v4/api/notepad | 
[**notepadUpdate**](NotepadApi.md#notepadUpdate) | **PUT** /v4/api/notepad/{id} | 

<a name="notepadCreate"></a>
# **notepadCreate**
> Notepad notepadCreate(body)



Create a notepad.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotepadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadApi apiInstance = new NotepadApi();
NotepadCreate body = new NotepadCreate(); // NotepadCreate | 
try {
    Notepad result = apiInstance.notepadCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadApi#notepadCreate");
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

<a name="notepadGet"></a>
# **notepadGet**
> Notepad notepadGet(id)



Retrieve a notepad.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotepadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadApi apiInstance = new NotepadApi();
String id = "id_example"; // String | 
try {
    Notepad result = apiInstance.notepadGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadApi#notepadGet");
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

<a name="notepadSearch"></a>
# **notepadSearch**
> NotepadPaginationResponse notepadSearch(filter, query, page, perPage, sort)



Search notepads.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotepadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadApi apiInstance = new NotepadApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    NotepadPaginationResponse result = apiInstance.notepadSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadApi#notepadSearch");
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

[**NotepadPaginationResponse**](NotepadPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notepadUpdate"></a>
# **notepadUpdate**
> Notepad notepadUpdate(id, body)



Update a notepad.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotepadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadApi apiInstance = new NotepadApi();
String id = "id_example"; // String | 
NotepadUpdate body = new NotepadUpdate(); // NotepadUpdate | 
try {
    Notepad result = apiInstance.notepadUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadApi#notepadUpdate");
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

