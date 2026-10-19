# AppointmentApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appointmentCreate**](AppointmentApi.md#appointmentCreate) | **POST** /v4/api/appointment | 
[**appointmentDelete**](AppointmentApi.md#appointmentDelete) | **DELETE** /v4/api/appointment/{id} | 
[**appointmentGet**](AppointmentApi.md#appointmentGet) | **GET** /v4/api/appointment/{id} | 
[**appointmentSearch**](AppointmentApi.md#appointmentSearch) | **GET** /v4/api/appointment | 
[**appointmentUpdate**](AppointmentApi.md#appointmentUpdate) | **PUT** /v4/api/appointment/{id} | 

<a name="appointmentCreate"></a>
# **appointmentCreate**
> Appointment appointmentCreate(body)



Create an appointment.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AppointmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AppointmentApi apiInstance = new AppointmentApi();
AppointmentCreate body = new AppointmentCreate(); // AppointmentCreate | 
try {
    Appointment result = apiInstance.appointmentCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#appointmentCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppointmentCreate**](AppointmentCreate.md)|  | [optional]

### Return type

[**Appointment**](Appointment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appointmentDelete"></a>
# **appointmentDelete**
> appointmentDelete(id)



Delete an appointment.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AppointmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AppointmentApi apiInstance = new AppointmentApi();
String id = "id_example"; // String | 
try {
    apiInstance.appointmentDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#appointmentDelete");
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

<a name="appointmentGet"></a>
# **appointmentGet**
> Appointment appointmentGet(id)



Retrieve an appointment.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AppointmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AppointmentApi apiInstance = new AppointmentApi();
String id = "id_example"; // String | 
try {
    Appointment result = apiInstance.appointmentGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#appointmentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Appointment**](Appointment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appointmentSearch"></a>
# **appointmentSearch**
> AppointmentPaginationResponse appointmentSearch(filter, query, page, perPage, sort)



Search appointments.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AppointmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AppointmentApi apiInstance = new AppointmentApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    AppointmentPaginationResponse result = apiInstance.appointmentSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#appointmentSearch");
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

[**AppointmentPaginationResponse**](AppointmentPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appointmentUpdate"></a>
# **appointmentUpdate**
> Appointment appointmentUpdate(id, body)



Update an appointment.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AppointmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AppointmentApi apiInstance = new AppointmentApi();
String id = "id_example"; // String | 
AppointmentUpdate body = new AppointmentUpdate(); // AppointmentUpdate | 
try {
    Appointment result = apiInstance.appointmentUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#appointmentUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**AppointmentUpdate**](AppointmentUpdate.md)|  | [optional]

### Return type

[**Appointment**](Appointment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

