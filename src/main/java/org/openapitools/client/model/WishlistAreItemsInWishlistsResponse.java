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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.WishlistAreItemsInWishlistsResponsePayload;

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
 * WishlistAreItemsInWishlistsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:50:13.759631386Z[Etc/UTC]")
public class WishlistAreItemsInWishlistsResponse {
  public static final String SERIALIZED_NAME_ITEM_GRN_MAP = "itemGrnMap";
  @SerializedName(SERIALIZED_NAME_ITEM_GRN_MAP)
  private Map<String, WishlistAreItemsInWishlistsResponsePayload> itemGrnMap = new HashMap<>();

  public WishlistAreItemsInWishlistsResponse() {
  }

  public WishlistAreItemsInWishlistsResponse itemGrnMap(Map<String, WishlistAreItemsInWishlistsResponsePayload> itemGrnMap) {
    this.itemGrnMap = itemGrnMap;
    return this;
  }

  public WishlistAreItemsInWishlistsResponse putItemGrnMapItem(String key, WishlistAreItemsInWishlistsResponsePayload itemGrnMapItem) {
    if (this.itemGrnMap == null) {
      this.itemGrnMap = new HashMap<>();
    }
    this.itemGrnMap.put(key, itemGrnMapItem);
    return this;
  }

   /**
   * Get itemGrnMap
   * @return itemGrnMap
  **/
  @javax.annotation.Nullable
  public Map<String, WishlistAreItemsInWishlistsResponsePayload> getItemGrnMap() {
    return itemGrnMap;
  }

  public void setItemGrnMap(Map<String, WishlistAreItemsInWishlistsResponsePayload> itemGrnMap) {
    this.itemGrnMap = itemGrnMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WishlistAreItemsInWishlistsResponse wishlistAreItemsInWishlistsResponse = (WishlistAreItemsInWishlistsResponse) o;
    return Objects.equals(this.itemGrnMap, wishlistAreItemsInWishlistsResponse.itemGrnMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemGrnMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishlistAreItemsInWishlistsResponse {\n");
    sb.append("    itemGrnMap: ").append(toIndentedString(itemGrnMap)).append("\n");
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
    openapiFields.add("itemGrnMap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WishlistAreItemsInWishlistsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WishlistAreItemsInWishlistsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WishlistAreItemsInWishlistsResponse is not found in the empty JSON string", WishlistAreItemsInWishlistsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WishlistAreItemsInWishlistsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WishlistAreItemsInWishlistsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WishlistAreItemsInWishlistsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WishlistAreItemsInWishlistsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WishlistAreItemsInWishlistsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WishlistAreItemsInWishlistsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WishlistAreItemsInWishlistsResponse>() {
           @Override
           public void write(JsonWriter out, WishlistAreItemsInWishlistsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WishlistAreItemsInWishlistsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WishlistAreItemsInWishlistsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WishlistAreItemsInWishlistsResponse
  * @throws IOException if the JSON string is invalid with respect to WishlistAreItemsInWishlistsResponse
  */
  public static WishlistAreItemsInWishlistsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WishlistAreItemsInWishlistsResponse.class);
  }

 /**
  * Convert an instance of WishlistAreItemsInWishlistsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

