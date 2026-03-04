# ConsentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consentCreate**](ConsentApi.md#consentCreate) | **POST** /v4/api/consent | 
[**consentDelete**](ConsentApi.md#consentDelete) | **DELETE** /v4/api/consent/{id} | 
[**consentGet**](ConsentApi.md#consentGet) | **GET** /v4/api/consent/{id} | 
[**consentSearch**](ConsentApi.md#consentSearch) | **GET** /v4/api/consent | 
[**consentUpdate**](ConsentApi.md#consentUpdate) | **PUT** /v4/api/consent/{id} | 

<a name="consentCreate"></a>
# **consentCreate**
> Consent consentCreate(body)



Create consent

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ConsentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConsentApi apiInstance = new ConsentApi();
ConsentCreate body = new ConsentCreate(); // ConsentCreate | 
try {
    Consent result = apiInstance.consentCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentApi#consentCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConsentCreate**](ConsentCreate.md)|  | [optional]

### Return type

[**Consent**](Consent.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="consentDelete"></a>
# **consentDelete**
> consentDelete(id)



Remove an consent

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ConsentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConsentApi apiInstance = new ConsentApi();
String id = "id_example"; // String | 
try {
    apiInstance.consentDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentApi#consentDelete");
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

<a name="consentGet"></a>
# **consentGet**
> Consent consentGet(id)



Retrieve an consent

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ConsentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConsentApi apiInstance = new ConsentApi();
String id = "id_example"; // String | 
try {
    Consent result = apiInstance.consentGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentApi#consentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Consent**](Consent.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="consentSearch"></a>
# **consentSearch**
> ConsentPaginationResponse consentSearch(filter, query, page, perPage, sort)



Search consent

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ConsentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConsentApi apiInstance = new ConsentApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ConsentPaginationResponse result = apiInstance.consentSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentApi#consentSearch");
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

[**ConsentPaginationResponse**](ConsentPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="consentUpdate"></a>
# **consentUpdate**
> Consent consentUpdate(id, body)



Update an consent

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ConsentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConsentApi apiInstance = new ConsentApi();
String id = "id_example"; // String | 
ConsentUpdate body = new ConsentUpdate(); // ConsentUpdate | 
try {
    Consent result = apiInstance.consentUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentApi#consentUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**ConsentUpdate**](ConsentUpdate.md)|  | [optional]

### Return type

[**Consent**](Consent.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

