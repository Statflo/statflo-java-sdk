# CampaignMetadataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignMetadataCreate**](CampaignMetadataApi.md#campaignMetadataCreate) | **POST** /v4/api/campaign-metadata | 
[**campaignMetadataDelete**](CampaignMetadataApi.md#campaignMetadataDelete) | **DELETE** /v4/api/campaign-metadata/{id} | 
[**campaignMetadataGet**](CampaignMetadataApi.md#campaignMetadataGet) | **GET** /v4/api/campaign-metadata/{id} | 
[**campaignMetadataSearch**](CampaignMetadataApi.md#campaignMetadataSearch) | **GET** /v4/api/campaign-metadata | 
[**campaignMetadataUpdate**](CampaignMetadataApi.md#campaignMetadataUpdate) | **PUT** /v4/api/campaign-metadata/{id} | 

<a name="campaignMetadataCreate"></a>
# **campaignMetadataCreate**
> CampaignMetadata campaignMetadataCreate(body)



Create a campaign metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMetadataApi apiInstance = new CampaignMetadataApi();
CampaignMetadataCreate body = new CampaignMetadataCreate(); // CampaignMetadataCreate | 
try {
    CampaignMetadata result = apiInstance.campaignMetadataCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMetadataApi#campaignMetadataCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignMetadataCreate**](CampaignMetadataCreate.md)|  | [optional]

### Return type

[**CampaignMetadata**](CampaignMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignMetadataDelete"></a>
# **campaignMetadataDelete**
> campaignMetadataDelete(id)



Remove a campaign metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMetadataApi apiInstance = new CampaignMetadataApi();
String id = "id_example"; // String | 
try {
    apiInstance.campaignMetadataDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMetadataApi#campaignMetadataDelete");
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
 - **Accept**: Not defined

<a name="campaignMetadataGet"></a>
# **campaignMetadataGet**
> CampaignMetadata campaignMetadataGet(id)



Retrieve a campaign metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMetadataApi apiInstance = new CampaignMetadataApi();
String id = "id_example"; // String | 
try {
    CampaignMetadata result = apiInstance.campaignMetadataGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMetadataApi#campaignMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CampaignMetadata**](CampaignMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignMetadataSearch"></a>
# **campaignMetadataSearch**
> CampaignMetadataPaginationResponse campaignMetadataSearch(filter, query, page, perPage, sort)



Search campaign metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMetadataApi apiInstance = new CampaignMetadataApi();
List<String> filter = Arrays.asList("filter_example"); // List<String> | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    CampaignMetadataPaginationResponse result = apiInstance.campaignMetadataSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMetadataApi#campaignMetadataSearch");
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

[**CampaignMetadataPaginationResponse**](CampaignMetadataPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignMetadataUpdate"></a>
# **campaignMetadataUpdate**
> CampaignMetadata campaignMetadataUpdate(id, body)



Update a campaign metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMetadataApi apiInstance = new CampaignMetadataApi();
String id = "id_example"; // String | 
CampaignMetadataUpdate body = new CampaignMetadataUpdate(); // CampaignMetadataUpdate | 
try {
    CampaignMetadata result = apiInstance.campaignMetadataUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMetadataApi#campaignMetadataUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**CampaignMetadataUpdate**](CampaignMetadataUpdate.md)|  | [optional]

### Return type

[**CampaignMetadata**](CampaignMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
