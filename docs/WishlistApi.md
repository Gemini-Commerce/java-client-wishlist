# WishlistApi

All URIs are relative to *https://wishlist.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**wishlistAddItemToWishlist**](WishlistApi.md#wishlistAddItemToWishlist) | **POST** /wishlist.Wishlist/AddItemToWishlist |  |
| [**wishlistAreItemsInWishlists**](WishlistApi.md#wishlistAreItemsInWishlists) | **POST** /wishlist.Wishlist/AreItemsInWishlists |  |
| [**wishlistBulkCreateSharing**](WishlistApi.md#wishlistBulkCreateSharing) | **POST** /wishlist.Wishlist/BulkCreateSharing | Sharing endpoints |
| [**wishlistBulkRemoveItemsFromWishlists**](WishlistApi.md#wishlistBulkRemoveItemsFromWishlists) | **POST** /wishlist.Wishlist/BulkRemoveItemsFromWishlists | BulkRemoveItemsFromWishlists removes items from wishlists. |
| [**wishlistBulkRevokeSharing**](WishlistApi.md#wishlistBulkRevokeSharing) | **POST** /wishlist.Wishlist/BulkRevokeSharing |  |
| [**wishlistCreateWishlist**](WishlistApi.md#wishlistCreateWishlist) | **POST** /wishlist.Wishlist/CreateWishlist |  |
| [**wishlistDeleteWishlist**](WishlistApi.md#wishlistDeleteWishlist) | **POST** /wishlist.Wishlist/DeleteWishlist |  |
| [**wishlistGetItemFromWishlist**](WishlistApi.md#wishlistGetItemFromWishlist) | **POST** /wishlist.Wishlist/GetItemFromWishlist |  |
| [**wishlistGetWishlistById**](WishlistApi.md#wishlistGetWishlistById) | **POST** /wishlist.Wishlist/GetWishlistById |  |
| [**wishlistGetWishlistBySharedCode**](WishlistApi.md#wishlistGetWishlistBySharedCode) | **POST** /wishlist.Wishlist/GetWishlistBySharedCode |  |
| [**wishlistListWishlistItems**](WishlistApi.md#wishlistListWishlistItems) | **POST** /wishlist.Wishlist/ListWishlistItems |  |
| [**wishlistListWishlists**](WishlistApi.md#wishlistListWishlists) | **POST** /wishlist.Wishlist/ListWishlists |  |
| [**wishlistMergeWishlists**](WishlistApi.md#wishlistMergeWishlists) | **POST** /wishlist.Wishlist/MergeWishlists |  |
| [**wishlistRemoveItemFromWishlist**](WishlistApi.md#wishlistRemoveItemFromWishlist) | **POST** /wishlist.Wishlist/RemoveItemFromWishlist |  |
| [**wishlistUpdateItemInWishlist**](WishlistApi.md#wishlistUpdateItemInWishlist) | **POST** /wishlist.Wishlist/UpdateItemInWishlist |  |
| [**wishlistUpdateWishlist**](WishlistApi.md#wishlistUpdateWishlist) | **POST** /wishlist.Wishlist/UpdateWishlist |  |


<a id="wishlistAddItemToWishlist"></a>
# **wishlistAddItemToWishlist**
> WishlistWishlistItemResponse wishlistAddItemToWishlist(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistAddItemToWishlistRequest body = new WishlistAddItemToWishlistRequest(); // WishlistAddItemToWishlistRequest | 
    try {
      WishlistWishlistItemResponse result = apiInstance.wishlistAddItemToWishlist(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistAddItemToWishlist");
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
| **body** | [**WishlistAddItemToWishlistRequest**](WishlistAddItemToWishlistRequest.md)|  | |

### Return type

[**WishlistWishlistItemResponse**](WishlistWishlistItemResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistAreItemsInWishlists"></a>
# **wishlistAreItemsInWishlists**
> WishlistAreItemsInWishlistsResponse wishlistAreItemsInWishlists(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistAreItemsInWishlistsRequest body = new WishlistAreItemsInWishlistsRequest(); // WishlistAreItemsInWishlistsRequest | 
    try {
      WishlistAreItemsInWishlistsResponse result = apiInstance.wishlistAreItemsInWishlists(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistAreItemsInWishlists");
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
| **body** | [**WishlistAreItemsInWishlistsRequest**](WishlistAreItemsInWishlistsRequest.md)|  | |

### Return type

[**WishlistAreItemsInWishlistsResponse**](WishlistAreItemsInWishlistsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistBulkCreateSharing"></a>
# **wishlistBulkCreateSharing**
> WishlistBulkCreateSharingResponse wishlistBulkCreateSharing(body)

Sharing endpoints

### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistBulkCreateSharingRequest body = new WishlistBulkCreateSharingRequest(); // WishlistBulkCreateSharingRequest | 
    try {
      WishlistBulkCreateSharingResponse result = apiInstance.wishlistBulkCreateSharing(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistBulkCreateSharing");
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
| **body** | [**WishlistBulkCreateSharingRequest**](WishlistBulkCreateSharingRequest.md)|  | |

### Return type

[**WishlistBulkCreateSharingResponse**](WishlistBulkCreateSharingResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistBulkRemoveItemsFromWishlists"></a>
# **wishlistBulkRemoveItemsFromWishlists**
> Object wishlistBulkRemoveItemsFromWishlists(body)

BulkRemoveItemsFromWishlists removes items from wishlists.

### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistBulkRemoveItemsFromWishlistsRequest body = new WishlistBulkRemoveItemsFromWishlistsRequest(); // WishlistBulkRemoveItemsFromWishlistsRequest | 
    try {
      Object result = apiInstance.wishlistBulkRemoveItemsFromWishlists(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistBulkRemoveItemsFromWishlists");
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
| **body** | [**WishlistBulkRemoveItemsFromWishlistsRequest**](WishlistBulkRemoveItemsFromWishlistsRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistBulkRevokeSharing"></a>
# **wishlistBulkRevokeSharing**
> Object wishlistBulkRevokeSharing(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistBulkRevokeSharingRequest body = new WishlistBulkRevokeSharingRequest(); // WishlistBulkRevokeSharingRequest | 
    try {
      Object result = apiInstance.wishlistBulkRevokeSharing(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistBulkRevokeSharing");
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
| **body** | [**WishlistBulkRevokeSharingRequest**](WishlistBulkRevokeSharingRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistCreateWishlist"></a>
# **wishlistCreateWishlist**
> WishlistWishlistResponse wishlistCreateWishlist(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistCreateWishlistRequest body = new WishlistCreateWishlistRequest(); // WishlistCreateWishlistRequest | 
    try {
      WishlistWishlistResponse result = apiInstance.wishlistCreateWishlist(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistCreateWishlist");
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
| **body** | [**WishlistCreateWishlistRequest**](WishlistCreateWishlistRequest.md)|  | |

### Return type

[**WishlistWishlistResponse**](WishlistWishlistResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistDeleteWishlist"></a>
# **wishlistDeleteWishlist**
> Object wishlistDeleteWishlist(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistDeleteWishlistRequest body = new WishlistDeleteWishlistRequest(); // WishlistDeleteWishlistRequest | 
    try {
      Object result = apiInstance.wishlistDeleteWishlist(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistDeleteWishlist");
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
| **body** | [**WishlistDeleteWishlistRequest**](WishlistDeleteWishlistRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistGetItemFromWishlist"></a>
# **wishlistGetItemFromWishlist**
> WishlistWishlistItemResponse wishlistGetItemFromWishlist(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistGetItemFromWishlistRequest body = new WishlistGetItemFromWishlistRequest(); // WishlistGetItemFromWishlistRequest | 
    try {
      WishlistWishlistItemResponse result = apiInstance.wishlistGetItemFromWishlist(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistGetItemFromWishlist");
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
| **body** | [**WishlistGetItemFromWishlistRequest**](WishlistGetItemFromWishlistRequest.md)|  | |

### Return type

[**WishlistWishlistItemResponse**](WishlistWishlistItemResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistGetWishlistById"></a>
# **wishlistGetWishlistById**
> WishlistWishlistResponse wishlistGetWishlistById(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistGetWishlistByIdRequest body = new WishlistGetWishlistByIdRequest(); // WishlistGetWishlistByIdRequest | 
    try {
      WishlistWishlistResponse result = apiInstance.wishlistGetWishlistById(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistGetWishlistById");
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
| **body** | [**WishlistGetWishlistByIdRequest**](WishlistGetWishlistByIdRequest.md)|  | |

### Return type

[**WishlistWishlistResponse**](WishlistWishlistResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistGetWishlistBySharedCode"></a>
# **wishlistGetWishlistBySharedCode**
> WishlistWishlistResponse wishlistGetWishlistBySharedCode(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistGetWishlistBySharedCodeRequest body = new WishlistGetWishlistBySharedCodeRequest(); // WishlistGetWishlistBySharedCodeRequest | 
    try {
      WishlistWishlistResponse result = apiInstance.wishlistGetWishlistBySharedCode(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistGetWishlistBySharedCode");
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
| **body** | [**WishlistGetWishlistBySharedCodeRequest**](WishlistGetWishlistBySharedCodeRequest.md)|  | |

### Return type

[**WishlistWishlistResponse**](WishlistWishlistResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistListWishlistItems"></a>
# **wishlistListWishlistItems**
> WishlistListWishlistItemsResponse wishlistListWishlistItems(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistListWishlistItemsRequest body = new WishlistListWishlistItemsRequest(); // WishlistListWishlistItemsRequest | 
    try {
      WishlistListWishlistItemsResponse result = apiInstance.wishlistListWishlistItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistListWishlistItems");
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
| **body** | [**WishlistListWishlistItemsRequest**](WishlistListWishlistItemsRequest.md)|  | |

### Return type

[**WishlistListWishlistItemsResponse**](WishlistListWishlistItemsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistListWishlists"></a>
# **wishlistListWishlists**
> WishlistListWishlistsResponse wishlistListWishlists(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistListWishlistsRequest body = new WishlistListWishlistsRequest(); // WishlistListWishlistsRequest | 
    try {
      WishlistListWishlistsResponse result = apiInstance.wishlistListWishlists(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistListWishlists");
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
| **body** | [**WishlistListWishlistsRequest**](WishlistListWishlistsRequest.md)|  | |

### Return type

[**WishlistListWishlistsResponse**](WishlistListWishlistsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistMergeWishlists"></a>
# **wishlistMergeWishlists**
> WishlistWishlistResponse wishlistMergeWishlists(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistMergeWishlistsRequest body = new WishlistMergeWishlistsRequest(); // WishlistMergeWishlistsRequest | 
    try {
      WishlistWishlistResponse result = apiInstance.wishlistMergeWishlists(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistMergeWishlists");
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
| **body** | [**WishlistMergeWishlistsRequest**](WishlistMergeWishlistsRequest.md)|  | |

### Return type

[**WishlistWishlistResponse**](WishlistWishlistResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistRemoveItemFromWishlist"></a>
# **wishlistRemoveItemFromWishlist**
> Object wishlistRemoveItemFromWishlist(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistRemoveItemFromWishlistRequest body = new WishlistRemoveItemFromWishlistRequest(); // WishlistRemoveItemFromWishlistRequest | 
    try {
      Object result = apiInstance.wishlistRemoveItemFromWishlist(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistRemoveItemFromWishlist");
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
| **body** | [**WishlistRemoveItemFromWishlistRequest**](WishlistRemoveItemFromWishlistRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistUpdateItemInWishlist"></a>
# **wishlistUpdateItemInWishlist**
> WishlistWishlistItemResponse wishlistUpdateItemInWishlist(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistUpdateItemInWishlistRequest body = new WishlistUpdateItemInWishlistRequest(); // WishlistUpdateItemInWishlistRequest | 
    try {
      WishlistWishlistItemResponse result = apiInstance.wishlistUpdateItemInWishlist(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistUpdateItemInWishlist");
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
| **body** | [**WishlistUpdateItemInWishlistRequest**](WishlistUpdateItemInWishlistRequest.md)|  | |

### Return type

[**WishlistWishlistItemResponse**](WishlistWishlistItemResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="wishlistUpdateWishlist"></a>
# **wishlistUpdateWishlist**
> WishlistWishlistResponse wishlistUpdateWishlist(body)



### Example
```java
// Import classes:
import GeminiCommerce_Wishlist.ApiClient;
import GeminiCommerce_Wishlist.ApiException;
import GeminiCommerce_Wishlist.Configuration;
import GeminiCommerce_Wishlist.auth.*;
import GeminiCommerce_Wishlist.models.*;
import org.openapitools.client.api.WishlistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://wishlist.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    WishlistUpdateWishlistRequest body = new WishlistUpdateWishlistRequest(); // WishlistUpdateWishlistRequest | 
    try {
      WishlistWishlistResponse result = apiInstance.wishlistUpdateWishlist(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#wishlistUpdateWishlist");
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
| **body** | [**WishlistUpdateWishlistRequest**](WishlistUpdateWishlistRequest.md)|  | |

### Return type

[**WishlistWishlistResponse**](WishlistWishlistResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

