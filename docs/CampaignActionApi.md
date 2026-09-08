# CampaignActionApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignActionCreate**](CampaignActionApi.md#campaignActionCreate) | **POST** /v4/api/campaign-action | 
[**campaignActionDelete**](CampaignActionApi.md#campaignActionDelete) | **DELETE** /v4/api/campaign-action/{id} | 
[**campaignActionGet**](CampaignActionApi.md#campaignActionGet) | **GET** /v4/api/campaign-action/{id} | 
[**campaignActionSearch**](CampaignActionApi.md#campaignActionSearch) | **GET** /v4/api/campaign-action | 
[**campaignActionUpdate**](CampaignActionApi.md#campaignActionUpdate) | **PUT** /v4/api/campaign-action/{id} | 

<a name="campaignActionCreate"></a>
# **campaignActionCreate**
> CampaignAction campaignActionCreate(body)



Create a campaign action.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignActionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignActionApi apiInstance = new CampaignActionApi();
CampaignActionCreate body = new CampaignActionCreate(); // CampaignActionCreate | 
try {
    CampaignAction result = apiInstance.campaignActionCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignActionApi#campaignActionCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignActionCreate**](CampaignActionCreate.md)|  | [optional]

### Return type

[**CampaignAction**](CampaignAction.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignActionDelete"></a>
# **campaignActionDelete**
> campaignActionDelete(id)



Remove a campaign action.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignActionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignActionApi apiInstance = new CampaignActionApi();
String id = "id_example"; // String | 
try {
    apiInstance.campaignActionDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignActionApi#campaignActionDelete");
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

<a name="campaignActionGet"></a>
# **campaignActionGet**
> CampaignAction campaignActionGet(id)



Retrieve a campaign action.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignActionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignActionApi apiInstance = new CampaignActionApi();
String id = "id_example"; // String | 
try {
    CampaignAction result = apiInstance.campaignActionGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignActionApi#campaignActionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CampaignAction**](CampaignAction.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignActionSearch"></a>
# **campaignActionSearch**
> CampaignActionPaginationResponse campaignActionSearch(filter, query, page, perPage, sort)



Search campaign actions.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignActionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignActionApi apiInstance = new CampaignActionApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    CampaignActionPaginationResponse result = apiInstance.campaignActionSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignActionApi#campaignActionSearch");
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

[**CampaignActionPaginationResponse**](CampaignActionPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignActionUpdate"></a>
# **campaignActionUpdate**
> CampaignAction campaignActionUpdate(id, body)



Update a campaign action.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignActionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignActionApi apiInstance = new CampaignActionApi();
String id = "id_example"; // String | 
CampaignActionUpdate body = new CampaignActionUpdate(); // CampaignActionUpdate | 
try {
    CampaignAction result = apiInstance.campaignActionUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignActionApi#campaignActionUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**CampaignActionUpdate**](CampaignActionUpdate.md)|  | [optional]

### Return type

[**CampaignAction**](CampaignAction.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

