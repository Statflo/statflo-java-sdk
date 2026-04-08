# WidgetsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV4ApiWidgetsCampaigns**](WidgetsApi.md#getV4ApiWidgetsCampaigns) | **GET** /v4/api/widgets/campaigns/{accountId} | 

<a name="getV4ApiWidgetsCampaigns"></a>
# **getV4ApiWidgetsCampaigns**
> getV4ApiWidgetsCampaigns(accountId)



### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetsApi apiInstance = new WidgetsApi();
String accountId = "accountId_example"; // String | 
try {
    apiInstance.getV4ApiWidgetsCampaigns(accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getV4ApiWidgetsCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

