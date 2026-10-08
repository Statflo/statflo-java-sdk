# EventApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**events**](EventApi.md#events) | **GET** /v4/api/event | 

<a name="events"></a>
# **events**
> events()



Subscribe to server side events.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EventApi apiInstance = new EventApi();
try {
    apiInstance.events();
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#events");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

