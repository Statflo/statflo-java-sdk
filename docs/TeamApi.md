# TeamApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamCreate**](TeamApi.md#teamCreate) | **POST** /v4/api/team | 
[**teamDelete**](TeamApi.md#teamDelete) | **DELETE** /v4/api/team/{id} | 
[**teamGet**](TeamApi.md#teamGet) | **GET** /v4/api/team/{id} | 
[**teamSearch**](TeamApi.md#teamSearch) | **GET** /v4/api/team | 
[**teamUpdate**](TeamApi.md#teamUpdate) | **PUT** /v4/api/team/{id} | 

<a name="teamCreate"></a>
# **teamCreate**
> Team teamCreate(body)



Create a team.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeamApi apiInstance = new TeamApi();
TeamCreate body = new TeamCreate(); // TeamCreate | 
try {
    Team result = apiInstance.teamCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TeamCreate**](TeamCreate.md)|  | [optional]

### Return type

[**Team**](Team.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamDelete"></a>
# **teamDelete**
> teamDelete(id)



Remove a team.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeamApi apiInstance = new TeamApi();
String id = "id_example"; // String | 
try {
    apiInstance.teamDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamDelete");
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

<a name="teamGet"></a>
# **teamGet**
> Team teamGet(id)



Retrieve a team.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeamApi apiInstance = new TeamApi();
String id = "id_example"; // String | 
try {
    Team result = apiInstance.teamGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Team**](Team.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamSearch"></a>
# **teamSearch**
> TeamPaginationResponse teamSearch(filter, query, page, perPage, sort)



Search teams.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeamApi apiInstance = new TeamApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    TeamPaginationResponse result = apiInstance.teamSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamSearch");
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

[**TeamPaginationResponse**](TeamPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamUpdate"></a>
# **teamUpdate**
> Team teamUpdate(id, body)



Update a team.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TeamApi apiInstance = new TeamApi();
String id = "id_example"; // String | 
TeamUpdate body = new TeamUpdate(); // TeamUpdate | 
try {
    Team result = apiInstance.teamUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**TeamUpdate**](TeamUpdate.md)|  | [optional]

### Return type

[**Team**](Team.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

