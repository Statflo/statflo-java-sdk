# CampaignMappingApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignMappingDelete**](CampaignMappingApi.md#campaignMappingDelete) | **DELETE** /v4/api/campaign-mapping/{id} | 
[**campaignMappingSearch**](CampaignMappingApi.md#campaignMappingSearch) | **GET** /v4/api/campaign-mapping | 

<a name="campaignMappingDelete"></a>
# **campaignMappingDelete**
> campaignMappingDelete(id)



Remove a campaign mapping.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignMappingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMappingApi apiInstance = new CampaignMappingApi();
String id = "id_example"; // String | 
try {
    apiInstance.campaignMappingDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMappingApi#campaignMappingDelete");
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

<a name="campaignMappingSearch"></a>
# **campaignMappingSearch**
> CampaignMappingPaginationResponse campaignMappingSearch(filter, query, page, perPage, sort)



Search campaign mapping.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignMappingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMappingApi apiInstance = new CampaignMappingApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    CampaignMappingPaginationResponse result = apiInstance.campaignMappingSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMappingApi#campaignMappingSearch");
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

[**CampaignMappingPaginationResponse**](CampaignMappingPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

