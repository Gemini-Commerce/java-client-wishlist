/*
 * Wishlist Service
 * API for managing wishlists
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.WishlistWishlistItemResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Wishlist.JSON;

/**
 * WishlistListWishlistItemsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:50:13.759631386Z[Etc/UTC]")
public class WishlistListWishlistItemsResponse {
  public static final String SERIALIZED_NAME_WISHLIST_ITEMS = "wishlistItems";
  @SerializedName(SERIALIZED_NAME_WISHLIST_ITEMS)
  private List<WishlistWishlistItemResponse> wishlistItems;

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public WishlistListWishlistItemsResponse() {
  }

  public WishlistListWishlistItemsResponse wishlistItems(List<WishlistWishlistItemResponse> wishlistItems) {
    this.wishlistItems = wishlistItems;
    return this;
  }

  public WishlistListWishlistItemsResponse addWishlistItemsItem(WishlistWishlistItemResponse wishlistItemsItem) {
    if (this.wishlistItems == null) {
      this.wishlistItems = new ArrayList<>();
    }
    this.wishlistItems.add(wishlistItemsItem);
    return this;
  }

   /**
   * Get wishlistItems
   * @return wishlistItems
  **/
  @javax.annotation.Nullable
  public List<WishlistWishlistItemResponse> getWishlistItems() {
    return wishlistItems;
  }

  public void setWishlistItems(List<WishlistWishlistItemResponse> wishlistItems) {
    this.wishlistItems = wishlistItems;
  }


  public WishlistListWishlistItemsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Get nextPageToken
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WishlistListWishlistItemsResponse wishlistListWishlistItemsResponse = (WishlistListWishlistItemsResponse) o;
    return Objects.equals(this.wishlistItems, wishlistListWishlistItemsResponse.wishlistItems) &&
        Objects.equals(this.nextPageToken, wishlistListWishlistItemsResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wishlistItems, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishlistListWishlistItemsResponse {\n");
    sb.append("    wishlistItems: ").append(toIndentedString(wishlistItems)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("wishlistItems");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WishlistListWishlistItemsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WishlistListWishlistItemsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WishlistListWishlistItemsResponse is not found in the empty JSON string", WishlistListWishlistItemsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WishlistListWishlistItemsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WishlistListWishlistItemsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("wishlistItems") != null && !jsonObj.get("wishlistItems").isJsonNull()) {
        JsonArray jsonArraywishlistItems = jsonObj.getAsJsonArray("wishlistItems");
        if (jsonArraywishlistItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("wishlistItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `wishlistItems` to be an array in the JSON string but got `%s`", jsonObj.get("wishlistItems").toString()));
          }

          // validate the optional field `wishlistItems` (array)
          for (int i = 0; i < jsonArraywishlistItems.size(); i++) {
            WishlistWishlistItemResponse.validateJsonElement(jsonArraywishlistItems.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WishlistListWishlistItemsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WishlistListWishlistItemsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WishlistListWishlistItemsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WishlistListWishlistItemsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WishlistListWishlistItemsResponse>() {
           @Override
           public void write(JsonWriter out, WishlistListWishlistItemsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WishlistListWishlistItemsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WishlistListWishlistItemsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WishlistListWishlistItemsResponse
  * @throws IOException if the JSON string is invalid with respect to WishlistListWishlistItemsResponse
  */
  public static WishlistListWishlistItemsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WishlistListWishlistItemsResponse.class);
  }

 /**
  * Convert an instance of WishlistListWishlistItemsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

