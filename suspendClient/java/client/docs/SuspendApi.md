# SuspendApi

All URIs are relative to */aristo/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTempSuspence**](SuspendApi.md#createTempSuspence) | **POST** /suspend/temp/{accountId} | Create temp suspense txn |


<a name="createTempSuspence"></a>
# **createTempSuspence**
> GetTempSusupenseResponse createTempSuspence(accountId, body)

Create temp suspense txn

Availability: * Internal: Yes * External: No * Core: Yes  Overview:  Create temporary suspence transactions Headers: For internal authentication use:     1. X-NYT-LDAP, X-NYT-CLIENT-ID, X-NYT-CLIENT-SECRET (The most preferable way)     2. X-NYT-LDAP, X-NYT-AUTHORIZATION For external authentication use:     1. COOKIE, X-NYT-SARTRE-TOKEN, CONTENT-TYPE 

### Example
```java
// Import classes:
import com.nytimes.spg.suspendClient.client.ApiClient;
import com.nytimes.spg.suspendClient.client.ApiException;
import com.nytimes.spg.suspendClient.client.Configuration;
import com.nytimes.spg.suspendClient.client.models.*;
import com.nytimes.spg.suspendClient.client.api.SuspendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/aristo/v1");

    SuspendApi apiInstance = new SuspendApi(defaultClient);
    String accountId = "accountId_example"; // String | The account id
    CreateTempSusupenseCommand body = new CreateTempSusupenseCommand(); // CreateTempSusupenseCommand | 
    try {
      GetTempSusupenseResponse result = apiInstance.createTempSuspence(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuspendApi#createTempSuspence");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| The account id | |
| **body** | [**CreateTempSusupenseCommand**](CreateTempSusupenseCommand.md)|  | |

### Return type

[**GetTempSusupenseResponse**](GetTempSusupenseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Request parameters bad |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | [Unknown URI mapping] [Error in request]  |  -  |
| **412** | Precondition Failed |  -  |
| **499** | Reauth Required |  -  |
| **500** | [Error communicating with external service] [Error communicating to Aristo] [Internal server error]  |  -  |

