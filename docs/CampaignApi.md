# CampaignApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignDelete**](CampaignApi.md#campaignDelete) | **DELETE** /v4/api/campaign/{id} | 

<a name="campaignDelete"></a>
# **campaignDelete**
> campaignDelete(id)



Remove a campaign.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignApi apiInstance = new CampaignApi();
String id = "id_example"; // String | 
try {
    apiInstance.campaignDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#campaignDelete");
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

