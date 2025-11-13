# BulkRequestsApi

All URIs are relative to *https://app.test.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkRequest**](BulkRequestsApi.md#bulkRequest) | **POST** /v4/api/bulk | 

<a name="bulkRequest"></a>
# **bulkRequest**
> List&lt;Object&gt; bulkRequest(body)



Submit multiple requests in bulk.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.BulkRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


BulkRequestsApi apiInstance = new BulkRequestsApi();
List<BulkSubRequest> body = Arrays.asList(new BulkSubRequest()); // List<BulkSubRequest> | 
try {
    List<Object> result = apiInstance.bulkRequest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkRequestsApi#bulkRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;BulkSubRequest&gt;**](BulkSubRequest.md)|  |

### Return type

**List&lt;Object&gt;**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

