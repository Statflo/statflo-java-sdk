# AppointmentLocationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appointmentLocationCreate**](AppointmentLocationApi.md#appointmentLocationCreate) | **POST** /v4/api/appointment-location | 
[**appointmentLocationDelete**](AppointmentLocationApi.md#appointmentLocationDelete) | **DELETE** /v4/api/appointment-location/{id} | 
[**appointmentLocationGet**](AppointmentLocationApi.md#appointmentLocationGet) | **GET** /v4/api/appointment-location/{id} | 
[**appointmentLocationSearch**](AppointmentLocationApi.md#appointmentLocationSearch) | **GET** /v4/api/appointment-location | 
[**appointmentLocationUpdate**](AppointmentLocationApi.md#appointmentLocationUpdate) | **PUT** /v4/api/appointment-location/{id} | 

<a name="appointmentLocationCreate"></a>
# **appointmentLocationCreate**
> AppointmentLocation appointmentLocationCreate(body)



Create an appointment location.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AppointmentLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AppointmentLocationApi apiInstance = new AppointmentLocationApi();
AppointmentLocationCreate body = new AppointmentLocationCreate(); // AppointmentLocationCreate | 
try {
    AppointmentLocation result = apiInstance.appointmentLocationCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentLocationApi#appointmentLocationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentLocationCreate**](AppointmentLocationCreate.md)|  | [optional]

### Return type

[**AppointmentLocation**](AppointmentLocation.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appointmentLocationDelete"></a>
# **appointmentLocationDelete**
> appointmentLocationDelete(id)



Delete an appointment location.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AppointmentLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AppointmentLocationApi apiInstance = new AppointmentLocationApi();
String id = "id_example"; // String | 
try {
    apiInstance.appointmentLocationDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentLocationApi#appointmentLocationDelete");
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

<a name="appointmentLocationGet"></a>
# **appointmentLocationGet**
> AppointmentLocation appointmentLocationGet(id)



Retrieve an appointment location.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AppointmentLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AppointmentLocationApi apiInstance = new AppointmentLocationApi();
String id = "id_example"; // String | 
try {
    AppointmentLocation result = apiInstance.appointmentLocationGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentLocationApi#appointmentLocationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**AppointmentLocation**](AppointmentLocation.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appointmentLocationSearch"></a>
# **appointmentLocationSearch**
> AppointmentLocationPaginationResponse appointmentLocationSearch(filter, query, page, perPage, sort)



Search appointment locations.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AppointmentLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AppointmentLocationApi apiInstance = new AppointmentLocationApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    AppointmentLocationPaginationResponse result = apiInstance.appointmentLocationSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentLocationApi#appointmentLocationSearch");
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

[**AppointmentLocationPaginationResponse**](AppointmentLocationPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appointmentLocationUpdate"></a>
# **appointmentLocationUpdate**
> AppointmentLocation appointmentLocationUpdate(id, body)



Update an appointment location.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AppointmentLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AppointmentLocationApi apiInstance = new AppointmentLocationApi();
String id = "id_example"; // String | 
AppointmentLocationUpdate body = new AppointmentLocationUpdate(); // AppointmentLocationUpdate | 
try {
    AppointmentLocation result = apiInstance.appointmentLocationUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentLocationApi#appointmentLocationUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**AppointmentLocationUpdate**](AppointmentLocationUpdate.md)|  | [optional]

### Return type

[**AppointmentLocation**](AppointmentLocation.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

